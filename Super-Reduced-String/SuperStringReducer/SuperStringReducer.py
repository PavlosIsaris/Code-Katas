class SuperStringReducer:

    def get_super_reduced_string(self, string):
        stack = []
        for char in string:
            if stack and char == stack[-1]:
                stack.pop()
            else:
                stack.append(char)

        return ''.join(stack)
