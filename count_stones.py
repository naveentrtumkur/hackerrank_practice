#!/bin/python3

import sys

def gameOfStones(n):
    # Complete this function
    if n%7 == 0 or n%7 == 1:
        return "Second"
    else:
        return "First"

if __name__ == "__main__":
    t = int(input().strip())
    for a0 in range(t):
        n = int(input().strip())
        result = gameOfStones(n)
        print(result)


