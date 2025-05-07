-- 코드를 입력하세요
SELECT  H.HISTORY_ID, 
        FLOOR (H.DURATION * C.DAILY_FEE * (1 - NVL(P.DISCOUNT_RATE, 0) / 100)) AS FEE
FROM (SELECT *
     FROM CAR_RENTAL_COMPANY_CAR 
     WHERE CAR_TYPE = '트럭') C
INNER JOIN (SELECT HISTORY_ID, CAR_ID, (END_DATE - START_DATE +1) AS DURATION
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
           ) H
ON C.CAR_ID = H.CAR_ID
LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
ON C.CAR_TYPE = P.CAR_TYPE
AND (
    (H.DURATION >= 7 AND H.DURATION < 30 AND P.DURATION_TYPE = '7일 이상') OR
    (H.DURATION >= 30 AND H.DURATION < 90 AND P.DURATION_TYPE = '30일 이상') OR
    (H.DURATION >= 90 AND P.DURATION_TYPE = '90일 이상')
)
ORDER BY FEE DESC, H.HISTORY_ID DESC


-- INNER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
-- ON C.CAR_TYPE = P.CAR_TYPE
-- AND (CASE WHEN H.DURATION >= 90 THEN (SELECT REPLACE(DISCOUNT_RATE, '%', '')
--                                       FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
--                                       WHERE CAR_TYPE = '트럭'
--                                       AND DURATION_TYPE = '90일 이상')
--          WHEN H.DURATION >= 30 THEN (SELECT REPLACE(DISCOUNT_RATE, '%', '')
--                                       FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
--                                       WHERE CAR_TYPE = '트럭'
--                                       AND DURATION_TYPE = '30일 이상')
--          WHEN H.DURATION >= 7 THEN (SELECT REPLACE(DISCOUNT_RATE, '%', '')
--                                       FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
--                                       WHERE CAR_TYPE = '트럭'
--                                       AND DURATION_TYPE = '7일 이상')
--          ELSE 0)
--          -- END AS DISCOUNT_RATE)