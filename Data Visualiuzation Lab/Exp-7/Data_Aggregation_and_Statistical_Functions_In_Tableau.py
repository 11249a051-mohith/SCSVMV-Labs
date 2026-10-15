## Experiment No. 6
## Data Aggregation and Statistical Functions in Tableau
//Aim:
To perform data aggregation and apply statistical functions in Tableau for effective data analysis.

//Uses:
- To calculate total sales.
- To determine average values.
- To identify minimum and maximum values.
- To compare different categories.
- To summarize large datasets.
- To support data-driven decision-making.

//Algorithm:

1. Open Tableau Public.
2. Connect to the required dataset.
3. Load the sales data.
4. Select the required fields for analysis.
5. Apply aggregation and statistical functions.
6. Group the data by category.
7. Analyze and save the results.

//Program:

import pandas as pd
# Load dataset
data = pd.read_csv("sales_data.csv")
# Total Sales
print("Total Sales:", data["Sales"].sum())
# Average Sales
print("Average Sales:", data["Sales"].mean())
# Minimum Sales
print("Minimum Sales:", data["Sales"].min())
# Maximum Sales
print("Maximum Sales:", data["Sales"].max())
# Group by Category
print("\nSales by Category:")
print(data.groupby("Category")["Sales"].sum())

//Libraries    Functions Used
Pandas         A Python library used for data manipulation, aggregation, and statistical calculations.
read_csv()     Reads the dataset from a CSV file.
sum()          Calculates the total.
mean()         Calculates the average.
min()          Returns the minimum value.
max()          Returns the maximum value.
groupby()      Groups data according to specified categories.

//Sample Output:

For the sample sales dataset used in the previous experiment, the output is:
Total Sales: 115000
Average Sales: 19166.666666666668
Minimum Sales: 3000
Maximum Sales: 55000

Sales by Category:
Category
Electronics    78000
Furniture      37000
Name: Sales, dtype: int64

//Result:

Thus, data aggregation and statistical analysis were successfully performed on the sales dataset. Total sales, average sales, minimum sales, maximum sales, and category-wise sales were calculated using Pandas functions, demonstrating the principles of data aggregation used in Tableau.
