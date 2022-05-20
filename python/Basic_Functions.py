import math
from os import system, name
from array import *
from threading import Thread

basic_prime = array('i', [3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97])


def get_integer(msg="Number: ", wrng_msg="Invalid Input"):
    try:
        i = int(input(msg))
    except ValueError:
        print(wrng_msg)
        return get_integer(msg, wrng_msg)
    else:
        return i


def get_float(msg="Number: ", wrng_msg="Invalid Input"):
    try:
        f = float(input(msg))
    except ValueError:
        print(wrng_msg)
        return get_float(msg, wrng_msg)
    else:
        return f


def into_integer(x, msg='Cannot be converted into a integer'):
    try:
        x = int(x)
    except ValueError:
        print(msg)
    else:
        return x


def isodd(num):
    odd = True
    if num % 2 == 0:
        odd = False
    return odd


def iseven(num):
    even = True
    if num % 2 != 0:
        even = False
    return even


def isprime(num):
    prime = True
    if iseven(num) and num / 2 != 1:
        prime = False
    if isodd(num):
        for i in basic_prime:
            if num % i == 0 and num / i == 1:
                break
            elif num % i == 0 and num / i != 1:
                prime = False
        if prime:
            for i in range(101, int(math.sqrt(num) + 1), 2):
                if num % i == 0:
                    prime = False
                    break
    return prime


def isprime_eratostheses_sieve(endNum):
	nums = array('i', [])
	for i in range(2, endNum+1):
		nums.append(i)
	for i in range(2, int(math.sqrt(endNum)) + 1):
		temp = 2
		a = i * temp
		while a <= endNum:
			if a in nums:
				nums.remove(a)
			temp += 1
			a = i * temp
	return nums


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


def factorial(num):
    return math.factorial(num)


def clear():
    if name == 'posix':
        system('clear')
    if name == 'nt':
        system('cls')
