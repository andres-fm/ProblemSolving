T = int(input())
for _ in range(T) :
    n = int(input())
    a = int(input())
    b = int(input())
    set_final_stone = set()
    for i in range(n) :
        set_final_stone.add(i*a+(n-1-i)*b)
    print(*sorted(set_final_stone))
