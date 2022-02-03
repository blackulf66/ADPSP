#ejercicio 1
nombre = input("¿Cómo te llamas? ")

n = input("Introduce un número: ")

print((nombre) * int(n))

#ejercicio 2
nombre = input("¿Cómo te llamas? ")
print(nombre.upper())
print(nombre.lower())
print(nombre.title())

#ejercicio 3
nombre = input("¿Cómo te llamas? ")

print(nombre.upper() + "y tiene " + str(len(nombre)) + " letras")

#ejercicio 4
telefono = input("Introduce un número de teléfono con el formato correcto: ")
print('El número de teléfono es ', telefono[4:-3])

#ejercicio 5
frase = input("Introduce una frase: ")

print(frase[::-1])


