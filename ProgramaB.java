
package nuevoprogramab;

/**
 *
 * @author aldan
 */
public class ProgramaB {
    
     //Atributos agregados
     int numerosPeI;
     double primerNumero;
     int funcionP;
     int tablaBA;
     int respuesta = 1;
     int respuestaN;
     int respuestaN2;
     int dia;
     int x;
     int sumaPares;
     int n;
     int pares;
     int sumaImpares;
     int impares;
     

     //METODOS AGREGADOS POR SERVICIO BAC
    public double numerosPeI (int primerNumero) {
      for(x=1;x<=10;x++){
          if (n%2==0) {
		        respuestaN =  sumaPares = sumaPares+n;
		                   	pares = pares+1;
	       	} else {
		         sumaImpares = sumaImpares+n;
		             	impares = impares+1;
          }
      }
              
       return respuestaN;
}
    public int lunesBA (int Dia) {
     
           System.out.println("Dia laborable");

  return Dia;
}
    public int martesBA (int Dia) {
     
           System.out.println("Dia laborable");

  return Dia;
}
    public int miercolesBA (int Dia) {
     
           System.out.println("Dia laborable");

  return Dia;
}
    public int juevesBA (int Dia) {
     
           System.out.println("Dia laborable");

  return Dia;
}
    public int viernesBA (int Dia) {
     
           System.out.println("Dia laborable");

  return Dia;
}
    public int sabadoBA (int Dia) {
     
           System.out.println("Dia no laborable");

  return Dia;
}
    public int domingoBA (int Dia) {
     
           System.out.println("Dia no laborable");

  return Dia;
}
}
