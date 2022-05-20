
def minApples(k, m, n, s, w, e):
	if m <= k * s:
		return m
	elif m <= s * k + e + w:
		return (s * k + (m - s * k) * k)
	else:
		return -1


km = input("K M: ").split()
k, m = [int(i) for i in km]

nswe = input('N S W E: ').split()
n, s, w, e = [int(i) for i in nswe]

print('Apples required: ', end='')
print(minApples(k, m, n, s, w, e))
