--Write a query that produces the name and number of each salesman and each customer with more than one current order. Put the results in alphabetical order.

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT c.salesman_id, c.salesman_name FROM salesman c 
WHERE 1<(SELECT COUNT(*) FROM orders d WHERE c.salesman_id = d.salesman_id) 
ORDER BY customer_name;

SELECT S.SALESMAN_ID, S.SALESMAN_NAME, C.CUSTOMER_ID, C.CUSTOMER_NAME FROM SALESMAN S 
FULL JOIN CUSTOMERS C 
ON S.SALESMAN_ID = C.SALESMAN_ID 
WHERE S.SALESMAN_ID IN ( 
SELECT SALESMAN_ID FROM ORDERS 
HAVING COUNT(*) > 1 
GROUP BY SALESMAN_ID) 
ORDER BY S.SALESMAN_ID;

--Write a query to make a report of which salesman produce the largest and smallest orders on each date. Also add a column that shows "highest on" and "lowest on" values.

SELECT S.SALESMAN_ID, S.SALESMAN_NAME, PURCHASE_AMOUNT, ORDER_NO, 'HIGHEST ON', ORDER_DATE FROM SALESMAN S, ORDERS O
WHERE S.SALESMAN_ID=O.SALESMAN_ID
AND O.PURCHASE_AMOUNT=(SELECT MAX(PURCHASE_AMOUNT) FROM ORDERS C WHERE C.ORDER_DATE = O.ORDER_DATE)
UNION
SELECT S.SALESMAN_ID, S.SALESMAN_NAME, PURCHASE_AMOUNT, ORDER_NO, 'LOWEST ON', ORDER_DATE FROM SALESMAN S, ORDERS O
WHERE S.SALESMAN_ID=O.SALESMAN_ID
AND O.PURCHASE_AMOUNT=(SELECT MIN(PURCHASE_AMOUNT) FROM ORDERS C WHERE C.ORDER_DATE = O.ORDER_DATE)
ORDER BY ORDER_DATE;