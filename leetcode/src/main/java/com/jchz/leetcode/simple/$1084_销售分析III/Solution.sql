# Write your MySQL query statement below

select distinct b.product_id, b.product_name
from sales a, product b
where a.product_id = b.product_id
  and a.sale_date between '2019-01-01' and '2019-03-31'
  and not exists(select 1 from sales where product_id = a.product_id and (sale_date < '2019-01-01' or sale_date > '2019-03-31'))