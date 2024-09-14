-- 코드를 입력하세요
SELECT OS.USER_ID, OS.PRODUCT_ID 
    from ONLINE_SALE as OS
    group by OS.USER_ID , OS.PRODUCT_ID
    having  COUNT(*)> 1
    order by OS.USER_ID ASC, OS.PRODUCT_ID DESC