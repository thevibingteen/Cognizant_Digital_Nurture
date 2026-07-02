-- =====================================================
-- Exercise 3 : Stored Procedures
-- =====================================================

--------------------------------------------------------
-- Scenario 1
-- Monthly Interest Processing
--------------------------------------------------------

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN

    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;

END;
/

--------------------------------------------------------
-- Scenario 2
-- Employee Bonus
--------------------------------------------------------

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

--------------------------------------------------------
-- Scenario 3
-- Fund Transfer
--------------------------------------------------------

CREATE OR REPLACE PROCEDURE TransferFunds(

    p_from_account NUMBER,
    p_to_account NUMBER,
    p_amount NUMBER

)
IS

    source_balance NUMBER;

BEGIN

    SELECT Balance
    INTO source_balance
    FROM Accounts
    WHERE AccountID = p_from_account
    FOR UPDATE;

    IF source_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_account;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_account;

        COMMIT;

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

    END IF;

END;
/