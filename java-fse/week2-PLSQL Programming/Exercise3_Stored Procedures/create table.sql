CREATE TABLE bank_accounts (
    account_id       NUMBER PRIMARY KEY,
    customer_name    VARCHAR2(50),
    account_type     VARCHAR2(20),  
    balance          NUMBER(10, 2),
    department       VARCHAR2(30),  
    salary           NUMBER(10, 2) 

INSERT INTO bank_accounts VALUES (101, 'Alice', 'savings', 1000, NULL, NULL);
INSERT INTO bank_accounts VALUES (102, 'Bob', 'savings', 2000, NULL, NULL);


INSERT INTO bank_accounts VALUES (201, 'John', 'current', 0, 'HR', 40000);
INSERT INTO bank_accounts VALUES (202, 'Jane', 'current', 0, 'HR', 45000);
INSERT INTO bank_accounts VALUES (203, 'Mark', 'current', 0, 'IT', 50000);

INSERT INTO bank_accounts VALUES (301, 'Harika', 'current', 5000, NULL, NULL);
INSERT INTO bank_accounts VALUES (302, 'Ravi', 'current', 3000, NULL, NULL);

COMMIT;