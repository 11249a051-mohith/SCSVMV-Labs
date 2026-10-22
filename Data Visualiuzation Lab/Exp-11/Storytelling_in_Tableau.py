
"""
Experiment 10: Export Three Story Views for Tableau

Aim:
To analyze sales data and generate three story views:
sales by category, sales by region, and sales versus quantity
using Python, Pandas, and Matplotlib.

Algorithm:
1. Import the required libraries.
2. Read the sales data from the CSV file.
3. Calculate sales by category and region.
4. Create a bar chart for category performance.
5. Create a pie chart for regional contribution.
6. Create a scatter plot for sales versus quantity.
7. Add titles and axis labels.
8. Save all three charts as PNG files.
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

# Prepare category and regional sales views
views = [
    (
        "story_1_category_performance",
        "bar",
        data.groupby("Category")["Sales"].sum()
    ),
    (
        "story_2_regional_contribution",
        "pie",
        data.groupby("Region")["Sales"].sum()
    ),
]

# Generate the first and second story views
for name, chart_type, values in views:
    plt.figure(figsize=(7, 5))

    if chart_type == "bar":
        values.plot(
            kind="bar",
            title="Story 1: Sales by Category"
        )
        plt.xlabel("Category")
        plt.ylabel("Total Sales")
    else:
        values.plot(
            kind="pie",
            autopct="%1.1f%%",
            title="Story 2: Sales by Region"
        )
        plt.ylabel("")

    plt.tight_layout()
    plt.savefig(output / f"{name}.png", dpi=150)
    plt.close()

# Generate the third story view: Sales versus Quantity
plt.figure(figsize=(7, 5))
plt.scatter(
    data["Quantity"],
    data["Sales"],
    s=80,
    color="#1f4e79"
)
plt.title("Story 3: Sales vs Quantity")
plt.xlabel("Quantity")
plt.ylabel("Sales")
plt.tight_layout()
plt.savefig(output / "story_3_sales_quantity.png", dpi=150)
plt.close()

# Display confirmation message
print(
    "Story created: category performance, regional contribution, "
    "and sales relationship."
)

"""
Result:
Three story-view charts are generated and saved in the
outputs folder for use with Tableau.
"""
