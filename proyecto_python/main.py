
import sys
cadenaGlobal = "Reporte del Club 'El deporte para la vida'\n"
from Procedimientos.registroFutbol import registrarParticipanteFutbol
from Procedimientos.registroAtletismo import registrarParticipanteAtletismo
from Procedimientos.registroNatacion import registrarParticipanteNatacion
from Procedimientos.registroBasquetbol import registrarParticipanteBasquetbol
from Procedimientos.registroCiclismo import registrarParticipanteCiclismo
from Procedimientos.registroTenis import registrarParticipanteTenis
from Procedimientos.registroYoga import registrarParticipanteYoga
from Funciones.informacion import obtenerInformacion
from Funciones.reporte import obtenerReporte


def main():
    global cadenaGlobal
    areas = ["Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"]
    resultados = [0, 0, 0, 0, 0, 0, 0]
    bandera = True
    numeroCuentas = 0

    while bandera:
        print("Ingrese la opción a la que desea aplicar:")
        
        for i, area in enumerate(areas):
            
            print(f"{i + 1}. Para {area}, ingrese: ({i + 1})")


        opcion = int(input())
        
        if opcion == 1:
            cadenaGlobal += str(registrarParticipanteFutbol())
            resultados[0] = resultados[0] + 1
        elif opcion == 2:
            cadenaGlobal += str(registrarParticipanteNatacion())
            resultados[1] = resultados[1] + 1
        elif opcion == 3:
            cadenaGlobal += str(registrarParticipanteAtletismo())
            resultados[2] = resultados[2] + 1
        elif opcion == 4:
            cadenaGlobal += str(registrarParticipanteBasquetbol())
            resultados[3] = resultados[3] + 1
        elif opcion == 5:
            cadenaGlobal += str(registrarParticipanteCiclismo())
            resultados[4] = resultados[4] + 1
        elif opcion == 6:
            cadenaGlobal += str(registrarParticipanteTenis())
            resultados[5] = resultados[5] + 1
        elif opcion == 7:
            cadenaGlobal += str(registrarParticipanteYoga())
            resultados[6] = resultados[6] + 1
        else:
            print ("Lo sentimos. El club no tiene esa opcion.")

        numeroCuentas = numeroCuentas + 1
        salida = (input("¿Desea Continuar? Escriba: S/N "))
        if salida.upper() == "N":
            bandera = False


    informacion = obtenerInformacion(numeroCuentas)
    reporte = obtenerReporte(areas, resultados)
    print (cadenaGlobal)
    print (informacion)
    print (reporte)
    

main()
            
        
        
