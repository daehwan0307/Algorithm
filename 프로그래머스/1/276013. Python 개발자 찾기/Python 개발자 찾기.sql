-- 코드를 작성해주세요
select di.ID, di.EMAIL, di.FIRST_NAME, di.LAST_NAME from DEVELOPER_INFOS di where di.skill_1= 'Python' or di.skill_2 = 'Python' or di.skill_3 = 'Python' order by di.Id asc;