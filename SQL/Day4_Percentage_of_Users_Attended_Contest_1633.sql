SELECT 
    contest_id,
    ROUND(COUNT(DISTINCT user_id) * 100.0 / (SELECT COUNT(*) FROM Users), 2) AS percentage
FROM 
    Register
GROUP BY 
    contest_id
ORDER BY 
    percentage DESC,
    contest_id ASC;



-- 🔸 Tables:
-- | Column Name | Type    |
-- | ----------- | ------- |
-- | user\_id    | int     |
-- | user\_name  | varchar |
  
-- 🔸 Register Table:
-- | Column Name | Type |
-- | ----------- | ---- |
-- | contest\_id | int  |
-- | user\_id    | int  |

-- 🔸 Expected Output:
-- | contest\_id | percentage |
-- | ----------- | ---------- |
-- | 208         | 100.0      |
-- | 209         | 100.0      |
-- | 210         | 100.0      |
-- | 215         | 66.67      |
-- | 207         | 33.33      |

