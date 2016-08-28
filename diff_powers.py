from itertools import combinations
"""
Finds the number of distinct elements of a n*m grid in which each entry is of the form i^j, i being the ith row
and j being the jth column. One trivial way to get it is:
len({i**j for i in range(1,n+1) for j in range(1, m+1)}), using python's set comprehensions; but it is veeeery slow.
Thus I made this algorithm to compute it a lot faster
"""

# computes the greates common divisor from two numbers using Euclides' algorithm
def gcd(a, b) :
	dividend = max(a,b)
	divisor = min(a,b)
	r = -1
	while r != 0 :
		r = divmod(dividend, divisor)[1]
		dividend = divisor
		divisor = r
	return dividend

# computes the least common multiple from two numbers given the fact that gcd(a,b)*lcm(a,b) = a*b
def lcm(a, b) :
	return (a*b) // gcd(a,b)

# computes the lcm from the numbers of an iterable
def lcm_it(iterable) :
	current = iterable[0]
	for i in range(1, len(iterable)) :
		current = lcm(current, iterable[i])
	return current

# inclusion/exclusion criteria
def ie_criteria(exp, m) :
	suma = 0
	for i in range(1, exp + 1) :
		for comb in combinations(range(1, exp + 1), i) :
			leastcm = lcm_it(comb)
			a = leastcm // min(comb)
			answer = m // a
			suma += int((-1)**(i+1)) * answer
	return suma

# computes the number of non repeated elements of the grid
# n, m represent the size of the grid
def non_repeated_elements(n, m) :
	""" 
	The only rows repeating numbers (not considering the first row) are those being the nth power 
	from a number, like 2^1, 2^2,..., 2^n, and the repeated numbers from each row are among its 'group',
	so I find the 'groups' and count the non-repeated numbers from each 'group' using the inclusion/exclusion criteria
	"""
	#the ones that may have repeated powers
	numbers = set()
	#finding those ones
	total = 0
	for i in range(2,int(n**.5)+1) :
		if i in numbers :
			continue
		j = 1
		while(i**j <= n) :
			numbers.add(int(i**j))
			j += 1
		total += ie_criteria(j-1, m)
	# -1 inside parentheses and +1 outside because of the 1st row
	total += (n - len(numbers) - 1) * m + 1
	return total

#print(non_repeated_elements(100000, 10000000))