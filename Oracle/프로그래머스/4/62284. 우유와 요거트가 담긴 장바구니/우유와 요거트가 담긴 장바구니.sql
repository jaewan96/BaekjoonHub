-- 코드를 입력하세요
SELECT DISTINCT(Y.CART_ID)
FROM (SELECT C.CART_ID
     FROM CART_PRODUCTS C
     WHERE C.NAME = 'Yogurt') Y
INNER JOIN (SELECT C.CART_ID
     FROM CART_PRODUCTS C
     WHERE C.NAME = 'Milk') M
ON Y.CART_ID = M.CART_ID
ORDER BY CART_ID