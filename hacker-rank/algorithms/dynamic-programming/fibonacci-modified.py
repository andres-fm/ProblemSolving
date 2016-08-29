values = input().split(" ")
a = int(values[0])
b = int(values[1])

def fibonacciM(n):
    if(n == 1):
        return a
    if(n == 2):
        return b
    return pow(fibonacciM(n-1), 2) + fibonacciM(n-2)

n = int(values[2])
print(fibonacciM(n));
