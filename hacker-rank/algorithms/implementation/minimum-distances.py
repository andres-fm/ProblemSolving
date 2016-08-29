n = int(input())
array = [int(_) for _ in input().split()]
distances = {}
for i in range(n):
    if array[i] in distances :
        distances[array[i]].append(i)
    else :
         distances[array[i]] = [i]
min_distance = n 
exists = False
for indices in distances.values() :
    for j in range(len(indices)-1) :
        if indices[j+1]-indices[j] < min_distance :
            min_distance = indices[j+1]-indices[j]
            exists = True
print(min_distance if exists else -1)
            
