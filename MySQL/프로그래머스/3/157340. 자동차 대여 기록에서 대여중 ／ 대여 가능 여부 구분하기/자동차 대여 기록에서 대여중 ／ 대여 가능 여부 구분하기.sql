-- 코드를 입력하세요
SELECT CAR_ID, 
MAX(CASE # 2022년 10월 16일에 대여중인 차를 찾기 위하여 CASE를 사용하여 BETWEEN을 이용하여 날짜 사이에 이 날짜가 있는지 구하였다.
WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중' 
ELSE '대여 가능' 
END) AS 'AVAILABILITY' # MAX를 사용하여 같은 CAR_ID에 '대여중'인 차가 있을 경우 '대여중'이 우선적으로 출력 되도록 만들어 주었다.
# MAX를 사용하면 사전 순으로 가장 큰 값을 반환하는데, '대여중'이 '대여 가능'보다 사전 순으로 뒤에 오므로, 하나라도 '대여중' 상태가 있다면 '대여중'이 최종 결과가 된다.
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC