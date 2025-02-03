import sys
from Procedimientos.registroFutbol import registrarParticipanteFutbol
from Procedimientos.registroAtletismo import registrarParticipanteAtletismo
from Procedimientos.registroNatacion import registrarParticipanteNatacion
from Procedimientos.registroBasquetbol import registrarParticipanteBasquetbol
from Procedimientos.registroCiclismo import registrarParticipanteCiclismo
from Procedimientos.registroTenis import registrarParticipanteTenis
from Procedimientos.registroYoga import registrarParticipanteYoga



def obtenerInformacion(num):
    if num > 0 & num <= 5:
        print ("Poca partitipacion en el club, hay que mejorar.")
    elif num > 5 & num <= 16:
        print ("Buena participacion, sigan asi.")
    elif num > 16:
        print ("Excelente campaña del club.")
    else:
        print ("Mala campaña debemos mejorar.")

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

def main():
    
    areas = ["Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"]
    resultados = [0, 0, 0, 0, 0, 0, 0]
    bandera = True
    numeroCuentas = 0

    while bandera:
        print("Ingrese la opción a la que desea aplicar:")
        
        for i, area in enumerate(areas):
            
            print(f"{i + 1}. Para {area}, ingrese: ({i + 1})")


        opcion = int(input())
        """
        Validacion de opciones ingresada
        """
        if opcion == 1:
            registrarParticipanteFutbol()
            resultados[0] = resultados[0] + 1
        elif opcion == 2:
            registrarParticipanteNatacion()
            resultados[1] = resultados[1] + 1
        elif opcion == 3:
            registrarParticipanteAtletismo()
            resultados[2] = resultados[2] + 1
        elif opcion == 4:
            registrarParticipanteBasquetbol()
            resultados[3] = resultados[3] + 1
        elif opcion == 5:
            registrarParticipanteCiclismo()
            resultados[4] = resultados[4] + 1
        elif opcion == 6:
            registrarParticipanteTenis()
            resultados[5] = resultados[5] + 1
        elif opcion == 7:
            registrarParticipanteYoga()
            resultados[6] = resultados[6] + 1
        else:
            print ("Lo sentimos. El club no tiene esa opcion.")

        numeroCuentas = numeroCuentas + 1
        salida = (input("¿Desea Continuar? Escriba: S/N "))
        if salida == "N":
            bandera = False


    obtenerInformacion(numeroCuentas)
    obtenerReporte(areas, resultados)

main()
            
        
        
