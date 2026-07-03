-- Exercise 3

-- Scenario 1
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance * 1.01
    WHERE AccountType = 'Savings';

    COMMIT;
END;
/

EXEC ProcessMonthlyInterest;

SELECT AccountID, Balance
FROM Accounts;


-- Scenario 2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department VARCHAR2,
    p_bonus NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus / 100)
    WHERE Department = p_department;

    COMMIT;
END;
/

EXEC UpdateEmployeeBonus('IT',10);

SELECT EmployeeID, Name, Salary
FROM Employees;


-- Scenario 3
CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from NUMBER,
    p_to NUMBER,
    p_amount NUMBER
)
IS
    v_balance NUMBER;
BEGIN
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from;

    IF v_balance >= p_amount THEN
        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to;

        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance');
    END IF;
END;
/

EXEC TransferFunds(101,102,1000);

SELECT AccountID, Balance
FROM Accounts;
