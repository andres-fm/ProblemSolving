def rearrange(i, value) :
    if i+1 == value :
        return True
    if i < n - 1 :
        for j in range(i+1-value) :
            if value > array[i-1] :
                return False
            temp = array[i-1]
            array[i-1] = array[i]
            array[i] = array[i+1]
            array[i+1] = temp
            i -= 1
    else :    
        if value > array[i-1] or value > array[i-2]:
            return False
        temp = array[i-2]
        array[i-2] = array[i-1]
        array[i-1] = array[i]
        array[i] = temp
        rearrange(i-1, value)
    return True   

T = int(input())
for _ in range(T) :
    n = int(input())
    array = list(map(int, input().split()))
    sort = True
    for i in range(1, n) :
        index = array.index(i)
        if not rearrange(index, i) :
            sort = False
    print('YES' if sort else 'NO')
    
