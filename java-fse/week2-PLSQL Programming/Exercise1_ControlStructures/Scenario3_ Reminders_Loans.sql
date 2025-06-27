BEGIN
    FOR rec IN (
        SELECT * FROM bank_customers
        WHERE loan_due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || rec.name ||
                             ' has a loan due on ' || TO_CHAR(rec.loan_due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
