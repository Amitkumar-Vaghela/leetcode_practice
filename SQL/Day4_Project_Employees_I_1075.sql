SELECT 
    p.project_id,
    ROUND(AVG(e.experience_years), 2) AS average_years
FROM 
    Project p
JOIN 
    Employee e 
ON 
    p.employee_id = e.employee_id
GROUP BY 
    p.project_id;



-- input
-- Project table
-- | project\_id | employee\_id |
-- | ----------- | ------------ |
-- | 1           | 1            |
-- | 1           | 2            |
-- | 2           | 1            |
-- | 2           | 3            |

-- Employee table:
-- | employee\_id | name   | experience\_years |
-- | ------------ | ------ | ----------------- |
-- | 1            | Khaled | 3                 |
-- | 2            | Ali    | 4                 |
-- | 3            | John   | 5                 |



-- output:
-- | project\_id | average\_years |
-- | ----------- | -------------- |
-- | 1           | 3.50           |
-- | 2           | 4.00           |
