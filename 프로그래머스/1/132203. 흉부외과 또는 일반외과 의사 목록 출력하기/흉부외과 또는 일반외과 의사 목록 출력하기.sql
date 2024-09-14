-- 코드를 입력하세요
SELECT d.dr_name, d.dr_id , d.mcdp_cd ,date_format(d.hire_ymd,'%Y-%m-%d') from DOCTOR as d where d.mcdp_cd = 'CS' or d.mcdp_cd ='GS' order by d.hire_ymd desc ,d.dr_name asc