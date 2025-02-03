def registrarParticipanteNatacion():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    nivel = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ")
    ciudad = input("Ingrese la ciudad del participante: ")
    estilo = input("Ingrese el estilo de nado del participante: ")

    print (f"Datos\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo: {estilo}\n")
