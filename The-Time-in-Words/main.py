#!/bin/python3

import sys

from TimeToWordsFormatter import TimeToWordsFormatter

if __name__ == '__main__':
    fptr = sys.stdout

    h = int(input())

    m = int(input())

    formatter = TimeToWordsFormatter()
    result = formatter.time_in_words(h, m)

    fptr.write(result + '\n')

    fptr.close()
