CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance
    FROM bank_accounts
    WHERE account_id = p_from_account
    FOR UPDATE;

    IF v_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in account ' || p_from_account);
    ELSE
        UPDATE bank_accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_account;

        UPDATE bank_accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_account;

        DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from account ' || p_from_account || ' to account ' || p_to_account);
    END IF;
END;
/
BEGIN
    TransferFunds(301, 302, 1000);
END;
/