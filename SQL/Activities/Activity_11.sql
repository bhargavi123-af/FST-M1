-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

CREATE TABLE salesmen (
    salesman_id INT PRIMARY KEY,
    salesman_name VARCHAR(32),
    city VARCHAR(20),
    commission DECIMAL(5, 2)
);

-- Insert values into salesmen table
INSERT INTO salesmen VALUES (5001, 'John Smith', 'New York', 0.15);
INSERT INTO salesmen VALUES (5002, 'Mary Johnson', 'California', 0.20);
INSERT INTO salesmen VALUES (5003, 'Robert Brown', 'Berlin', 0.25);
INSERT INTO salesmen VALUES (5005, 'Michael Davis', 'London', 0.18);
INSERT INTO salesmen VALUES (5006, 'William Wilson', 'Paris', 0.22);
INSERT INTO salesmen VALUES (5007, 'David Miller', 'Moscow', 0.12);


select * from customers;

select * from salesmen;

SELECT a.customer_name AS "Customer Name", a.city, a.customer_id, a.grade, b.salesman_name AS "Salesmen", b.commission, b.salesman_id FROM customers a 
INNER JOIN salesmen b ON a.salesman_id=b.salesman_id
order by salesman_id;

select a.customer_name AS "Customer Name", a.city, a.grade, a.customer_id, b.salesman_name AS "Salesman", b.salesman_id, b.city FROM customers a 
LEFT OUTER JOIN salesmen b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id asc;

select a.customer_name AS "Customer Name", a.city, a.grade, a.customer_id, b.salesman_name AS "Salesman", b.salesman_id, b.commission FROM customers a 
RIGHT OUTER JOIN salesmen b ON a.salesman_id=b.salesman_id WHERE b.commission > 0.12
ORDER BY b.commission asc;

-- Create a table named orders
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

-- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;

select * from orders;

SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesmen a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, o.order_no, 'highest on', o.order_date, o.purchase_amount FROM salesmen a, orders o
WHERE a.salesman_id=o.salesman_id
AND o.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = o.order_date)
UNION
SELECT a.salesman_id, a.salesman_name, o.order_no, 'lowest on', o.order_date, o.purchase_amount FROM salesmen a, orders o
WHERE a.salesman_id=o.salesman_id











