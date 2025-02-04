def registrarParticipanteFutbol():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    posicion = input("Ingrese la posicion en la que juega el participante:")
    ciudad = input("Ingrese la ciudad del participante: ")
    equipo = input("Ingrese el equipo del participante: ")


    cadena = (f"Datos:\nNombre: {nombre}\nEdad: {edad}\nPosicion: {posicion}\nCiudad: {ciudad}\nEquipo: {equipo}\n")

    return cadena