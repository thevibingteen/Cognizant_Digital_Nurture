-- =====================================================
-- Exercise 1 : Control Structures
-- =====================================================

--------------------------------------------------------
-- Scenario 1
-- Apply 1% discount on loan interest for customers
-- above 60 years of age.
--------------------------------------------------------

BEGIN
    FOR customer_record IN (
        SELECT CustomerID, Age
        FROM Customers
    )
    LOOP
        IF customer_record.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = customer_record.CustomerID;

        END IF;
    END LOOP;

    COMMIT;
END;
/

--------------------------------------------------------
-- Scenario 2
-- Promote customers to VIP if balance exceeds 10000.
--------------------------------------------------------

BEGIN
    FOR customer_record IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP

        IF customer_record.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = customer_record.CustomerID;

        END IF;

    END LOOP;

    COMMIT;
END;
/

--------------------------------------------------------
-- Scenario 3
-- Print reminders for loans due within 30 days.
--------------------------------------------------------

BEGIN

    FOR loan_record IN (

        SELECT CustomerID,
               LoanID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE
                          AND SYSDATE + 30

    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder : Loan '
            || loan_record.LoanID
            || ' for Customer '
            || loan_record.CustomerID
            || ' is due on '
            || loan_record.DueDate
        );

    END LOOP;

END;
/