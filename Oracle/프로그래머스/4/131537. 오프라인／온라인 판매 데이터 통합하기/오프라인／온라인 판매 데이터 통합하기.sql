-- 코드를 입력하세요

SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE 
WHERE SALES_DATE >= TO_DATE('2022-03-01', 'YYYY-MM-DD')
AND SALES_DATE < TO_DATE('2022-04-01', 'YYYY-MM-DD')
UNION
SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE, PRODUCT_ID, NULL USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE
WHERE SALES_DATE >= TO_DATE('2022-03-01', 'YYYY-MM-DD')
AND SALES_DATE < TO_DATE('2022-04-01', 'YYYY-MM-DD')
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID