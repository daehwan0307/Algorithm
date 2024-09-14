-- 코드를 입력하세요
SELECT MP.MEMBER_ID, MP.MEMBER_NAME, MP.GENDER, DATE_FORMAT(MP.DATE_OF_BIRTH,'%Y-%m-%d') as DATE_OF_BIRTH from MEMBER_PROFILE as MP
    where MP.DATE_OF_BIRTH like '%-03-%' and MP.TLNO is not null and MP.GENDER ='W'
    order by MP.MEMBER_ID ASC