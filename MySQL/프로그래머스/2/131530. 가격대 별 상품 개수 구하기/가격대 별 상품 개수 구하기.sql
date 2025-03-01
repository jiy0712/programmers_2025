--  소수점을 내리고 10000단위로 그룹화 하기 위해
select FLOOR(PRICE/10000)*10000 as PRICE_GROUP, count(*) as PRODUCTS
from PRODUCT
group by PRICE_GROUP
order by PRICE_GROUP asc; -- 오름차순