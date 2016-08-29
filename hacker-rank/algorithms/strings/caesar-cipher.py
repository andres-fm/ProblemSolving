#uppercase(65, 90) ascii value
#lowercase(97, 122) ascii value
import re
n = int(input())
s = list(input())
k = int(input())
for i in range(len(s)) :
    if ord(s[i]) < 123 and ord(s[i]) > 96 :
        # modular arithmetic
        s[i] = chr((ord(s[i])-96+k) % 26 + 96) if (ord(s[i])-96+k) % 26 != 0 else 'z'
    elif ord(s[i]) < 91 and ord(s[i]) > 64 :
        # modular arithmetic
        s[i] = chr((ord(s[i])-64+k) % 26 + 64) if (ord(s[i])-64+k) % 26 != 0 else 'Z'
    print(s[i], end = '')
