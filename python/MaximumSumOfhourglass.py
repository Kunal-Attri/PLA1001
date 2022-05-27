

array = [[5, 7, 6, 2],
		 [8, 6, 9, 4],
		 [1, 2, 3, 5],
		 [0, 6, 8, 1]]

possible_sums = []

if len(array) < 3 or len(array[0]) < 3:
	print('Array size too small')

for i in range(1, len(array) - 1):
	 for j in range(1, len(array[0]) - 1):
	 	ts = array[i-1][j-1] + array[i-1][j] + array[i-1][j+1]
	 	ms = array[i][j]
	 	bs = array[i+1][j-1] + array[i+1][j] + array[i+1][j+1]
	 	s = ts + ms + bs
	 	possible_sums.append(s)

print(max(possible_sums))
