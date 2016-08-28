# computes the greates common divisor from two numbers
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
# (faster than factoring the numbers into primes or any other method)
def lcm(a, b) :
	return (a*b)//mcd(a,b)

# recursive version to compute the lcm from the numbers of an iterable
def lcm_rec(iterable) :
	if len(iterable) == 1 :
		return iterable[0]
	return lcm(iterable[0],lcm_rec(iterable[1:]))

# iterative version to compute the lcm from the numbers of an iterable
def lcm_it(iterable) :
	current = iterable[0]
	for i in range(1, len(iterable)) :
		current = lcm(current, iterable[i])
	return current

#print(mcm_rec(range(1,10000)))
#print(mcm_it(range(1,10000)))
