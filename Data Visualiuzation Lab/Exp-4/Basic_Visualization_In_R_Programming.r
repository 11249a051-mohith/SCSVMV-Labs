##Experiment:4
##Basic Visualization in R Programming

//Aim:
To create and understand different basic graphs and visualizations using R programming.

//Algorithm:
1. Create the required data vectors in R.
2. Select a suitable graph function.
3. Pass the data to the selected visualization function.
4. Add the graph title and axis labels.
5. Execute the R program.
6. Observe and interpret the generated graph.


//Uses:
- To explore and analyze statistical data.
- To compare different categories visually.
- To identify trends and patterns.
- To study relationships between numerical variables.
- To understand the distribution of data.
- To present analytical information clearly.

Program :1:Line Graph
x <- c(1, 2, 3, 4, 5)
y <- c(10, 15, 12, 18, 20)
plot(x, y, type="o",
     main="Line Graph",
     xlab="X Values",
     ylab="Y Values")

Program 2: Bar Chart

subjects <- c("Python", "Java", "R", "Tableau", "SQL")
marks <- c(85, 78, 82, 90, 88)
barplot(marks,
        names.arg=subjects,
        main="Marks by Subject",
        xlab="Subject",
        ylab="Marks")

Program 3: Pie Chart

values <- c(35, 25, 20, 20)
labels <- c("Python", "Java", "R", "Tableau")
pie(values,
    labels=labels,
    main="Technology Usage")


Program 4: Scatter Plot

hours <- c(1, 2, 3, 4, 5, 6)
marks <- c(45, 50, 58, 65, 72, 80)
plot(hours, marks,
     main="Study Hours vs Marks",
     xlab="Study Hours",
     ylab="Marks",
     pch=19)


Program 5: Histogram

marks <- c(45, 50, 52, 55, 58, 60, 62, 65,
           68, 70, 72, 75, 78, 80, 82, 85,
           88, 90)
hist(marks,
     breaks=5,
     main="Distribution of Marks",
     xlab="Marks",
     ylab="Frequency")


Libraries        Functions Used
- plot()         Creates line graphs and scatter plots.
- barplot()      Creates bar charts.
- pie()          Creates pie charts.
- hist()         Creates histograms.
- Base R graphicsProvides built-in visualization functions without requiring external packages.


//Result:
Thus, five basic visualizations—line graph, bar chart, pie chart, scatter plot, and histogram—were successfully created using R programming. These graphs help represent data visually and understand trends, category comparisons, proportions, relationships, and data distributions.
