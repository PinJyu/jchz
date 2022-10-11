# Write your MySQL query statement below
select employee_id
from (
         select a.employee_id
         from employees a
                  left join salaries b on a.employee_id = b.employee_id
         where b.salary is null
         union
         select b.employee_id
         from employees a
                  right join salaries b on a.employee_id = b.employee_id
         where name is null
     )
         a
order by employee_id;