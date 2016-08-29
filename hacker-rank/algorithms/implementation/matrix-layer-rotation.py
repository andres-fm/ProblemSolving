def rotate(r, c, n, m) : #n recorrido horizontal, m recorrido vertical
    temp = matrix[r][c]
    for k in range(n-1) :
        matrix[r][c+k] = matrix[r][c+k+1]
    for k in range(m-1) :
        matrix[r+k][c+n-1] = matrix[r+k+1][c+n-1]
    for k in range(n-1) :
        matrix[r+m-1][c+n-1-k] = matrix[r+m-1][c+n-1-k-1]
    for k in range(m-2) :
        matrix[r+m-1-k][c] = matrix[r+m-1-k-1][c]
    matrix[r+1][c] = temp
        
r, c, rotations = map(int, input().split())
matrix = [input().split() for _ in range(r)]
q = min(c, r) 
for j in range(0, q, 2) :
    i = j//2
    modular_rotations = rotations % (2*(c-j+r-j)-4)
    for _ in range(modular_rotations) :
        rotate(i, i, c-j, r-j)
for row in matrix :
    print(*row)
