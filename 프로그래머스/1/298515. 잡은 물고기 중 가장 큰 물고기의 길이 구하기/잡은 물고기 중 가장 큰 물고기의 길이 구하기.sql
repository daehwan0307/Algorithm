-- 코드를 작성해주세요
select CONCAT(MAX(LENGTH), 'cm') AS MAX_LENGTH from FISH_INFO where FISH_INFO.LENGTH = (select MAX(FISH_INFO.LENGTH) from FISH_INFO) ;