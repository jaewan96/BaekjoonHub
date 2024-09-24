from collections import deque
def solution(n, edge):
    visit = [0 for _ in range(n+1)]
    visit[0] = -1
    visit[1] = -1
    node = [[] for _ in range(n+1)]
    for i, j in edge:
        node[j].append(i)
        node[i].append(j)
    visit_cnt = 0
    q = deque()
    for i in node[1]:
        q.append((i, 1))
        visit[i] = 1
        visit_cnt += 1
    while visit_cnt < n-1:
        node_num, cnt = q.popleft()
        
        for num in node[node_num]:
            if visit[num] == 0:
                visit[num] = cnt+1
                visit_cnt += 1
                q.append((num, cnt+1))
    max_num = max(visit)
    
    return visit.count(max_num)