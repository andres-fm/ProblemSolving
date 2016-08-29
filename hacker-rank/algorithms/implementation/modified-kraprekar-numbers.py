lower = int(input())
upper = int(input())
invalid = True
for i in range(lower, upper+1) :
    square = list(str(i*i))
    right_side = square[len(square)-len(str(i)):]
    left_side = square[:len(square)-len(str(i))]
    r = int(''.join(left_side)) if i > 3 else 0
    l = int(''.join(right_side)) 
    if r + l == i :
        invalid = False
        print(i, end = ' ')
if invalid :
    print('INVALID RANGE')
