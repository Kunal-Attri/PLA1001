from Basic_Functions import get_integer

def swap(a):
    a = str(bin(a))[2:]
    if len(a) > 8:
        return '0b00000000'
    while len(a) < 8:
        a = '0' + a
    a = '0b' + a[4:] + a[:4]
    return a

inp = get_integer('Number: ')
a = swap(inp)
print(a)
print(int(a, 2))
