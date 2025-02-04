def registrarParticipanteCiclismo():
    nombre = input("Ingrese el nombre del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    tipo = input("Ingrese el tipo de ciclismo del participante:")
    ciudad = input("Ingrese la ciudad del participante: ")
    marca = input("Ingrese la marca de bicicletas favorita del participante: ")


    cadena=(f"Datos:\nNombre: {nombre}\nEdad: {edad}\Tipo de Ciclismo: {tipo}\nMarca favorita: {marca}\Ciudad: {ciudad}\n")

    return cadena