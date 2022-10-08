# Write your MySQL query statement below

select name from
    salesPerson where
        name  not in
        (



            select  a.name
            from salesPerson a, company b, orders c
            where c.com_id = b.com_id and
                    c.sales_id = a.sales_id and
                    b.name = 'RED'
        )