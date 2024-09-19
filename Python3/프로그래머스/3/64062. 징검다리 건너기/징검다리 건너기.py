def solution(stones, k):
    def binarySearch(stones, k, mid):
        cnt = 0
        for stone in stones:
            if stone - mid <= 0:
                cnt += 1
                if cnt >= k :
                    return False
            else:
                cnt = 0
        return True
    
    left, right = 1, max(stones)
    while left <= right:
        mid = (left + right)//2
        if binarySearch(stones, k, mid):
            left = mid + 1
        else: 
            right = mid - 1
    return left
                    
    