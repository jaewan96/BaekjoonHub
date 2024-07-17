def solution(board, moves):
    answer = 0
    lst = []
    for i in moves:
        for j in range(len(board)):
            if board[j][i-1] != 0:
                if lst and lst[-1] == board[j][i-1]:
                    lst.pop()
                    answer += 1

                else:
                    lst.append(board[j][i-1])
                board[j][i-1] = 0
                break
    return answer * 2
