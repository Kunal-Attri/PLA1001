from Basic_Functions import get_integer

n = get_integer("Value of n: ")

rotate = {'0':'0', '1':'1', '6':'9', '9':'6', '8':'8'}

for i in range(10**(n-1), 10**n+1):
	a = str(i)
	b = ''
	for ch in a[::-1]:
		b += (rotate.get(ch, 'a'))
	if a == b:
		print(a)
	
	

