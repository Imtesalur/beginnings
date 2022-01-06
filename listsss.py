numbers = [9, 5, 3, 4, 1, 2, 0, 7, 8]
numbers.sort()
print(numbers)
numbers.reverse()
print(numbers)
print(numbers[:])
print(max(numbers))
print(min(numbers))
numbers.append(91)
print(numbers)
numbers.insert(6, 77)
numbers.remove(91)
print(numbers)
numbers.pop()
print(numbers)
numbers[4] = 91
"""
 if we want to swap a integer or variable or a value
there is a traditional METHOD
and there is a python METHOD too
"""
a = 7
b = 77
print(a, b)
a, b = b, a
print(a, b)