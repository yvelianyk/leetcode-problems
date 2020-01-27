select seller_id
from (
         select seller_id, sum(price) as suma
         from Sales
         group by seller_id
     ) a
where suma = (
    SELECT max(suma)
    FROM (
             select sum(price) as suma
             from Sales
             group by seller_id
         ) a
)
