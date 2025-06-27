CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE bank_accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'savings';
    
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to savings accounts.');
END;
/
BEGIN
    ProcessMonthlyInterest;
END;
/