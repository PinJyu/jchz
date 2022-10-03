# Write your MySQL query statement below

select a.name Employee
from Employee a, Employee b
where a.managerId = b.id and
        a.salary > b.salary