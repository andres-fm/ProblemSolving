"""returns a list of lists with all n C k combinations from the iterable, where n = cardinality(iterable).
   there are n!/(k!*(n-k)!) possible combinations"""
# iterable = the iterable from which the combinations will be taken
# k = the number of elements each combination will have
def comb(iterable, k) :
	if k < 0 :
		raise ValueError
	if k == 1 or k == 0 :
		return [[i] for i in iterable] if k == 1 else []
	return iterate(iterable, [], [], 1, -1, k)

""" auxiliar function to get the combinations """
""" general idea :
	for each recursive call I add an element to the accumulator inside the for bucle with its respective number of 
	iterations, after the recursive call that element is deleted to continue with the next one and so on """
# iterable = collection to get the combinations from
# combinations = the list that will contain all the combinations
# accumulator = to accumulate each combination
# element = the element number within the combination
# previous_i = the index from the previous element
# k = the number of elements each combination will have
def iterate(iterable, combinations, accumulator, element, previous_i, k) :
	# recursion base, the last (kth) element
	if element == k :
		for j in range(previous_i + 1, len(iterable)) :
			combinations.append(accumulator + [iterable[j]])
		return 
	for j in range(previous_i + 1, len(iterable) - (k-element)) :
		accumulator.append(iterable[j])
		iterate(iterable, combinations, accumulator, element + 1, j, k) #recursive_call
		del accumulator[-1]
	return combinations

#print(comb(range(50), 4))