# Brackets validator

#### You're working with an intern that keeps coming to you with Java code that won't run because the braces, brackets, and parentheses are off. To save you both some time, you decide to write a braces/brackets/parentheses validator.

<hr>

Let's say:

`'(', '{', '['` are called "openers."

`')', '}', ']'` are called "closers."

Write an efficient function that tells us whether or not an input string's openers and closers are properly nested.

### Examples:

`"{ [ ] ( ) }"` should return `True`

`"{ [ ( ] ) }"` should return `False`

`"{ [ }"` should return `False`
