## Experiment No. 5
## Connecting to Data and Preparing Data for Visualization in Tableau

//Aim:
To connect Tableau to a data source and prepare the data for creating visualizations.

//Algorithm:

1.Open Tableau Public.
2.Select the required data source.
3.Import the dataset.
4.Verify the imported data.
5.Perform basic data preparation and cleaning.
6.Save the cleaned dataset.
7.Use the prepared dataset for visualization.

//Uses:
To remove duplicate records.
To identify missing values.
To convert columns into appropriate data types.
To prepare datasets for visualization.
To improve data quality and accuracy.
To make data suitable for further analysis.

//Program:
import pandas as pd
data = pd.read_csv("sales_data.csv")
print(data.head())
print(data.isnull().sum())
data = data.drop_duplicates()
data["Sales"] = pd.to_numeric(data["Sales"])
data.to_csv("cleaned_sales_data.csv", index=False)
print("Data prepared successfully.")

//Table:
Libraries             Functions Used
Pandas                A Python library used for reading, cleaning, transforming, and saving tabular data.
read_csv()            Reads a CSV file.
head()                Displays the first five rows.
isnull().sum()        Checks missing-value counts.
drop_duplicates()     Removes duplicate records.
to_numeric()          Converts values into numeric form.
to_csv()              Saves data to a CSV file.



//Sample CSV File:
OrderID,Product,Category,Sales,Quantity,Region
101,Laptop,Electronics,55000,2,South
102,Mobile,Electronics,20000,3,North
103,Chair,Furniture,5000,5,West
104,Table,Furniture,7000,2,East
105,Headphones,Electronics,3000,4,South
106,Sofa,Furniture,25000,1,North


//Result:
Thus, the sales dataset was successfully loaded, inspected, cleaned, and prepared for visualization. The cleaned dataset was saved as a CSV file that can be connected to Tableau Public for creating charts and dashboards.
