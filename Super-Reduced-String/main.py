#!/bin/python3

import sys

from SuperStringReducer.SuperStringReducer import SuperStringReducer

if __name__ == '__main__':
    fptr = sys.stdout

    string = str(input())

    reducer = SuperStringReducer()
    result = reducer.get_super_reduced_string(string)

    fptr.write(result + '\n')

    fptr.close()
