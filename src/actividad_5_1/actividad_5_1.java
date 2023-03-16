
package actividad_5_1;

import Clases.Pantallaprincipal;
import Clases.FormularioPersona;
import java.awt.BorderLayout;

public class actividad_5_1 {

   
    private static Pantallaprincipal  programa;  
 

  
  private static void initComponents() {
      
   programa = new Pantallaprincipal();
 }
    
    public static void main(String[] args) {
        initComponents();
         programa.setSize(1200, 800);
         programa.setResizable(true);
         programa.getContentPane().setLayout(new BorderLayout());
       //  aplicacion.setLocationRelativeTo(null);
         programa.setVisible(true);
    }
    
}
