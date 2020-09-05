# Super Reduced String

This problem can be found on [Hackerrank](https://www.hackerrank.com/challenges/reduced-string/problem)

## Introduction

Steve has a string of lowercase characters in range `ascii[‘a’..’z’]`. He wants to reduce the string to its shortest length by doing a series of operations. In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. For instance, the string aab could be shortened to b in one operation.

## Function Description

Complete the superReducedString function in the editor below. It should return the super reduced string or Empty String if the final string is empty.

superReducedString has the following parameter(s):

`string`: a string to reduce

## Sample Inputs

### Sample Input 0

```bash
aaabccddd
```

### Sample Output 0

```bash
abd
```

### Explanation 0

Steve performs the following sequence of operations to get the final string:

```aaabccddd → abccddd → abddd → abd```

### Sample Input 1

```bash
aa
```

### Sample Output 1

```bash
''
```

### Sample Input 2

```bash
baab
```

### Sample Output 2

```bash
''
```

### Explanation 2

`baab → bb → ''`
