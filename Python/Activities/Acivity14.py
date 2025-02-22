
def generate_fibonacci(n):
    fibonacci_sequence = []
    a, b = 0, 1  

    for _ in range(n):
        fibonacci_sequence.append(a)  
        a, b = b, a + b  

    return fibonacci_sequence


num = int(input("How many Fibonacci numbers would you like to generate? "))


fib_sequence = generate_fibonacci(num)
print(f"The first {num} Fibonacci numbers are: {fib_sequence}")
