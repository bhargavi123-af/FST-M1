
user_input = input("Enter the elements of the list, separated by spaces: ")


numbers = list(map(int, user_input.split()))


total_sum = sum(numbers)


print(f"The sum of all the elements in the list is: {total_sum}")
