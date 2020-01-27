-- https://leetcode.com/problems/product-sales-analysis-i/
select product_name, year, price from Sales
join Product P on Sales.product_id = P.product_id
