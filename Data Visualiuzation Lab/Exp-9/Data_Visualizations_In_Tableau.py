"""
Experiment 8: Companion Chart Set for Tableau

Aim:
To analyze sales data and generate charts for sales by category,
sales by region, and sales versus quantity using Pandas and Matplotlib.

Algorithm:
1. Import the required libraries.
2. Read the sales data from the CSV file.
3. Calculate total sales by category and region.
4. Generate a bar chart, pie chart, and line chart.
5. Save all charts as PNG images in the outputs folder.
6. Display confirmation messages.


"""

from pathlib import Path
import matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt
import pandas as pd

source = Path(__file__).parents[1] / "05-data-preparation" / "sales_data.csv"
output = Path(__file__).parent / "outputs"
output.mkdir(exist_ok=True)

data = pd.read_csv(source)

category_sales = data.groupby("Category")["Sales"].sum()
region_sales = data.groupby("Region")["Sales"].sum()

figures = {
    "sales_by_category": lambda: category_sales.plot(
        kind="bar", title="Sales by Category"
    ),
    "sales_by_region": lambda: region_sales.plot(
        kind="pie", autopct="%1.1f%%", title="Sales by Region"
    ),
    "sales_vs_quantity": lambda: plt.plot(
        data["Quantity"], data["Sales"], marker="o"
    ),
}

for name, draw in figures.items():
    plt.figure(figsize=(7, 5))
    draw()

    if name == "sales_vs_quantity":
        plt.title("Sales vs Quantity")
        plt.xlabel("Quantity")
        plt.ylabel("Sales")

    plt.tight_layout()
    plt.savefig(output / f"{name}.png", dpi=150)
    plt.close()

    print(f"Saved {name}.png")

"""
Result:
Three charts are generated and saved successfully:
sales_by_category.png, sales_by_region.png, and sales_vs_quantity.png.
"""
