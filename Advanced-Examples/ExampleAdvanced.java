package Examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ExampleAdvanced {

	@SuppressWarnings("resource")
	public void LeerArchivo() throws FileNotFoundException, IOException {	  
		File archivo = new File("C:\\Prueba\\texto1.txt");
		FileReader fr = new FileReader(archivo);		
		
		BufferedReader bf = new BufferedReader(fr);
        String linea;
        
        while((linea = bf.readLine())!= null) {
        	System.out.println(linea);
        }
	}
      public void Leer2() {
	   try {
		 LeerArchivo();
		 
	 } catch(FileNotFoundException ex) {
		 JOptionPane.showMessageDialog(null,"No se ha encontrado el archivo buscado.");
	 
	 } catch(IOException e) {
		JOptionPane.showMessageDialog(null,"Ha ocurrido una excepción.");
	 } 
	  System.out.println("el programa a finalizado");
  }
      public static void main(String []args) {
    	  ExampleAdvanced prueba = new ExampleAdvanced();
    	  prueba.Leer2();
      }
}
