### Big data analysis of consumer behavior using Spark core, SparkSQL, Spark-streaming

My client is a travel website. Lots of customers will search products and place order from their website. My duty is to get and manipulate the data we need and provide the data to product manager and data analyst to do further processing.

There are 2 main parts in this project.
1. Analyzed consumer behavior (Spark Core and SparkSQL). 
•	Filter records based on question of interest. (Spark Core)
•	Use mapToPair and join transformation to create RDD. Filter records based on parameters.
•	Use customized accumulator to calculate 9 ratios of each visit time.
•	Randomly select 100 records at time scale from filtered records.
•	Use secondary sort to sort top 10 clicked, ordered and payment products sequentially.
•	Grouped by id, calculate top 10 click session records for each group.
•	Tune performance and troubleshooting and data skew.
•	Calculate top 3 products for each area. (SparkSQL, row by partition, case when)

2. Developed dynamic blacklist (Spark-Streaming). 

•	Put customers who clicked one ad over 100 times into blacklist, save it into MySQL
•	Filter records from blacklist, save it into MySQL
•	Create DStream, join blacklist RDD (created from MySQL), 
•	Calculate ads click count for each city using updateStateByKey. Update it into MySQL.
•	Calculate top 3 ads for each state (Spark SQL: row by partition)
•	Calculate click count trend within 1 hour using slide windows operation. Save the output into MySQL. (click count by minutes)
•	Tune performance and troubleshooting.
