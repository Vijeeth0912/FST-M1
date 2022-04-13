--Write a query to find all the orders issued against the salesman who may works for customer whose id is 3007.

SELECT * FROM ORDERS O  
WHERE O.SALESMAN_ID IN  
(SELECT DISTINCT SALESMAN_ID FROM CUSTOMERS  
WHERE CUSTOMER_ID = '3007')  
ORDER BY O.ORDER_NO DESC

--Write a query to find all orders attributed to a salesman in New York.

SELECT * FROM ORDERS  
WHERE SALESMAN_ID IN  
(SELECT DISTINCT SALESMAN_ID FROM SALESMAN  
WHERE SALESMAN_CITY = 'New York')  
ORDER BY ORDER_NO DESC

--Write a query to count the customers with grades above New York's average.

SELECT GRADE, COUNT(*) FROM CUSTOMERS 
WHERE GRADE > (SELECT ROUND(AVG(GRADE),0) FROM CUSTOMERS WHERE CITY = 'New York') 
GROUP BY GRADE ORDER BY GRADE;

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

--Write a query to extract the data from the orders table for those salesman who earned the maximum commission

SELECT * FROM ORDERS O 
WHERE O.SALESMAN_ID IN (SELECT SALESMAN_ID FROM SALESMAN  
WHERE SALESMAN_COMMISSION = (SELECT MAX(SALESMAN_COMMISSION) FROM SALESMAN)) 
ORDER BY O.ORDER_NO;

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE salesman_commission=( SELECT MAX(salesman_commission) FROM salesman));

