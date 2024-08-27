import heapq
def solution(n, works):
    answer = 0
    works = [- work for work in works]
    heapq.heapify(works)
    for i in range(n):
        work = heapq.heappop(works)
        if work ==  0:
            break
        heapq.heappush(works, work + 1)
    
    for work in works:
        answer += work * work
    return answer