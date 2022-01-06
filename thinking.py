def marathon(age):
    if age <= 40 and age >= 18:
        print("you can participate in marathon")
    elif age >= 40:
        print("you are too old to participate in marathon")
    else:
        print("you are too young to participate")


for x in range(10):
    marathon(int(input()))