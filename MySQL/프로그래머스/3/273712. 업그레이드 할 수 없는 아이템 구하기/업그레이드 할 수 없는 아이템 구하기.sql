select ITEM_ID, ITEM_NAME, RARITY
from ITEM_INFO
WHERE ITEM_ID NOT IN ( -- ITEM_ID로 있지 않다면
    select distinct PARENT_ITEM_ID
    from ITEM_TREE
    where PARENT_ITEM_ID is not null -- null이 아닌 것만 선택
)
order by ITEM_ID desc; -- 내림차순