/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
AC 1.2.2
Autor: Kevin Rodríguez Rodríguez
Fecha:14/09/2016
Descripción: Realiza un programa que muestre la ruta absoluta 
y si el nombre de un fichero existe o no.
*/
package ac1.pkg2.pkg2;
import java.io.File;
/**
 *
 * @author 2dama
 */
public class AC122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "C:\\Users\\2dama\\Desktop\\Nueva carpeta";
        File archivo = new File(ruta);
        System.out.println(archivo.getAbsolutePath());
        String sino= "no";
        if (archivo.exists()==true){
            sino = "si";
        }
        System.out.println("El archivo "+sino+ " existe");
        
    }
    
}
