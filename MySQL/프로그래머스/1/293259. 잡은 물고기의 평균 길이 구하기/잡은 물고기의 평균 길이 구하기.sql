-- FROM : 테이블 지정
-- AVG() : 평균값 함수
-- IFNULL() : 첫번째인 LENGTH가 NULL이면 10을 반환하고, NULL이 아니면 LENGTH를 반환
-- ROUND() : 반올림(2는 소수점 2자리까지 반올림 ex. 1.23)
-- AS : 결과에 테이블 컬럼 이름 지정

select round(avg(ifnull(LENGTH, 10)), 2) as "AVERAGE_LENGTH"
from FISH_INFO; 