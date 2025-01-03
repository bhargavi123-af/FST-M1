
def sum_of_elements(lst):
    total = 0  
    for element in lst:
        total += element  
    return total


elements = [11, 22, 33, 44, 55, 66]
result = sum_of_elements(elements)
print(f"The sum of the elements is: {result}")
