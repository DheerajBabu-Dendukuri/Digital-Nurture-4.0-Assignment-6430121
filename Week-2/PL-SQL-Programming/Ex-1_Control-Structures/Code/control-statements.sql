
-- Scenario 1: PL/SQL block that loops through all customers, checks their age, and if they are above 60, apply a 1% discount to their current loan interest rates.

BEGIN
    FOR record IN(
        SELECT loan.LoanID, customer.CustomerID, FLOOR(MONTHS_BETWEEN(SYSDATE, customer.DOB)/12) AS Age 
        FROM Loans loan
        JOIN Customers customer ON
        loan.CustomerID = customer.CustomerID
    ) LOOP
        IF record.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = record.CustomerID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('1% interest discount applied for customers above 60 years of age.');
END;
/

--Output:
SELECT LoanID, CustomerID, InterestRate FROM Loans;



-- Scenario 2: PL/SQL block that iterates through all customers and sets a flag IsVIP to TRUE for those with a balance over $10,000.

BEGIN
    FOR record IN(
        SELECT CustomerID, Balance from CUSTOMERS
    ) LOOP
        IF record.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = record.CustomerID;
        END IF;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status for high-balance customers updated.');
END;
/


-- Output: 
SELECT CustomerID, Name, Balance, IsVIP from CUSTOMERS;



-- Scenario 3: PL/SQL block that fetches all loans due in the next 30 days and prints a reminder message for each customer.

BEGIN
    FOR record IN(
        SELECT LoanID, CustomerID, EndDate
        FROM LOANS
        WHERE EndDate BETWEEN SYSDATE AND ADD_MONTHS(SYSDATE, 30)
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Remainder : Loan ID ' || record.LoanID ||
                              '  for Customer ' || record.CustomerID ||
                              '  is due on ' || TO_CHAR (record.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/

-- Output:
SELECT LoanID, CustomerID, EndDate
FROM LOANS
WHERE EndDate BETWEEN SYSDATE AND ADD_MONTHS(SYSDATE, 30);

--