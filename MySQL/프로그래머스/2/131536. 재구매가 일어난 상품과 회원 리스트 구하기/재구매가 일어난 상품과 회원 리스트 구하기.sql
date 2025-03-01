-- group by : 데이터를 그룹화
-- having : 그룹화한 데이터에 조건(제품 2회이상 구매 경우)
-- order by : ASC(오름차순), desc : 내림차순
select USER_ID, PRODUCT_ID
from ONLINE_SALE
group by USER_ID, PRODUCT_ID
having count(PRODUCT_ID) >= 2
order by user_id, product_id desc;
