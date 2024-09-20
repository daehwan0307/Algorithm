
SELECT  HD.DEPT_ID
        ,HD.DEPT_NAME_EN
        ,ROUND(AVG(HE.SAL), 0) AS AVG_SAL
  FROM  HR_DEPARTMENT AS HD
  JOIN  HR_EMPLOYEES AS HE
    ON  HE.DEPT_ID = HD.DEPT_ID
    
    group by HE.dept_id
    order by AVG_SAL desc