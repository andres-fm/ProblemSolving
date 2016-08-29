def match(i, j) :
    match = True
    for a in range(r) :
        for b in range(c) :
            if not grid[i+a][j+b] == pattern[a][b] :
                match = False
                break
        if not match :
            break
    return match
    
T = int(input())
for _ in range(T) :
    grid = []
    pattern = []
    R, C = map(int, input().split())
    for n in range(R) :
        grid.append(input())
    r, c = map(int, input().split())
    for m in range(r) :
        pattern.append(input())
    matches = False
    for i in range(R-r+1) :
        for j in range(C-c+1) :
            if grid[i][j] == pattern[0][0] and match(i, j) :
                matches = True
                break
        if matches :
            break
    print('YES' if matches else 'NO')
        
            
