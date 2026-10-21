#Ejercicio 11

entrada_caramelos = input("Cantidad de caramelos: ")
entrada_alumnos = input("Cantidad de alumnos: ")

caramelos = int(entrada_caramelos)
alumnos = int(entrada_alumnos)

caramelos_por_alumno = caramelos // alumnos
caramelos_sobrantes = caramelos % alumnos

print("Cada alumno recibe:", int(caramelos) // int(alumnos), "caramelos.")
print("Sobran en la bolsa:", int(caramelos) % int(alumnos), "caramelos.")
