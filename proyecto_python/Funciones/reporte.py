def obtenerReporte(areas, resultados):
    cadena = "Las actividades ingresadas fueron:\n"
    pos = 0
    for area in enumerate(areas):
        #print(resultados[pos])
        #print(area[1])
        #cadena = cadena +  + ". Número de Participantes de " + ": "+"\n"
        cadena = cadena + str(pos+1)  + ". Número de Participantes de " + area[1] + ": " + str(resultados[pos])+"\n"
        pos += 1
    print (cadena)