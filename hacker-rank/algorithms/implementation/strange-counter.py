import math
t = int(input())
col = math.floor(math.log((t+2)/3, 2)) + 1 
column_time = 3 * (math.pow(2, col-1)) - 2
column_value = column_time + 2
dif = t - column_time
result = column_value - dif
print(int(result))
