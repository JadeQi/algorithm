
-- T175
SELECT FirstName,LastName,City,State
FROM Person
LEFT JOIN Address
ON Person.PersonId = Address.PersonId;

-- T176
SELECT
IFNULL(
    (SELECT DISTINCT Salary FROM Employee
    ORDER BY Salary
    LIMIt 1 OFFSET 2),
    NULL
) AS SecondHighestSalary;

-- Notation
-- IFNULL(expression, alt_value); 如果expression为 NULL 则返回第二个参数的值，如果expression不为 NULL 则返回第一个参数的值。

-- 假设Employee表有13条数据.
-- LIMIT 9,4; 返回: 第10,11,12,13行的4条数据.
-- LIMIT 1 OFFSET 2; 返回: 1 代表返回一条数据, 2 代表返回第二行的数据.
