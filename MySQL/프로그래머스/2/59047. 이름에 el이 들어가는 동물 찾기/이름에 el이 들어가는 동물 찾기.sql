select ANIMAL_ID, NAME
from ANIMAL_INS 
where LOWER(NAME) like '%el%' and ANIMAL_TYPE='Dog'
-- like 문자열에 패턴을 포함한 값 찾기 (el 들어간 동물 찾기)
-- 소문자로 만들어 이름에 el 들어가는 동물 찾기
order by NAME;
