fruit_prices = {
    'apple': 1.2,
    'banana': 0.5,
    'orange': 0.8,
    'mango': 1.5,
    'grapes': 2.0,
    'kiwi': 1.8,
    'watermelon': 3.0
}

def check_fruit_availability(fruit_name):
    if fruit_name.lower() in fruit_prices:
        print(f"The fruit '{fruit_name}' is available at ${fruit_prices[fruit_name.lower()]}")
    else:
        print(f"The fruit '{fruit_name}' is not available.")


fruit_to_check = input("Enter the fruit you want to check: ")
check_fruit_availability(fruit_to_check)
