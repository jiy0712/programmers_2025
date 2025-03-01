select ANIMAL_ID, NAME
from ANIMAL_INS
where INTAKE_CONDITION != 'Aged'; -- 'Aged'가 아닌 동물 (나이가 많은 동물 제외)