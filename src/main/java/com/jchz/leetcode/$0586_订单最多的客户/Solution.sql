
select customer_number
from (

         select customer_number, count(*) size
         from orders
         group by customer_number
         order by count(*) desc
             limit 1
     ) as a
