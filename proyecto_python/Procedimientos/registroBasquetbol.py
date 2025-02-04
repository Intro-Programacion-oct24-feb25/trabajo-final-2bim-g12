def registrarParticipanteBasquetbol():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    posicion = input("Ingrese la posicion en la que juega el participante:")
    estatura = float(input("Ingrese la estatura del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")

    cadena=(f"Datos:\nNombre: {nombre}\nEdad: {edad}\Posicion: {posicion}\nEstatura: {estatura}\Ciudad: {ciudad}\n")

    return cadena