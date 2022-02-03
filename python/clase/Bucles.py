#ejercicio1
p = input("Introduce una palabra: ")
for i in range(10):
    print(p)

#ejercicio2

edad = int(input("Cuantos años tienes?"))

for i in range(edad):

    print("Has cumplido " + str(i+1) + " años");

#ejercicio3
n = int(input("Introduce un número: "))

for i in range(1, n+1, 2):

    print(i, end=",")

#ejercicio4

n = int(input("Introduce un número: "))

for i in range(n, -1, -1):

    print(i, end=",")

#ejercicio6
n = int(input("Introduce la altura del triángulo: "))

for i in range(n):

   print("*"*(i+1));