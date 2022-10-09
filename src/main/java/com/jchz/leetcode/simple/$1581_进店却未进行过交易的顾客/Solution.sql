
select customer_id, count(*) count_no_trans
from visits a
         left join transactions b on a.visit_id = b.visit_id
where b.visit_id is null
group by a.customer_id;