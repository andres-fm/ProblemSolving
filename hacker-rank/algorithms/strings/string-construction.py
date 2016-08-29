n = int(input())
for _ in range(n):
    string = input()
    p = set()
    count = 0
    for i in string :
        if i not in p :
            count += 1
            p.add(i)
    print(count)
