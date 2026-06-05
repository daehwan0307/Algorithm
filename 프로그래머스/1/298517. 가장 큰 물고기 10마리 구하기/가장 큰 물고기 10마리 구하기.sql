-- 코드를 작성해주세요

select ID, LENGTH from( SELECT fi.ID, fi.LENGTH,
        RANK() OVER (ORDER BY LENGTH desc) AS RNK 
    FROM FISH_INFO fi  ) SUB where RNK <=10 order by RNK asc, ID asc;