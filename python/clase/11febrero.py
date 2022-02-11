import sqlite3
import csv

Peliculas = [

    ("vengadores", "universo cinematografico marvel"),
    ("vengadores2", "universo cinematografico marvel"),
    ("vengadores3", "universo cinematografico marvel"),
    ("vengadores4", "universo cinematografico marvel"),
    ("spider-man no way home", "universo cinematografico marvel"),
    ("doctor strange en el multiveso de la locura", "universo cinematografico marvel"),
]

with open("Peliculas.csv", "w", newline='') as csvfile:
    campos = ["titulo", "universo"]
    writer = csv.DictWriter(csvfile , fieldnames=campos)
    writer.writeheader()
    for titulo , universo in Peliculas:
        writer.writerow({"titulo":titulo, "universo":universo})

connection = sqlite3.connect('peliculas.sqlite')
cursor = connection.cursor()
cursor.execute('DROP TABLE IF EXISTS peliculas')
cursor.execute('''
CREATE TABLE "peliculas"("titulo" TEXT,
"universo" TEXT)
''')

