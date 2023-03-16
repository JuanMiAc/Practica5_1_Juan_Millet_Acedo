/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_5_1;

import clases.VentanaInicio;
import clases.FormCapturaPersonas;
import java.awt.BorderLayout;

/**
 *
 * @author saagy
 */
public class actividad_5_1 {

    /**
     * @param args the command line arguments
     */
 
  private static VentanaInicio  aplicacion;  
 // static FormCapturaPersonas formPersonas;

  
  private static void initComponents() {
      
   aplicacion = new VentanaInicio();
    
 }
  
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        /* Create and display the form */
        
         initComponents();
         aplicacion.setSize(800, 600);
         aplicacion.setResizable(true);
         aplicacion.getContentPane().setLayout(new BorderLayout());
       //  aplicacion.setLocationRelativeTo(null);
         aplicacion.setVisible(true);
        
    //    aplicacion.getContentPane().add(formPersonas);
        
        
        
    }
    
}
