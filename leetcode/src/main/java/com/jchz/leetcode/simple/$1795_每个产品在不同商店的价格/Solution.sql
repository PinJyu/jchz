select product_id, 'store1' store, store1 price
from products a
where a.store1 is not null
union all
select product_id, 'store2' store, store2 price
from products a
where a.store2 is not null
union all
select product_id, 'store3' store, store3 price
from products a
where a.store3 is not null