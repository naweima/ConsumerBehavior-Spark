### Big data analysis of consumer behavior for e-commerce website using Spark core, SparkSQL, Spark-streaming

My client is an e-commerce website. Lots of customers will search products and place and order from their website. My duty is to get and manipulate the data we need and provide the data to product manager and data analyst to do further processing.

This project is a simplify version. I use simulated data to run the code.

There are 2 main parts in this project.

1. Analyze consumer behavior. Filter specific customers based on question of interest. Define aggregate function, random sample, get top 10 page views/orders of the hot commodities. Based on specific date, calculate top 3 products for each area. Tune performance and troubleshooting.

2. Develop dynamic blacklist. Put customers who clicked one ad over 100 times into blacklist. Calculate ads click stream data for each city. Calculate top 3 hot ads and click stream trend within 1 hour. Save the output into MySQL.

//Because the target folder is too large. I just upload the code and pom file.
