delete from Person where id not in (
    select id from (
                       select min(id) id from Person group by email
                   ) x
)
