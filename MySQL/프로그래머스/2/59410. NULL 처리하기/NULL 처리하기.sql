select ANIMAL_TYPE,
        ifnull(Name, 'No name'), -- null인 경우 no name으로 대체
        SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID;