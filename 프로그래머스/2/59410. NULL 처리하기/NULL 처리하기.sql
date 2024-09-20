-- 코드를 입력하세요
SELECT AI.ANIMAL_TYPE, ifnull(AI.NAME,'No name') as NAME, AI.SEX_UPON_INTAKE from ANIMAL_INS as AI 
