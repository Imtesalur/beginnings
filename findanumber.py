print("enter a number")
arr = list(range(1, 110))
# take a number as an input and check if that number exists in a
n = int(input())
if n in arr:
    print("number in array")
else:
    print("number not in array")