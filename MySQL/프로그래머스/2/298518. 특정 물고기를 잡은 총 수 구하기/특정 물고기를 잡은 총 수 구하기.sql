-- count(*) : 조건을 만족하는 레코드 개수 계산 함수
-- where : 해당하는 것 찾기 (조건)

select count(*) as FISH_COUNT
from FISH_INFO 
where FISH_TYPE in (
    select FISH_TYPE
    from FISH_NAME_INFO 
    where FISH_NAME in ('BASS', 'SNAPPER') 
);
