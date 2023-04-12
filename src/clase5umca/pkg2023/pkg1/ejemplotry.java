
package clase5umca.pkg2023.pkg1;

import java.util.Scanner;

public class ejemplotry {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        try{
        System.out.println("Digite el numero");
        numero=entrada.nextInt();
        System.out.println("El numero es :"+numero);
     }catch(Exception e ){
            System.out.println("Digite un dato entero");
     }
    }
  
}
