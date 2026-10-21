# Ejercicio 9

# 1. Solicitud de datos
nombre = "Daniel"
anio_nacimiento = "2007"
altura = "1.85"

# 2.Cálculo de edad
anio_nacimiento = int(anio_nacimiento)
edad = 2026 - anio_nacimiento
altura = float(altura)

# 3. Mensaje final
print("--- FICHA REGISTRADA ---")
print(f"Nombre: {nombre} (Tipo: {type(nombre)})")
print(f"Edad: {edad} años (Tipo: {type(edad)})")
print(f"Altura: {altura} m (Tipo: {type(altura)})")
