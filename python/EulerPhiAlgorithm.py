# To find Phi value of some no.
from Basic_Functions import isprime, get_integer
from math import sqrt

def get_factors(num):
	factors = dict()
	if num % 2:			# odd
		for i in range(3, int(sqrt(num)) + 1, 2):
			while num % i == 0 and isprime(i) and num != 1:
				factors[i] = factors.get(i, 0) + 1
				num /= i
	else:
		for i in range(2, int(sqrt(num)) + 1):
			while num % i == 0 and isprime(i) and num != 1:
				factors[i] = factors.get(i, 0) + 1
				num /= i
	return factors

def euler_phi(num):
	phiVal = 1
	if isprime(num):
		phiVal = num - 1
	else:
		factors = get_factors(num)
		for factor in factors:
			phiVal *= ((factor ** (factors[factor] - 1)) * (factor - 1))
	return phiVal


no = get_integer('Number: ')
print('Phi value: ' + str(euler_phi(no)))
