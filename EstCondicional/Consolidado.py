def ejercicio_31 ():
    #Declarar Variables
    edad:int
    mensaje:str
    #Datos de Entrada
    edad=int(input("Ingrese su edad:"))
    #Proceso y Datos de Salida
    if edad>=18:
        mensaje=(f"Puede votar porque su edad es {edad}")
    else:
        mensaje=(f"No puede votar porque su edad es {edad}")
    #Datos de Salida
    print(mensaje)
def ejercicio_32 ():
    #Declarar Variables
    pagohora:float
    cantidadhora:int
    sueldomensual:float
    #Datos de Entrada
    pagohora=float(input("Ingrese el costo por hora:"))
    cantidadhora=int(input("Ingrese cantidad horas trabajadas en la semana:"))
    #Proceso y Datos de Salida
    if cantidadhora>40:
     sueldomensual=40*pagohora+2*((cantidadhora-40)*pagohora)
    else:
     sueldomensual=cantidadhora*pagohora
    #Datos de Salida
    print(f"El sueldo del trabajador es {sueldomensual}")
def ejercicio_33 ():
    #Definir variables
    cantidad:int
    mensaje:str
    #Datos de entrada
    cantidad=int(input("Ingrese la cantidad de dinero: "))
    #Proceso
    if cantidad>=251:
        mensaje=("Puedes regalar un anillo.")
    elif cantidad>=101 and cantidad<251:
        mensaje=("Puede regalar flores.")
    elif cantidad>=11 and cantidad<101:
        mensaje=("Puede regalar chocolate.")
    else:
        mensaje=("Puede regalar una tarjeta.")
    #Datos de salida
    print(mensaje)
def ejercicio_34 ():
    #Definir variables
    horas:float()
    cobroh:float()
    total:float()
    mensaje:str()
    #Datos de entrada
    horas=float(input("Ingrese las horas estacionadas: "))
    #Proceso
    if horas>=10:
        cobroh=2.00
    elif horas>=5 and horas<10:
        cobroh=3.00
    elif horas>=2 and horas <5:
        cobroh=4.00
    else:
        cobroh=5.00
    total=cobroh*horas
    #Datos de salida
    print(f"El total a pagar es: {total}")
def ejercicio_35 ():
    #Definir variables
    horas:float()
    cobroh:float()
    total:float()
    mensaje:str()
    #Datos de entrada
    horas=float(input("Ingrese las horas estacionadas: "))
    #Proceso
    if horas>=10:
        cobroh=2.00
    elif horas>=5 and horas<10:
        cobroh=3.00
    elif horas>=2 and horas <5:
        cobroh=4.00
    else:
        cobroh=5.00
    total=cobroh*horas
    #Datos de salida
    print(f"El total a pagar es: {total}")
def ejercicio_36 ():
    #Definir variables
    precio:float()
    total:float()
    totDes:float()
    descuento:float()
    #Datos de entrada
    precio=float(input("Ingrese el precio: "))
    #Proceso
    if precio>=200:
        descuento=0.15
    elif precio>=100 and precio<200:
        descuento=0.12
    else:
        descuento=0.10
    totDes=precio*descuento
    total=precio-totDes
    #Datos de salida
    print(f"El total a pagar es: {total}")
def ejercicio_37 ():
    #Definir variables
    años:float
    promedio:float
    mensaje:str
    #Datos de entrada
    años=float(input("Ingrese su edad: "))
    promedio=float(input("Ingrese su promedio: "))
    #proceso
    if años>18 and promedio>=18:
        mensaje=("Su beca mensual es de: S/2000")
    elif años>18 and promedio>=15 and promedio<18:
        mensaje=("Su beca mensual es de: S/1000")
    elif años>18 and promedio>=12 and promedio<15:
        mensaje=("Su beca mensual es de: S/500")
    elif años<=18 and promedio>=18:
        mensaje=("Su beca mensual es de: S/3000")
    elif años<=18 and promedio>=16 and promedio<18:
        mensaje=("Su beca mensual es de: S/2000")
    elif años>=18 and promedio>=12 and promedio<16:
        mensaje=("Su beca mensual es de: S/1000")
    else:
        mensaje=("Se le invita a seguir estudiando y mejorar su promedio en el siguiente ciclo academico")
    #Datos de salida
    print(mensaje)
