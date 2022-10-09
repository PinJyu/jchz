# Write your MySQL query statement below

select a.name, sum(b.amount) balance
from users a, transactions b
where a.account = b.account
group by a.name
having sum(b.amount) > 10000