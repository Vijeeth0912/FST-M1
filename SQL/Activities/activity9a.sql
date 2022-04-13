-- Create the customers table
create table CUSTOMERS (
    CUSTOMER_ID int primary key, CUSTOMER_NAME varchar(32),
    CITY varchar(20), GRADE int, SALESMAN_ID int);

-- Insert values into it
INSERT ALL
    INTO CUSTOMERS VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO CUSTOMERS VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO CUSTOMERS VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO CUSTOMERS VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO CUSTOMERS VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO CUSTOMERS VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO CUSTOMERS VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO CUSTOMERS VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;