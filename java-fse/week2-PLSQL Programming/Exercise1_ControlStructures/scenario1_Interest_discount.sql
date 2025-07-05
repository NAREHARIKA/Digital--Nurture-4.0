BEGIN
    FOR rec IN (SELECT * FROM bank_customers) LOOP
        IF rec.age > 60 THEN
            UPDATE bank_customers
            SET loan_interest_rate = loan_interest_rate - 1
            WHERE customer_id = rec.customer_id;

            DBMS_OUTPUT.PUT_LINE('Interest rate discounted for Customer ID: ' || rec.customer_id);
        END IF;
    END LOOP;
    COMMIT;
END;
/
