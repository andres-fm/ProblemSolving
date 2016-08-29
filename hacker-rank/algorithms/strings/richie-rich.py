import sys
n,k = map(int, input().split())
number = list(input())
copy = number[0:]
changes = 0
possible = True
for i in range((n//2)+1) :
    j = n - 1 - i
    if number[i] == number[j] :
        continue
    elif number[i] > number[j] :
        number[j] = number[i]
    else :
        number[i] = number[j]
    changes += 1
    if changes > k :
        possible = False
        break      
if possible :
    for i in range((n//2)+1) :
        j = n - 1 - i
        if changes == k :
            break       
        if number[i] == '9' :
            continue
        if copy[i] != copy[j] or i == j :
            number[i] = number[j] = '9'
            changes += 1  
        elif changes + 2 > k :
            continue
        else :
            number[i] = number[j] = '9'
            changes += 2           
        
print(''.join(number) if possible else -1)
    
