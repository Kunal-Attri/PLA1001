from Basic_Functions import get_integer

def isPalindrome(a):
	return a[2:] == a[2:][::-1]


start = get_integer('Start: ')
end = get_integer('End: ')

for i in range(start, end+1):
	print(str(i)+'\n' if isPalindrome(str(bin(i))) else '', end='')
