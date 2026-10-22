# Experiment 5: Connecting to Data and Preparing Data in Tableau

## Aim
To connect to a CSV dataset, inspect its structure, clean common quality problems, and prepare it for visualization.

## Theory
Visualization quality depends on data quality. Preparation includes checking column names and types, detecting missing values, removing duplicates, converting numeric fields, and saving a clean version. Tableau can perform this work in its data-source page; Pandas provides a reproducible supporting workflow.

## Algorithm
1. Load `sales_data.csv`.
2. Inspect the first records and missing-value counts.
3. Remove duplicate rows.
4. Convert Sales and Quantity to numeric values.
5. Save the cleaned dataset.
6. Connect the cleaned CSV to Tableau and verify the fields.

## Result
The sample sales data was cleaned and saved for reliable visualization.

## Viva Prompts
1. Why must Sales be numeric before aggregation?
2. What problems can duplicate rows cause?
3. How can Tableau reveal an incorrect data type?
