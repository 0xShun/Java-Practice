import pandas as pd

# Data dictionary for the complete cleaned dataset (11 rows)
data = {
    'Gender': ['M', 'F', 'F', 'M', 'M', 'M', 'F', 'M', 'F', 'M', 'F'],
    'Race': ['White', 'Hispanic', 'African', 'White', 'African', 'African', 'African', 'White', 'Hispanic', 'White', 'African'],
    'Birth_Year': [1972, 1981, 1977, 1961, 1982, 1970, 1975, 1959, 1969, 1967, 1979],
    'Marital_Status': ['M', 'S', 'S', 'D', 'D', 'M', 'S', 'D', 'D', 'S', 'M'],
    'Years_on': [8, 14, 6, 9, 11, 15, 9, 12, 12, 5, 13],
    'Hours_Per_Day': [1, 2, 2, 3, 4, 1, 3, 5, 5, 4, 2],
    'Preferred_Browser': ['Firefox', 'Chrome', 'Firefox', 'Firefox', 'Internet Explorer', 'Firefox', 'Internet Explorer', 'Safari', 'Chrome', 'Internet Explorer', 'Firefox'],
    'Preferred_Search_Engine': ['Google', 'Google', 'Yahoo', 'Yahoo', 'Bing', 'Google', 'Yahoo', 'Yahoo', 'Google', 'Google', 'Yahoo'],
    'Preferred_Email': ['Yahoo', 'Hotmail', 'Yahoo', 'Hotmail', 'Hotmail', 'Yahoo', 'Gmail', 'Yahoo', 'Gmail', 'Gmail', 'Yahoo'],
    'Read_News': ['Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y'],
    'Online_Shopping': ['Y', 'N', 'N', 'Y', 'N', 'Y', 'N', 'N', 'Y', 'N', 'Y'],
    'Online_Gaming': ['N', 'N', 'Y', 'N', 'N', 'Y', 'Y', 'N', 'N', 'Y', 'Y'],
    'Facebook': ['Y', 'Y', 'N', 'Y', 'N', 'Y', 'N', 'N', 'Y', 'Y', 'N'],
    'Twitter': ['Y', 'N', 'Y', 'N', 'N', 'N', 'Y', 'N', 'N', 'Y', 'Y'],
    'Other_Social_Network': ['N', 'LinkedIn', 'N', 'N', 'LinkedIn', 'N', 'LinkedIn', 'MySpace', 'Google+', 'LinkedIn', 'Google+']
}

# Create a DataFrame
df = pd.DataFrame(data)

# Display the DataFrame
print(df)

# Optional: If you want to save it to a CSV file
df.to_csv('cleaned_data_complete.csv', index=False)
