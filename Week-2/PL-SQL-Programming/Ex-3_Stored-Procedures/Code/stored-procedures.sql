
-- Scenario 1: Stored Procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
        WHERE AccountType = 'Savings';
END;
/

EXEC ProcessMonthlyInterest;

-- Output:

SELECT * FROM Accounts WHERE AccountType = 'Savings';






-- Scenario 2: Stored Procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_name IN VARCHAR2,
    bonus_pct IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary + bonus_pct/ 100)
    WHERE Department = dept_name;
END;
/

EXEC UpdateEmployeeBonus('IT', 10);


-- Output:

SELECT * FROM Employees;





-- Scenario 3: Stored Procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.

CREATE OR REPLACE PROCEDURE TransferFunds(
    source_account IN NUMBER,
    dest_account IN NUMBER,
    amount IN NUMBER
) IS
    insufficient_funds EXCEPTION;
    BEGIN
        FOR account IN(
            SELECT Balance FROM Accounts WHERE AccountID = source_account
        ) LOOP
            IF account.Balance < amount THEN
                RAISE insufficient_funds;
            END IF;
        END LOOP;

        -- Debit the source account and credit the destination account

        UPDATE Accounts
        SET Balance = Balance - amount,
        LastModified = SYSDATE
        WHERE AccountID = source_account;

        UPDATE Accounts
        SET Balance = Balance + amount,
        LastModified = SYSDATE
        WHERE AccountID = dest_account;


    EXCEPTION
        WHEN insufficient_funds THEN
            DBMS_OUTPUT.PUT_LINE('Transfer Unsuccessful: Insufficient funds in source account.');

    END;
    /
        
    EXEC TransferFunds(1, 2, 200);


-- Output:

SELECT * FROM Accounts WHERE AccountType = 'Savings';

