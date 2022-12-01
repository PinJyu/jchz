
select a.id
from weather a, weather b
where datediff(a.recorddate, b.recorddate) = 1 and
        a.temperature > b.temperature and b.id is not null