package Examples;

import java.util.Scanner;

public class ExampleAdvanced1 {

	public static void main(String[] args) {
		 
		System.out.print("Ingrese un n�mero entero:");					
         Scanner sc = new Scanner(System.in);
         int ent ;
         try {
        	 ent= sc.nextInt();
        	 System.out.print(ent);
         }catch (Exception ex){
        	 System.out.print("Usted no ingreso un n�mero entero.");
         }finally {
        	 System.out.println("\nProceso terminado");
         }
	}

}
