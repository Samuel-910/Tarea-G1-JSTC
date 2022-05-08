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