def ejercicio1JSTC ():
    #Definir variables
    exCon:float()
    e:float()
    p:float()
    t:float()
    enPer:float()
    test:float()
    total:float()
    mensaje:str()
    #Datos de entrada
    exCon=float(input("Ingrese la nota de su examen(0-20): "))
    enPer=float(input("Ingrese la nota de entrevista personal(0-20): "))
    test=float(input("Ingrese la nota del test psicologico(0-20): "))
    #Proceso
    e=exCon*0.4
    t=test*0.25
    p=enPer*0.35
    total=e+p+t
    if total>20:
        mensaje=("Introdusca de nuevo los datos")
    elif total>=17:
        mensaje=("Su nivel es 4")
    elif total>=14 and total<17:
        mensaje=("Su nivel es 3")
    elif total>=11 and total<14:
        mensaje=("Su nivel es 2")
    else:
        mensaje=("Su nivel es 1, por ende no obtiene vacante")
    #Datos de salida
    print(mensaje)
def ejercicio2JSTC ():
    #Definir variables
    precio:float()
    igv:float()
    descuento:float()
    total:float()
    preFi:float()
    #Datos de entrada
    precio=float(input("Ingrese el precio del articulo: "))
    #Proceso
    if precio>=2000:
        descuento=precio*0.10
    elif precio>=1000 and precio<2000:
        descuento=precio*0.05
    elif precio>=500 and precio<1000:
        descuento=precio*0.02
    else:
        descuento=precio*0
    total=precio-descuento
    igv=total*0.18
    preFi=total+igv
    #Datos de salida
    print(f"El IGV total es: {igv}")
    print(f"El descuento total es: {descuento}")
    print(f"El total a pagar es: {preFi}")
def ejercicio3JSTC ():
    #Definir variables
    num1:float()
    num2:float()
    signo:str()
    total:float()
    #Datos de entrada
    num1=float(input("Ingrese el primer numero: "))
    num2=float(input("Ingrese el segundo numero: "))
    print("+ = suma")
    print("- = resta")
    print("/ = divicion")
    print("* = multiplicacion")
    print("^ = potencia")
    print("R = raiz")
    print("% = modulo de 2")
    signo=str(input("Ingrese el signo: "))
    #Proceso
    if signo=="+":
        total=num1+num2
    elif signo=="-":
        total=num1-num2
    elif signo=="/":
        total=num1/num2
    elif signo=="*":
        total=num1*num2
    elif signo=="^":
        total=num1**num2
    elif signo=="R":
        total=num1**(num2**-1)
    elif signo=="%":
        total=num1-num1
    #Datos de salida
    print(f"El resultado es {total}")
def ejercicio4JSTC ():
    #Definir variables
    años:float()
    genero:str()
    total:float()
    mensaje:str()
    #Datos de entrada
    años=float(input("Ingrese la cantidad de años: "))
    genero=str(input("Ingrese el genero (masculino o femenino): "))
    #Proceso
    if años>=70:
        mensaje=("Su vacuna es de tipo C")
    elif años>=16 and años<70 and genero=="masculino":
        mensaje=("Su vacuna es de tipo A")
    elif años>=16 and años<70 and genero=="femenino":
        mensaje=("Su vacuna es de tipo B")
    else:
        mensaje=("Su vacuna es de tipo A")
    #Datos de salida
    print(mensaje)
#Ejercicio5JSTC
#Definir variables
    num=float()
    #Datos de entrada
    num=float(input("Ingrese el numero del ejercicio(1-4): "))
    #Proceso
    if num>=5:
        print("Ese ejercicio no existe ingrese otro")
    elif num==4:
        ejercicio4JSTC()
    elif num==3:
        ejercicio3JSTC()
    elif num==2:
        ejercicio2JSTC()
    else:
        ejercicio1JSTC()