import math
s = list(input())
c = math.ceil(math.sqrt(len(s)))
r = c if math.floor(math.sqrt(len(s)))*c < len(s) else math.floor(math.sqrt(len(s)))
grid = []
j = 0
for i in range(r) :
    row = s[j:j+c]
    grid.append([row[a] if a < len(row) else '' for a in range(c)])    
    j += c
for tup in zip(*grid) :
    print(''.join(tup), end = ' ')
