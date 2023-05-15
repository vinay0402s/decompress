/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class APPFRAME extends JFrame implements ActionListener{
    
    JButton compressButton;
    JButton decompressButton;
    
    APPFRAME(){
        
        this.setdefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        compressButton = new JButton ("select file to compress");
        compressButton.setBounds(20,100,200,30);
        
        decompressButton = new JButton ("select file to decompress");
        decompressButton.setBounds(20,100,200,30);

        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(100,500);
        this.getContentPane().setBackground(Color.blue);
        this.setVisible(true);
    }
}
