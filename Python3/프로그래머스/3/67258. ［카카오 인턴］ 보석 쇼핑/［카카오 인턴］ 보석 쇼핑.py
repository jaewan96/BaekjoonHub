def solution(gems):
    answer = [0, len(gems) -1]
    total_gem = len(set(gems))
    want = {}
    start = 0
    min_length = len(gems)
    
    for end in range(len(gems)):
        gem = gems[end]
        
        if gem in want:
            want[gem] += 1
        else:
            want[gem] = 1
            
        while len(want) == total_gem:
            current_length = end - start
            if current_length < min_length:
                min_length = current_length
                answer = [start+1, end+1]
            
            left_gem = gems[start]
            want[left_gem] -= 1
            if want[left_gem] == 0:
                del want[left_gem]
            start += 1
    
    return answer