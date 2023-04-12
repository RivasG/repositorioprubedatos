package clase5umca.pkg2023.pkg1;

import java.util.Date;
import java.util.Scanner;

public class ejemploarreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date fecha = new Date();
        //variables
        String nivel;
        String codigo = "";
        int i, contador = 0, escuela = 0, colegio = 0, MenuPrincipal, MenuMatricula, alumnos, CantidadAlumnos = 0;
        double cantidad;
        // definir vectores
        String[] niveles = new String[100];
        String[] codigos = new String[100];
        int[] matriculas = new int[100];
        String respuesta = "s";
        //utilizamos la funcion try catch para controlar errores
        try {
            do {
                //Puntos del menu
                System.out.println("Ingreso de Datos"
                        + "\n 1) Matricula"
                        + "\n 2) Resultados"
                        + "\n 3) Salir");
                MenuPrincipal = entrada.nextInt();
                switch(MenuPrincipal){
                    case 1:
                        System.out.println("Digite el Nivel a matricular");
                        nivel=entrada.next();
                        niveles[contador]=nivel;
                        contador++;
                        System.out.println("-----------------------");
                        System.out.println("Digite el codigo de Matricula");
                        codigo=entrada.next();
                        codigos[contador]=codigo;
                        System.out.println("--------------------------");
                        System.out.println("Seleccione segun sea la Matricula");
                        System.out.println("1-Matricula Primaria");
                        System.out.println("2-Matricula Secundaria");
                        MenuMatricula=entrada.nextInt();
                        System.out.println("----------------------------");
                        System.out.println("Digite cantidad de alumnos a Matricuilar");
                        alumnos=entrada.nextInt();
                        CantidadAlumnos+=alumnos;
                        switch(MenuMatricula){
                            case 1:
                                matriculas[contador]=alumnos;
                                escuela+=alumnos;
                                break;
                            case 2:
                                 matriculas[contador]=alumnos;
                                 colegio+=alumnos;
                                 break;
                            default:
                                System.out.println("Digite un dato válido");
                        }
                        System.out.println("--------------------");
                        System.out.println("La fecha:"+fecha);
                        System.out.println("Cliente "+nivel+" Codigo "+codigo);
                        System.out.println("Cantidad de alumnos "+CantidadAlumnos);
                        System.out.println("--------------------------------");
                         
                    case 2:
                        System.out.println("Totales ");
                        System.out.println("Cantidad de alumnos son :"+CantidadAlumnos);
                        System.out.println("Cantidad de alumnos escuela son :"+escuela);
                        System.out.println("Cantidad de alumnos colegio son :"+colegio);
                        break;
                    default:
                }
                
            } while (MenuPrincipal != 3);

        } catch (Exception e) {
            System.out.println("Error indice " + e);
        }

    }

}
