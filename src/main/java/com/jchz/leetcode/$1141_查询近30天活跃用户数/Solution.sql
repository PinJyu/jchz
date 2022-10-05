# Write your MySQL query statement below

select activity_date day, count(distinct user_id) active_users
from activity
where activity_date <= date'2019-07-27' and
        datediff(date'2019-07-27', activity_date) < 30
group by activity_date