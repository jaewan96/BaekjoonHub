import heapq
def solution(operations):
    minHeap = []
    maxHeap = []
    check = {}
    for operation in operations:
        if operation.startswith("I "):
            _, number = operation.split()
            number = int(number)
            heapq.heappush(minHeap, number)
            heapq.heappush(maxHeap, -number)
            check[number] = check.get(number, 0) + 1
        elif operation == "D 1":
            while maxHeap and check[-maxHeap[0]] == 0:
                heapq.heappop(maxHeap)
            if maxHeap:
                maxValue = -heapq.heappop(maxHeap)
                check[maxValue] -= 1
        elif operation == "D -1":
            while minHeap and check[minHeap[0]] == 0:
                heapq.heappop(minHeap)
            if minHeap:
                minValue = heapq.heappop(minHeap)
                check[minValue] -= 1
    while maxHeap and check[-maxHeap[0]] == 0:
        heapq.heappop(maxHeap)
    while minHeap and check[minHeap[0]] == 0:
        heapq.heappop(minHeap)
    
    if minHeap and maxHeap:
        return [-maxHeap[0], minHeap[0]]
    else:
        return [0, 0]