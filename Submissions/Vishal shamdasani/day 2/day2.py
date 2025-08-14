n=int(input("enter n: "))
x=0
t=0
for i in range(n):
    x=x^int(input("enter number: "))
    t=t^i
    print(x,t)
t=t^n
print(t^x)
