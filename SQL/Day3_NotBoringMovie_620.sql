SELECT * 
FROM Cinema
WHERE id % 2 != 0
  AND description != 'boring'
ORDER BY rating DESC;

| id | movie    | description | rating |
| -- | -------- | ----------- | ------ |
| 1  | War      | great       | 8.9    |
| 2  | Science  | boring      | 8.5    |
| 3  | Fiction  | interesting | 9.0    |
| 4  | Love     | boring      | 7.0    |
| 5  | Thriller | suspense    | 8.2    |



| id | movie    | description | rating |
| -- | -------- | ----------- | ------ |
| 3  | Fiction  | interesting | 9.0    |
| 1  | War      | great       | 8.9    |
| 5  | Thriller | suspense    | 8.2    |

