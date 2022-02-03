#ejercicio1
a = ["Matemáticas", "Biologia","EF" ]
print(a)

#ejercicio2

Peliculas = ["IronMan 1",
             "Capitan America El Primer Vengador",
             "Thor",
             "IronMan 2",
             "Hulk" ,
             "Vengadores1",
             "thor2"
             "capitan america el soldado de invierno",
             "guardianes de la galaxia vol1",
             "ironman3",
             "antman",
             "vengadores age of ultron" ,
             "black panther",
             "doctor strange"
             "Spider-man homecoming"
             "capitan america civil war"
             "guardianes de la galaxia vol2"
             "thor ragnarok"
             "vengadores infinity war"
             "ant-man and the wasp"
             "capitana marvel"
             "avengers endgame"
             "Spider-man Far From Home"
             "Spider-man No Way Home"

                ,
             ""]
for i in Peliculas:
    print("Yo me he visto " + i)

#ejercicio4
a = []

for i in range(6):

    a.append(int(input("Introduce un número ganador: ")))

a.sort()

print("Los números ganadores son " + str(a))

#ejercicio5
n = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for i in range(1, 11):

    print(n[-i], end=", ");
#ejercicio7

alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
for i in range(len(alphabet), 1, -1):

    if i % 3 == 0:

        alphabet.pop(i-1)

print(alphabet);