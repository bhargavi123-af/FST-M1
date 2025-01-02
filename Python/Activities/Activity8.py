
user_input = input("Enter the elements of the list, separated by spaces: ")


numbers = list(map(int, user_input.split()))


if numbers[0] == numbers[-1]:
    print("True")
else:
    print("False")
