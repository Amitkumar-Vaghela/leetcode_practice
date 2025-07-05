SELECT 
    DATE_FORMAT(trans_date, '%Y-%m') AS month,
    country,
    COUNT(*) AS trans_count,
    SUM(state = 'approved') AS approved_count,
    SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_amount
FROM 
    Transactions
GROUP BY 
    month, country
ORDER BY 
    month, country;


-- input: 
-- Transactions table:
-- +------+---------+----------+--------+------------+
-- | id   | country | state    | amount | trans_date |
-- +------+---------+----------+--------+------------+
-- | 121  | US      | approved | 1000   | 2018-12-18 |
-- | 122  | US      | declined | 2000   | 2018-12-19 |
-- | 123  | US      | approved | 2000   | 2019-01-01 |
-- | 124  | DE      | approved | 2000   | 2019-01-07 |
-- +------+---------+----------+--------+------------+


-- output : 
-- +-------+---------+----------------+---------------------+----------------------------+
-- | month | country | trans_count    | approved_count      | approved_amount            |
-- +-------+---------+----------------+---------------------+----------------------------+
-- | 2018-12 | US    | 2              | 1                   | 1000                       |
-- | 2019-01 | DE    | 1              | 1                   | 2000                       |
-- | 2019-01 | US    | 1              | 1                   | 2000                       |
-- +-------+---------+----------------+---------------------+----------------------------+


