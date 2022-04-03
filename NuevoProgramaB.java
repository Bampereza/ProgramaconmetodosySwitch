
package nuevoprogramab;

import java.util.Scanner;

/**
 *
 * @author aldan
 */
public class NuevoProgramaB {

    public static void main(String[] args) {
        
         System.out.println("--------------------------------------------------");
         System.out.println("-----Bienvenido al Nuevo programaBA-----");
         System.out.println("--------------------------------------------------");
         System.out.println("\n");
       
          System.out.println("Menu de opciones ");
          System.out.println("{1) Factorial"); 
          System.out.println("{2) Tabla de multiplicar"); 
          System.out.println("{3) Pares e impares"); 
          System.out.println("{4) Dias laborales"); 
          
           Scanner sc= new Scanner(System.in);
       
          System.out.println("Ingrese la opcion que desea usar: ");
          int opcion =sc.nextInt();
          
          
          ProgramaA nuevoProgramaBA = new ProgramaA();
          ProgramaB nuevoProgramaBAC = new ProgramaB();
          
          
         switch(opcion){
             case 1:
                System.out.println("Ingrese el numero que desea sacarle factorial: ");
                   int primerNumero = sc.nextInt();
                   
                  
                   System.out.println(nuevoProgramaBA.factorial(primerNumero) );
                   System.out.println("El resultado es:  "+nuevoProgramaBA.factorialBA);
                 
                 break;

                 case 2:
                     System.out.println("Ingrese el numero para mostar su tabla de multiplicar: ");
                       primerNumero = sc.nextInt();
                        System.out.println("\n");
                        System.out.println("Aqui esta su tabla");
                   
                        System.out.println(nuevoProgramaBA.tabla(primerNumero) );
                        System.out.println("");
                      
                     
                     
                 break;
                
                 case 3:
                     System.out.println("Ingrese los 10 numeros y coloque 0 si desea terminar la funcion: ");
                       primerNumero = sc.nextInt();   
                     
                       System.out.println(nuevoProgramaBAC.numerosPeI(primerNumero) );
                       System.out.println("El resultado es:  "+nuevoProgramaBAC.respuestaN);
                     
                 break;
                 
                 
                 case 4:
                     

                    System.out.println("Lunes (1)");
                    System.out.println("Martes (2)");
                    System.out.println("Miercoles (3)");
                    System.out.println("Jueves (4)");
                    System.out.println("Viernes (5)");
                    System.out.println("Sabado (6)");
                    System.out.println("Domingo (7)");
                
                    System.out.println("Ingrese el dia para ver si es laboral o no: ");
                       int Dia =sc.nextInt();
                       
                switch (Dia){

                    case 1:
                           System.out.println(nuevoProgramaBAC.lunesBA(Dia));
                           
			   break;

			case 2:
			   System.out.println(nuevoProgramaBAC.martesBA(Dia));
			   break;

		    case 3:
			  System.out.println(nuevoProgramaBAC.miercolesBA(Dia));
			   break;

	            case 4:
			   System.out.println(nuevoProgramaBAC.juevesBA(Dia));
			   break;

		    case 5:
			   System.out.println(nuevoProgramaBAC.viernesBA(Dia));
			   break;

		    case 6:
			   System.out.println(nuevoProgramaBAC.sabadoBA(Dia));
			   break;

		    case 7:
			   System.out.println(nuevoProgramaBAC.domingoBA(Dia));
			   break;

	} 
              break;

                 default: 
                     System.out.println("Esta opcion no esta disponible ");
         }
                 
         }
                 
         }
    
    

