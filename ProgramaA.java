
package nuevoprogramab;

/**
 *
 * @author aldan
 */
public class ProgramaA {
    
     //Atributos agregados
     double factorialBA;
     double primerNumero;
     int i = 1;
     int tablaBA;
     

     //METODOS AGREGADOS POR SERVICIO BA
    public double factorial (double primerNumero) {
      if (primerNumero==0)
       return 1;
       else
       return factorialBA = primerNumero * factorial(primerNumero-1);
}
    public int tabla(int primerNumero){
        for (int i=1; i<=10; i++){
            System.out.println(primerNumero+"*"+i+"="+primerNumero*i);
       }   
       return tablaBA;
    }
}

        
            
       
    


