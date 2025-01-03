import pandas as pd


data = {
    'Usernames': ['admin', 'Charles', 'Deku'],
    'Passwords': ['password', 'Charl13', 'AllMight']
}

df = pd.DataFrame(data)


df.to_csv('user_credentials.csv', index=False)

print("Data has been written to 'user_credentials.csv'")
