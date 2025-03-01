-- sum : 합게 계산 함수
select sum(PRICE) as TOTAL_PRICE
from ITEM_INFO
where RARITY = "LEGEND"