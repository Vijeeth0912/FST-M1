--Activity7
SELECT * FROM ORDERS;

SELECT SUM(PURCHASE_AMOUNT) SUM_PURCHASE_AMOUNT
FROM ORDERS;

SELECT ROUND(AVG(PURCHASE_AMOUNT),0) AVG_PURCHASE_AMOUNT
FROM ORDERS;

SELECT MAX(PURCHASE_AMOUNT) MAX_PURCHASE_AMOUNT
FROM ORDERS;

SELECT MIN(PURCHASE_AMOUNT) MIN_PURCHASE_AMOUNT
FROM ORDERS;

SELECT COUNT(DISTINCT SALESMAN_ID)
FROM ORDERS;