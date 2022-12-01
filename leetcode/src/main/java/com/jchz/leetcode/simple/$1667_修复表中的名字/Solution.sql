# Write your MySQL query statement below

select user_id, concat(substring(upper(name), 1, 1), substring(lower(name), 2)) name
from users
order by user_id