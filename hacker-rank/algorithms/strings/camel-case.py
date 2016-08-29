import sys
string = input()
words = 1
for letter in string :
    if letter == letter.upper() :
        words += 1
print(words)
