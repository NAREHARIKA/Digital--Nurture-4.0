CREATE TABLE bank_customers (
    customer_id         NUMBER PRIMARY KEY,
    name                VARCHAR2(100),
    age                 NUMBER,
    loan_interest_rate  NUMBER(5,2),
    balance             NUMBER(12,2),
    is_vip              VARCHAR2(5),
    loan_due_date       DATE
);
INSERT INTO bank_customers VALUES (1, 'Alice', 65, 10.5, 15000, 'FALSE', SYSDATE + 10);
INSERT INTO bank_customers VALUES (2, 'Bob', 45, 9.0, 8000, 'FALSE', SYSDATE + 5);
INSERT INTO bank_customers VALUES (3, 'Charlie', 70, 11.0, 12000, 'FALSE', SYSDATE + 35);
INSERT INTO bank_customers VALUES (4, 'Diana', 30, 12.5, 20000, 'FALSE', SYSDATE + 20);
COMMIT;