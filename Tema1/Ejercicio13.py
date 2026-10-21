#Ejercicio 13


cliente = input("Nombre del cliente: ")
producto = input("Nombre del producto: ")
precio_unitario_txt = input("Precio unitario (€): ")
cantidad_txt = input("Cantidad comprada: ")
porcentaje_iva_txt = input("Porcentaje de IVA (%): ")
incluir_propina = input("¿Desea incluir propina opcional de 2€? (si/no): ").strip().lower()


precio_unitario = float(precio_unitario_txt)
cantidad = float(cantidad_txt)
porcentaje_iva = float(porcentaje_iva_txt)

subtotal = precio_unitario * cantidad
monto_iva = subtotal * (porcentaje_iva / 100)
propina = 2.0 if incluir_propina == "si" else 0.0
total_final = subtotal + monto_iva + propina


es_vip = total_final > 30

print("\n========================================")
print("           TIQUE DE CAFETERÍA           ")
print("Cliente: " + cliente)
print("Producto: " + producto + " x " + str(cantidad))
print("----------------------------------------")
print("Subtotal: " + str(subtotal) + " €")
print("IVA (" + str(int(porcentaje_iva)) + "%): " + str(round(monto_iva, 2)) + " €")
print("Propina: " + str(propina) + " €")
print("TOTAL A PAGAR: " + str(round(total_final, 2)) + " €")
print("----------------------------------------")
print("¿Supera el umbral VIP (>30€)?: " + str(es_vip))

