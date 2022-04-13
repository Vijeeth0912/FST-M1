--Activity6
SELECT DISTINCT SALESMAN_ID FROM ORDERS;

SELECT ORDER_NO, ORDER_DATE FROM ORDERS
ORDER BY ORDER_DATE ASC;

SELECT ORDER_NO, PURCHASE_AMOUNT FROM ORDERS
ORDER BY PURCHASE_AMOUNT DESC;

SELECT * FROM ORDERS
WHERE PURCHASE_AMOUNT < 500;

SELECT * FROM ORDERS
WHERE PURCHASE_AMOUNT > 1000 AND PURCHASE_AMOUNT < 2000;

SELECT * FROM ORDERS
WHERE PURCHASE_AMOUNT BETWEEN 1000 AND 2000;