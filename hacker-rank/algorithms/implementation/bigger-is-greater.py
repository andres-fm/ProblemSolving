def biggest_small(array) :
    border = array[0]
    minimum = 0
    bigger = [i for i in range(1, len(array)) if array[i] > border]
    if len(bigger) != 0 :
        minimum = bigger[0]
    for i in bigger :
        if array[i] < array[minimum] : 
            minimum = i
    if minimum == 0 :
        return None
    else :
        array[0] = array[minimum]
        array[minimum] = border        
        sort = sorted(array[1:])
        return [array[0]] + sort      

T = int(input())
for _ in range(T) :
    string = list(input())
    possible = False
    for i in range(len(string)-1, 0, -1) :
        left = string[:i-1]
        right = string[i-1:]
        bs = biggest_small(right)
        if bs != None :
            possible = True
            print(''.join(left + bs))
            break
    if not possible : 
        print('no answer')
        
