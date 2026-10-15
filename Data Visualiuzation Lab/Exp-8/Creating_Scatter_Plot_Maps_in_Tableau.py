## Experiment No. 7
## Creating Scatter Plot Maps in Tableau


//Aim:

To create scatter plots and map-based visualizations using Tableau.

//Algorithm:

1. Open Tableau Public.
2. Connect to the required dataset.
3. Identify the geographical and numerical fields.
4. Drag the required fields to the Rows and Columns shelves.
5. Select Scatter Plot from the Show Me panel.
6. Add geographical fields to create map-based visualizations.
7. Analyze and save the visualization.


//Uses:
- To identify relationships between numerical variables.
- To recognize clusters and unusual data values.
- To compare sales and quantity.
- To display geographical information.
- To analyze regional business performance.
- To identify patterns across different locations.


//Program:
import pandas as pd
import matplotlib.pyplot as plt
# Load dataset
data = pd.read_csv("sales_map_data.csv")
# Scatter plot
plt.scatter(data["Sales"], data["Quantity"])
plt.xlabel("Sales")
plt.ylabel("Quantity")
plt.title("Scatter Plot: Sales vs Quantity")
plt.show()

//Libraries        Functions Used
 Pandas            Used for loading and handling tabular data.
 Matplotlib        Used for creating graphs and visualizations.
 read_csv()        Reads the CSV file.
 scatter()         Creates a scatter plot.
 xlabel()          Sets the X-axis label.
 ylabel()          Sets the Y-axis label.
 title()           Sets the graph title.
 show()            Displays the graph.

//Sample CSV File:

City,Region,Sales,Quantity
Hyderabad,South,55000,2
Delhi,North,20000,3
Mumbai,West,30000,4
Chennai,South,25000,2
Kolkata,East,15000,5
Bangalore,South,40000,3

//Result:
Thus, a scatter plot was successfully created using Python and Matplotlib. The dataset fields can also be used in Tableau to explore relationships between sales and quantity and to create geographical visualizations for analyzing regional business performance.
