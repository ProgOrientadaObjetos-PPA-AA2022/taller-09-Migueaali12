package paquete1;

import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

public class Ejecutor {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        Ejecutor obj = new Ejecutor();

        int opcion;

        int menuControl = 0;
        

        String cadenitaAuto = "";

        String cadenitaEdu = "";

        do {
            
            opcion = obj.menu();

            switch (opcion) {

                case 1:                 

                    do {

                        sc.nextLine();

                        System.out.println("Ingrese el nombre del beneficiario:");
                        String nombre = sc.nextLine();

                        System.out.println("Ingrese el apellido del beneficiario:");
                        String apellido = sc.nextLine();

                        System.out.println("Ingrese el username del beneficiario:");
                        String username = sc.nextLine();

                        System.out.println("Ingrese el tiempo del prestamo (Meses):");
                        int meses = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Ingrese la ciudad donde se genera el "
                                + "prestamo:");
                        String ciudad = sc.nextLine();

                        System.out.println("Ingrese el tipo de Automóvil:");
                        String tipo = sc.nextLine();

                        System.out.println("Ingrese la marca del Automóvil:");
                        String marca = sc.nextLine();

                        System.out.println("Ingrese el nombre del garante:");
                        String nombreG = sc.nextLine();

                        System.out.println("Ingrese el apellido del garante:");
                        String apellidoG = sc.nextLine();

                        System.out.println("Ingrese el username del garante:");
                        String usernameG = sc.nextLine();

                        System.out.println("Ingrese el valor del Automóvil:");
                        double valorAuto = sc.nextDouble();

                        Persona garante1 = new Persona(nombreG, apellidoG,
                                usernameG);

                        Persona beneficiario = new Persona(nombre, apellido,
                                username);

                        PrestamoAutomovil prestAuto1 = new PrestamoAutomovil(
                                tipo, marca, garante1, valorAuto, beneficiario, meses,
                                ciudad);

                        cadenitaAuto = String.format("%s%s\n", cadenitaAuto,
                                prestAuto1.toString());

                        sc.nextLine();                     

                        System.out.println("Desea ingresar otro Prestamo de "
                                + "Automóvil (SI) (NO):");
                            String moderador = sc.nextLine();
                            
                        if (moderador.equals("NO")) {
                            menuControl = 0;
                            
                        } else {
                            menuControl = 1;
                        }
    
                    } while (menuControl == 1);

                    break;

                case 2:                                        

                    do {                                       

                        sc.nextLine();

                        System.out.println("Ingrese el nombre del beneficiario:");
                        String nombre = sc.nextLine();

                        System.out.println("Ingrese el apellido del beneficiario:");
                        String apellido = sc.nextLine();

                        System.out.println("Ingrese el username del beneficiario:");
                        String username = sc.nextLine();

                        System.out.println("Ingrese el tiempo del prestamo (Meses):");
                        int meses = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Ingrese la ciudad donde se genera el "
                                + "prestamo:");
                        String ciudad = sc.nextLine();

                        System.out.println("Ingrese el nivel de estudio:");
                        String nivel = sc.nextLine();

                        System.out.println("Ingrese el nombre del Centro Educativo:");
                        String nombreC = sc.nextLine();

                        System.out.println("Ingrese las  sigas del Centro Educatuvo:");
                        String siglas = sc.nextLine();

                        System.out.println("Ingrese el valor de la Carrera:");
                        double valorCarre = sc.nextDouble();

                        Persona beneficiario = new Persona(nombre, apellido,
                                username);

                        InstitucionEducativa insti = new InstitucionEducativa(nombreC, siglas);

                        PrestamoEducativo prestEdu1 = new PrestamoEducativo(nivel,
                                insti, valorCarre, beneficiario, meses, ciudad);

                        cadenitaEdu = String.format("%s%s\n", cadenitaEdu,
                                prestEdu1.toString());

                        sc.nextLine();                  

                        System.out.println("Desea ingresar otro Prestamo "
                                + "Educativo (SI) (NO):");
                            String moderador = sc.nextLine();
                            
                        if (moderador.equals("NO")) {                         
                            menuControl = 0;                           
                            
                        } else {
                            menuControl = 2;
                        }

                    } while (menuControl == 2);

                    break;
                    
                case 3:                  
                    
                    System.out.println(cadenitaAuto);
                    System.out.println(cadenitaEdu);
                    
                    menuControl = 12;
                    
                    break;

                default:
                    break;

            }

        } while (menuControl == 0);

    }

    public static int menu() {

        int opc;

        System.out.println("Ingresar Prestamo Automovil: [1]");
        System.out.println("Ingresar Prestamo Educativo: [2]");
        System.out.println("Terminar todo y mostrar    : [3]");

        opc = sc.nextInt();

        return opc;
    }

}
