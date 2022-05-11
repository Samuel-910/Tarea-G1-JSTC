def check():
    num:float()
    num=float(input("Ingrese el primer numero: ")) 
    if num & 1 == 0:
        print("even")
    else:
        print("odd")
check()