def solution(n, stations, w):
    answer = 0
    W = w * 2 + 1
    if stations[0] - w-1  > 0:
        start = stations[0] - w -1
        answer += (start + W -1) // W 
        
    for i in range(len(stations)-1):
        if stations[i] + w < stations[i+1] - w :
            mid = stations[i+1] -(w *2) -1 - stations[i] 
            answer += (mid + W - 1)//W           
    if stations[-1] + w < n:
        end = n - stations[-1] - w
        answer += (end + W -1) // W
    return answer