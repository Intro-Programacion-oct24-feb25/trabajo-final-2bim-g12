def registrarParticipanteTenis():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    nivel = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ")
    ciudad = input("Ingrese la ciudad del participante: ")
    mano = input("Ingrese  la mano habil del participante (Derecha/Izquierda): ")

    print (f"Datos\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nMano Habil: {mano}\n")