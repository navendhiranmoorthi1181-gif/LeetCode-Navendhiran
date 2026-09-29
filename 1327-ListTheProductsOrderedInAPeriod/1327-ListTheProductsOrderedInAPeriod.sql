-- Last updated: 9/29/2026, 2:43:35 PM
# Write your MySQL query statement below
SELECT p.product_name, SUM(o.unit) AS unit
FROM Products p 
JOIN Orders o
ON o.product_id=p.product_id
WHERE o.order_date like '2020-02-%'
GROUP BY o.product_id
HAVING unit>=100; 