-- Exercise 1
-- Scenario 1

BEGIN
    FOR rec IN (
        SELECT c.CustomerID, c.DOB, l.LoanID
        FROM Customers c, Loans l
        WHERE c.CustomerID = l.CustomerID
    )
    LOOP
        IF MONTHS_BETWEEN(SYSDATE, rec.DOB)/12 > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

SELECT CustomerID, InterestRate
FROM Loans;


-- Scenario 2

ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers)
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

SELECT CustomerID, Name, Balance, IsVIP
FROM Customers;


-- Scenario 3

SET SERVEROUTPUT ON;

BEGIN
    FOR rec IN (
        SELECT LoanID, CustomerID, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' ||
            rec.CustomerID || ' has Loan ' ||
            rec.LoanID || ' due on ' ||
            TO_CHAR(rec.EndDate,'DD-MON-YYYY'));
    END LOOP;
END;
/
