def obtenerInformacion(num):
    if num > 0 & num <= 5:
        print ("Poca partitipacion en el club, hay que mejorar.")
    elif num > 5 & num <= 16:
        print ("Buena participacion, sigan asi.")
    elif num > 16:
        print ("Excelente campaña del club.")
    else:
        print ("Mala campaña debemos mejorar.")