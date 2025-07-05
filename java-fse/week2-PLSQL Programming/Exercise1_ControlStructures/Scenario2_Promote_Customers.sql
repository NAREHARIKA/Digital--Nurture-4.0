BEGIN
    FOR rec IN (SELECT * FROM bank_customers) LOOP
        IF rec.balance > 10000 THEN
            UPDATE bank_customers
            SET is_vip = 'TRUE'
            WHERE customer_id = rec.customer_id;

            DBMS_OUTPUT.PUT_LINE('Customer ID ' || rec.customer_id || ' promoted to VIP.');
        END IF;
    END LOOP;
    COMMIT;
END;
/
