#factors a number, returns a list with the pairs of the factorization
def factor(number) :
    prime_factors = {}
    div = 2
    while number != 1 and div <= (number**0.5) :
        while number % div == 0 :
            number //= div
            prime_factors[div] = prime_factors[div] + 1 if div in prime_factors else 1
        div += 1
    if number != 1 :
        prime_factors[number] = 1        
    return prime_factors

def common_factors(a_factors, b_factors) :
	for p in a_factors :
		if p not in b_factors :
			b_factors[p] = 0
	for p in b_factors :
		if p not in a_factors :
			a_factors[p] = 0

def mcm(a, b) :
	facta = factor(a)  
	factb = factor(b)
	common_factors(facta, factb)
	lcm = 1
	for prime in facta :
		lcm *= prime**(max(facta[prime], factb[prime]))
	return lcm

def mcm_rec(iterable) :
	if len(iterable) == 1 :
		return iterable[0]
	return mcm(iterable[0],mcm_rec(iterable[1:]))

print(mcm_rec(range(1,600)))