/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbolavltarea4;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author alexa
 */
public class ArbolAVL {
    
    public static void main(String[]args){
        
       SwingUtilities.invokeLater(new Runnable(){
          
       public void run(){
          JFrame frame = new JArbolvista();
          frame.setSize(500, 500);
          frame.setVisible(true);
      }
          
      });
     
      
    }
        
        
        
    }
