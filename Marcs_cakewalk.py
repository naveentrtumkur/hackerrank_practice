#!/bin/python3

import sys

def marcsCakewalk(calorie):
    # Complete this function
    calorie.sort()
    i=len(calorie)-1
    sum = 0
    j =0
    while i>=0:
        sum += calorie[i] * (2**j)
        #print(i)
        #print(j)
        #print(calorie[i] * (2^j))
        j = j+1
        i = i-1
    return sum
        

if __name__ == "__main__":
    n = int(input().strip())
    calorie = list(map(int, input().strip().split(' ')))
    #print(calorie)
    result = marcsCakewalk(calorie)
    print(result)


