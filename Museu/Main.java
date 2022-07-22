/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Museu;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
/**
 *
 * @author karinamunhos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   SwingUtilities.invokeLater(new Runnable()
 {
 
    // roda o a janela
    @Override
    public void run()
    {

   PaginaPrincipal p =  new PaginaPrincipal();
   //p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p.setVisible(true);
     

    }
   });
    }
}
