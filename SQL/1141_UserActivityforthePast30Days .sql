SELECT 
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM  
    Activity
WHERE 
    activity_date BETWEEN DATE_SUB('2019-07-27', INTERVAL 29 DAY) AND '2019-07-27'
GROUP BY 
    activity_date
ORDER BY 
    activity_date;


-- Table Activity:
-- | Column Name     | Type                                                                        |
-- | --------------- | --------------------------------------------------------------------------- |
-- | `user_id`       | int                                                                         |
-- | `session_id`    | int                                                                         |
-- | `activity_date` | date                                                                        |
-- | `activity_type` | enum (`'open_session'`, `'end_session'`, `'scroll_down'`, `'send_message'`) |


-- Output:
-- | user\_id | session\_id | activity\_date | activity\_type |
-- | -------- | ----------- | -------------- | -------------- |
-- | 1        | 1           | 2019-07-20     | open\_session  |
-- | 1        | 1           | 2019-07-20     | scroll\_down   |
-- | 1        | 1           | 2019-07-20     | end\_session   |
-- | 2        | 4           | 2019-07-20     | open\_session  |
-- | 2        | 4           | 2019-07-20     | send\_message  |
-- | 3        | 2           | 2019-07-21     | open\_session  |
-- | 3        | 2           | 2019-07-21     | send\_message  |
-- | 3        | 2           | 2019-07-21     | end\_session   |


-- Expected output:
-- | activity\_date | active\_users |
-- | -------------- | ------------- |
-- | 2019-07-20     | 2             |
-- | 2019-07-21     | 1             |

