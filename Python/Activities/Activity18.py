import pandas as pd

df = pd.read_csv('user_credentials.csv')


print("Usernames column:")
print(df['Usernames'])
print()


second_row = df.iloc[1]  
print("Username and Password of the second row:")
print(f"Username: {second_row['Usernames']}, Password: {second_row['Passwords']}")
print()


sorted_usernames = df.sort_values("Usernames", ascending=True)
print("Usernames sorted in ascending order:")
print(sorted_usernames['Usernames'])
print()


sorted_passwords = df.sort_values("Passwords", ascending=False)
print("Passwords sorted in descending order:")
print(sorted_passwords['Passwords'])
