import heapq
def solution(genres, plays):
    answer = []
    genres_song = {}
    total_play = {}
    for i in range(len(genres)):
        genre = genres[i]
        play = plays[i]
        if genre not in genres_song:
            genres_song[genre] = []
            total_play[genre] = 0
        heapq.heappush(genres_song[genre], (-play, i))
        total_play[genre] += play
    sorted_genre = sorted(total_play, key = total_play.get, reverse = True)
    for genre in sorted_genre:
        cnt = 0
        while cnt < 2 and genres_song[genre]:
            play, song_id = heapq.heappop(genres_song[genre])
            cnt += 1
            answer.append(song_id)
    
    return answer