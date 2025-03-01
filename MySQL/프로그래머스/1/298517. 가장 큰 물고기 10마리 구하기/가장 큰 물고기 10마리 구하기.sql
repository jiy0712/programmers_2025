-- limit : 선택 (10이면 상위 10개행만 선택)
select ID, LENGTH
from FISH_INFO
order by ifnull(LENGTH, 10) desc, ID
limit 10