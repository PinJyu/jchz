# Write your MySQL query statement below



select a.name, sum(case when b.distance is null then 0 else b.distance end) travelled_distance
from users a

         left join rides b on a.id = b.user_id
group by a.id
order by sum(b.distance) desc, a.name