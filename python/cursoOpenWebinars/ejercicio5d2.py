year=int(input("AÃ±o:"))		
if year%4==0 and year%100!=0 or year%400==0:
    print("Bisiesto")
else:
    print("No bisiesto")