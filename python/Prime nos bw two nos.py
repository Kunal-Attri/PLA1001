from Basic_Functions import get_integer, isprime, isprime_eratostheses_sieve
from time import time

while True:
    ini_no = get_integer('Initial no: ')
    final_no = get_integer('Final no: ')
    
    print(f'Prime no.s in range from {ini_no} to {final_no} are: ')


# My Method
    print("\nMy method:")
    total = 0
    a = time()
    for i in range(ini_no, final_no + 1):
        if isprime(i) and i != 1:
#            print(i)
            total += 1
    if total == 0:
        print('None')
    else:
        print(f"Total = {total}")
    print(f"Time = {time() - a}\n")



# Eratosthesenos method
#    print("\nSimple Sieve method:")
#    total = 0
#    a = time()
#    total = isprime_eratostheses_sieve(final_no)
#    if len(total) == 0:
#        print('None')
#    else:
#        print(f"Total = {len(total)}")
#    print(f"Time = {time() - a}\n")
    
    
    
        
    print('')
    if input("Wanna quit?(y/n): ") == 'y':
        break
