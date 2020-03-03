
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

-- T178

--将Scores表与tmp表join一下就可以得到最后所需答案
select Scores.Score, tmp.Rank
from
Scores
left join
(   ---下面是统计每个分数有多少分数比他高，也就是排名，得到tmp表
    select t.Score, count(t.Score)as Rank
    from (
        select a.Score as Score
        from
        (select distinct Score from Scores)as a,
        (select distinct Score from Scores)as b
        where
        a.Score <= b.Score
    )as t
    group by t.Score
)as tmp
on Scores.Score = tmp.Score
order by tmp.Rank asc;


