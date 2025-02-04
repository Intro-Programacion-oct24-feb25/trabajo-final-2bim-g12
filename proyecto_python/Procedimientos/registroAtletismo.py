def registrarParticipanteAtletismo():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    especialidad = input("Ingrese la especialidad del participante (Carreras, Salto, Lanzamiento): ")
    ciudad = input("Ingrese la ciudad del participante: ")
    record = float(input("Ingrese el record del participante: "))

    cadena = (f"Datos\nNombre: {nombre}\nEdad: {edad}\nEspecialidad: {especialidad}\nCiudad: {ciudad}\Record: {record}\n")

    return cadena

    