# Write your MySQL query statement below
delete p1
from person p1 , person p2
where p1.email = p2.email
and p1.id > p2.id



-- delete p1
-- from person p1 
-- inner join person p2
-- on p1.email = p2.email
-- and p1.id > p2.id

 

-- Example 1:

-- Input: 
-- Person table:
-- +----+------------------+
-- | id | email            |
-- +----+------------------+
-- | 1  | john@example.com |
-- | 2  | bob@example.com  |
-- | 3  | john@example.com |
-- +----+------------------+
-- Output: 
-- +----+------------------+
-- | id | email            |
-- +----+------------------+
-- | 1  | john@example.com |
-- | 2  | bob@example.com  |
-- +----+------------------+
-- Explanation: john@example.com is repeated two times. We keep the row with the smallest Id = 1.
