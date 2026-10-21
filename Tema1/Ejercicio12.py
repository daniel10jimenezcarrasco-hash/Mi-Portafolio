#Ejercicio 12

edad = input("Edad: ")
es_estudiante = input("¿Es estudiante? (si/no): ")
monto = input("Monto de compra: ")

aplica_descuento = (int(edad) > 65) or (es_estudiante.strip().lower() == "si" and float(monto) > 50)

print("¿Aplica descuento?: " + str(aplica_descuento))
