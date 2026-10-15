##Experiment No.3
##Basic Visualization in Python

//Aim:
To create and understand different basic graphs and visualizations using Python and the Matplotlib library.

//Algorithm
1. Import the required Matplotlib module.
2. Prepare the required dataset.
3. Select the appropriate type of graph.
4. Create the visualization using the corresponding plotting function.
5. Add the graph title and axis labels.
6. Display the graph using plt.show().
7. Observe and interpret the output.


//Uses:
- To represent data graphically.
- To identify trends and patterns in data.
- To compare different categories.
- To understand the distribution of numerical data.
- To analyze relationships between variables.
- To present analytical results clearly.

Program 1: Line Chart

import matplotlib.pyplot as plt
x = [1, 2, 3, 4, 5]
y = [10, 15, 12, 18, 20]
plt.plot(x, y, marker="o", label="Values")
plt.title("Line Chart")
plt.xlabel("X Values")
plt.ylabel("Y Values")
plt.legend()
plt.grid(True)
plt.show()

Program 2: Bar Chart

import matplotlib.pyplot as plt
subjects = ["Python", "Java", "R", "Tableau", "SQL"]
marks = [85, 78, 82, 90, 88]
plt.bar(subjects, marks)
plt.title("Marks by Subject")
plt.xlabel("Subject")
plt.ylabel("Marks")
plt.show()


Program 3: Pie Chart

import matplotlib.pyplot as plt
labels = ["Python", "Java", "R", "Tableau"]
values = [35, 25, 20, 20]
plt.pie(values, labels=labels, autopct="%1.1f%%")
plt.title("Technology Usage")
plt.show()

Program 4: Scatter Plot

import matplotlib.pyplot as plt
hours = [1, 2, 3, 4, 5, 6]
marks = [45, 50, 58, 65, 72, 80]
plt.scatter(hours, marks)
plt.title("Study Hours vs Marks")
plt.xlabel("Study Hours")
plt.ylabel("Marks")
plt.show()


Program 5: Histogram

import matplotlib.pyplot as plt
marks = [45, 50, 52, 55, 58, 60, 62, 65,68, 70, 72, 75, 78, 80, 82, 85,88, 90]
plt.hist(marks, bins=5, edgecolor="black")
plt.title("Distribution of Marks")
plt.xlabel("Marks")
plt.ylabel("Frequency")
plt.show()


//Result:
Thus, five basic visualizations—line chart, bar chart, pie chart, scatter plot, and histogram—were successfully created using Python and the Matplotlib library. These visualizations help represent data graphically and understand trends, comparisons, distributions, and relationships between variables.
