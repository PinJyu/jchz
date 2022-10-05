
select
    a.id,
    (select revenue from department where id = a.id and month = 'Jan') Jan_Revenue,
    (select revenue from department where id = a.id and month = 'Feb') Feb_Revenue,
    (select revenue from department where id = a.id and month = 'Mar') Mar_Revenue,
    (select revenue from department where id = a.id and month = 'Apr') Apr_Revenue,
    (select revenue from department where id = a.id and month = 'May') May_Revenue,
    (select revenue from department where id = a.id and month = 'Jun') Jun_Revenue,
    (select revenue from department where id = a.id and month = 'Jul') Jul_Revenue,
    (select revenue from department where id = a.id and month = 'Aug') Aug_Revenue,
    (select revenue from department where id = a.id and month = 'Sep') Sep_Revenue,
    (select revenue from department where id = a.id and month = 'Oct') Oct_Revenue,
    (select revenue from department where id = a.id and month = 'Nov') Nov_Revenue,
    (select revenue from department where id = a.id and month = 'Dec') Dec_Revenue
from (
         select distinct id from department
     ) a
;
