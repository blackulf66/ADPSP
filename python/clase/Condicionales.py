#ejercicio1
age = int(input("Cuál es tu edad? "))
if age < 18:
    print (" menor de edad.");
else:
    print(" mayor de edad.");

#ejercicio2


contrasenya1 = "The_BATMAN"

contrasenya2 = input("Introduce la contraseña: ")
if contrasenya1 == contrasenya2:

    print("contraseña aceptada");

else:

    print("La contraseña no es la misma");

#ejercicio3
n1 = float(input("Introduce el dividendo: "))

n2 = float(input("Introduce el divisior: "))

if n2 == 0:

    print("NoNONONONONONONONONONO");

else:

    print(n1/n2)

#ejercicio4
n = int(input("Introduce un número: "))

if n % 2 == 0:

    print("El número " + str(n) + " es par")

else:
    print("El número " + str(n) + " es impar")

#ejercicio 5
edad = int(input("cuantos años tienes?"))

im = float(input("¿Cuales son tus ingresos mensuales?"))

if edad > 16 and im >= 1000:

    print("Tienes que tributar")

else:

    print("No tienes que tributar")