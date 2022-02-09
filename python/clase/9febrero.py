# def media(*args):

   # result = 0
   # n = 1
   # for arg in args:
      #  result += arg
      #  n+1
       # return result/n

# print(media(10))

# def cuenta_atras(num):
  #  num -= 1
   # if num > 0:
    #    print(num)
     #   cuenta_atras(num)
    # else:
    #    print("Boooooooom!")
    # print("Fin de la función", num)

# cuenta_atras(1000)

import math

def area(a, b):
    return a * b

resultado = area(2, 5)

print(resultado)

def radio(r):

    return pow(r,2 ) * math.pi

resultado  = radio(5)

print(resultado)

def relacion(a, b):
    if a > b:
        return 1
    if a < b:
        return -1
    else:
        return 0

print(relacion(8 ,8))

def intermedio(a, b):
    return a + b/2

print(intermedio(0,10))


lista = [1, 15, 0, 13, 15, 10, 13, 18, 1]

a = []

b = []

contador = 0

for element in lista:
    if contador % 2 == 0:
        a.append(element)
    else:
        b.append(element)
    contador += 1

print(a, b)











