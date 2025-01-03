import pandas as pd


df = pd.read_excel('user_data.xlsx')

rows, columns = df.shape
print(f"Number of rows: {rows}")
print(f"Number of columns: {columns}")
print()


print("Emails column:")
print(df['Email'])
print()


sorted_df = df.sort_values('FirstName', ascending=True)
print("Data sorted by FirstName in ascending order:")
print(sorted_df)
