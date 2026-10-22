
"""
Experiment 9: Export a Compact Dashboard-Style Figure

Aim:
To create a compact sales performance dashboard using Python,
Pandas, and Matplotlib, displaying sales by category, sales by
region, sales versus quantity, total sales, and total orders.

Algorithm:
1. Import the required libraries.
2. Read the sales data from the CSV file.
3. Create a dashboard with four subplots.
4. Calculate sales by category and region.
5. Draw a bar chart, pie chart, and line chart.
6. Display total sales and number of orders.
7. Add titles and labels to the dashboard.
8. Save the dashboard as a PNG image.
9. Print a confirmation message.


"""

from pathlib import Path
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import pandas as pd

# Specify input and output paths
source = Path(__file__).parents[1] / "05-data-preparation" / "sales_data.csv"
output = Path(__file__).parent / "outputs"
output.mkdir(exist_ok=True)

# Read the sales dataset
data = pd.read_csv(source)

# Create a dashboard with four subplots
fig, axes = plt.subplots(2, 2, figsize=(11, 8))

# Calculate total sales by category and region
category_sales = data.groupby("Category")["Sales"].sum()
region_sales = data.groupby("Region")["Sales"].sum()

# Bar chart: Sales by Category
axes[0, 0].bar(
    category_sales.index,
    category_sales.values,
    color="#1f4e79"
)
axes[0, 0].set_title("Sales by Category")

# Pie chart: Sales by Region
axes[0, 1].pie(
    region_sales.values,
    labels=region_sales.index,
    autopct="%1.1f%%"
)
axes[0, 1].set_title("Sales by Region")

# Line chart: Sales versus Quantity
axes[1, 0].plot(
    data["Quantity"],
    data["Sales"],
    marker="o",
    color="#c56a00"
)
axes[1, 0].set_title("Sales vs Quantity")
axes[1, 0].set_xlabel("Quantity")
axes[1, 0].set_ylabel("Sales")

# Display total sales and number of orders
axes[1, 1].axis("off")
axes[1, 1].text(
    0.1,
    0.6,
    f"Total Sales\n{data['Sales'].sum():,.0f}\n\nOrders\n{len(data)}",
    fontsize=18,
    va="center"
)

# Add the main dashboard title
fig.suptitle("Sales Performance Dashboard", fontsize=18)

# Adjust layout and save the dashboard
fig.tight_layout()
fig.savefig(output / "sales_dashboard.png", dpi=150)

# Display confirmation message
print("Saved outputs/sales_dashboard.png")

"""
Result:
The sales dashboard is generated and saved as
sales_dashboard.png in the outputs folder.

""""
