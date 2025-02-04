def registrarParticipanteYoga():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    nivel = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ")
    ciudad = input("Ingrese la ciudad del participante: ")
    estilo = input("Ingrese el estilo de yoga favorito del participante: ")

    cadena = (f"Datos:\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo favorito: {estilo}\n")

    return cadena