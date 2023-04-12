
package clase5umca.pkg2023.pkg1;

public class Matriz {
    public static void main(String[] args) {
        int i,j;
        int [] []matriz=new int[3][3];
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matriz[i][j]=(int)Math.floor(Math.random()*9);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("-------------------");
         for(i=0;i<3;i++){
            for(j=0;j<3;j++){
        System.out.print(matriz[j][i]+" ");
       }
           System.out.println("");   
            }
         
    }
   
}
