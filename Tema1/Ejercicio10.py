celsius_str = input("Ingrese la temperatura en °C: ")

celsius = float(celsius_str)

F = (celsius * 9 / 5) + 32

print(f"{celsius_str} °C equivalen a {F:.1f} °F")
