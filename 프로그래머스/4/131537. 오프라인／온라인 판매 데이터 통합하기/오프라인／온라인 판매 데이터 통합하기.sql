    SELECT DATE_Format(SALES_DATE, '%Y-%m-%d') as SALES_DATE, 
           PRODUCT_ID,
           USER_ID, 
           SALES_AMOUNT
        from ONLINE_SALE 
        where Month(SALES_DATE) = 3
union 
    SELECT DATE_Format(SALES_DATE, '%Y-%m-%d') as SALES_DATE,
           PRODUCT_ID, 
           Null as USER_ID,
           SALES_AMOUNT 
        from OFFLINE_SALE 
        where Month(SALES_DATE) = 3 
order by SALES_DATE, PRODUCT_ID, USER_ID 