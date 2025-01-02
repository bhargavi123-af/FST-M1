
user_input = input("Enter numbers for the tuple, separated by spaces: ")

numbers_tuple = tuple(map(int, user_input.split()))

print("Numbers divisible by 5:")
for num in numbers_tuple:
    if num % 5 == 0:
        print(num)
