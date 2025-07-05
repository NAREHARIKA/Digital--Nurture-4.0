CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE bank_accounts
    SET salary = salary + (salary * p_bonus_percent / 100)
    WHERE department = p_department;

    DBMS_OUTPUT.PUT_LINE('Bonus applied to employees in ' || p_department || ' department.');
END;
/
BEGIN
    UpdateEmployeeBonus('HR', 10);
END;
/