-- 코드를 입력하세요
SELECT ICECREAM_INFO.INGREDIENT_TYPE , Sum(FIRST_HALF.TOTAL_ORDER) from FIRST_HALF
join ICECREAM_INFO on ICECREAM_INFO.FLAVOR = FIRST_HALF.FLAVOR
group by ICECREAM_INFO.INGREDIENT_TYPE