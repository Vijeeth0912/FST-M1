--Write an SQL statement to know which salesman are working for which customer.

SELECT S.SALESMAN_ID,S.SALESMAN_NAME, C.CUSTOMER_ID, C.CUSTOMER_NAME 
FROM SALESMAN S 
INNER JOIN CUSTOMERS C 
ON S.SALESMAN_ID = C.SALESMAN_ID

--Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.

SELECT *  
FROM CUSTOMERS C 
LEFT OUTER JOIN SALESMAN S 
ON C.SALESMAN_ID = S.SALESMAN_ID 
WHERE C.GRADE<300

--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.

SELECT * 
FROM CUSTOMERS C 
INNER JOIN SALESMAN S 
ON C.SALESMAN_ID = S.SALESMAN_ID 
WHERE S.SALESMAN_COMMISSION > 12

--Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.

SELECT O.ORDER_NO, O.ORDER_DATE, O.PURCHASE_AMOUNT, C.CUSTOMER_NAME, C.GRADE, S.SALESMAN_NAME, S.SALESMAN_COMMISSION 
FROM ORDERS O 
INNER JOIN CUSTOMERS C ON O.CUSTOMER_ID = C.CUSTOMER_ID 
INNER JOIN SALESMAN S ON O.SALESMAN_ID = S.SALESMAN_ID 
ORDER BY O.ORDER_NO





