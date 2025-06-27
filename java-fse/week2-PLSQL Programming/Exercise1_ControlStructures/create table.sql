CREATE TABLE bank_customers (
    customer_id         NUMBER PRIMARY KEY,
    name                VARCHAR2(50),
    age                 NUMBER,
    balance             NUMBER(10,2),
    is_vip              VARCHAR2(5) DEFAULT 'FALSE',
    loan_interest_rate  NUMBER(5,2),
    loan_due_date       DATE
);
INSERT INTO bank_customers VALUES (101, 'John Smith', 65, 15000.00, 'FALSE', 8.5, SYSDATE + 10);
INSERT INTO bank_customers VALUES (102, 'Alice Jones', 45, 9500.00, 'FALSE', 7.2, SYSDATE + 40);
INSERT INTO bank_customers VALUES (103, 'Robert Lee', 70, 8000.00, 'FALSE', 9.0, SYSDATE + 5);
INSERT INTO bank_customers VALUES (104, 'Maria Gomez', 34, 12000.00, 'FALSE', 6.8, SYSDATE + 25);
COMMIT;