def ejercicio_38 ():
    #Declarar Variables
    anhoAnti:int
    sueldo:float
    bonoAnti:float=0
    bonoSueldo:float
    bonoMayor:float
    #Datos de Entrada
    anhoAnti=int(input("Ingrese anho de antiguedad:"))
    sueldo=float(input("Ingrese el sueldo reciente:"))
    #Proceso y Datos de Salida
    if anhoAnti>2 and anhoAnti<5:
     bonoAnti=sueldo*0.20
    elif anhoAnti>=5:
     bonoAnti=sueldo*0.30

    if sueldo>3500:
     bonoSueldo=sueldo*0.10
    elif sueldo>=1000 and sueldo<=3500:
     bonoSueldo=sueldo*0.15
    else:
     bonoSueldo=sueldo*0.25

    if bonoAnti>bonoSueldo:
     bonoMayor=bonoAnti
    else:
     bonoMayor=bonoSueldo
    #Datos de Salida  
    print(f"El Bono que corresponde es: {bonoMayor}") 
def ejercicio_39 ():
    #Definir variables
    tipo:str()
    toma:float()
    carToma:float()
    lentes:float()
    carLentes:float()
    enfer:float()
    carEnfer:float()
    años:float()
    carAños:float()
    cuota:float()
    total:float()
    #Datos de entrada
    tipo=str(input("Que tipo de poliza quiere: "))
    años=float(input("Ingrese cuantos años tiene: "))
    print("Respondo con 1 = si o 2 = no")
    lentes=float(input("¿Usa lentes?: "))
    toma=float(input("¿Tiene por hábito beber alcohol?: "))
    enfer=float(input("¿Padece alguna enfermedad, cómo deficiencia cardíaca o diabetes?: "))
    #proceso
    if tipo=="A" or tipo=="a":
        cuota=1200
    else:
        cuota=950
    if años>40:
        carAños=cuota*0.2
    else:
        carAños=cuota*0.1
    if toma==1:
        carToma=cuota*0.1
    else:
        carToma=cuota*0
    if lentes==1:
        carLentes=cuota*0.05
    else:
        carLentes=cuota*0
    if enfer==1:
        carEnfer=cuota*0.05
    else:
        carEnfer=cuota*0
    total=cuota+carAños+carEnfer+carLentes+carToma
    #Datos de salida
    print(f"El costo total de la poliza es: {total,cuota,carAños,carEnfer,carLentes,carToma}")
def ejercicio_310():
    #Definir variables
    dinero:float()
    pagoKm:float()
    mensaje:str()
    tumbes:float()
    chiclayo:float()
    lima:float()
    tacna:float()
    #Datos de entrada
    dinero=float(input("Ingrese la cantidad de dinero: "))
    pagoKm=float(input("Ingrese el pago por Km: "))
    #proceso
    tumbes=pagoKm*1800
    chiclayo=pagoKm*1200
    lima=pagoKm*800
    tacna=pagoKm*750
    if dinero>=tumbes:
        mensaje=("Puede viajar a Tumbes, Chiclayo, Lima, y Tacna")
    elif dinero>=chiclayo and dinero<tumbes:
        mensaje=("Puede viaja a Chiclayo, Lima, y Tacna")
    elif dinero>=lima and dinero<chiclayo:
        mensaje=("Puede viajar a Lima, y Tacna")
    elif dinero>=tacna and dinero<lima:
        mensaje=("Puede viajar a Tacna")
    else:
        mensaje=("No puede viajar F")
    #Datos de salida
    print(mensaje)
ejercicio_33()