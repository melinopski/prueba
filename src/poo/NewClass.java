/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo;

/**
 *
 * @author USUARIO 1
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class NewClass extends Applet implements ActionListener {
    Button CaK, KaC;
    TextField t;
    Label l;
    double n1,n2;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
    t=new TextField(10); 
    add(t);
    CaK=new Button("Convertir de grados Centigrados a grados Kelvin");
    KaC=new Button("Convertir de grados Kelvin a grados Centigrados");
    add(CaK);
    add(KaC);
    CaK.addActionListener(this);
    KaC.addActionListener(this);
    l=new Label("__________________________");
    add(l);
    t.addActionListener(this);
       // TODO start asynchronous download of heavy resources
    }
public void actionPerformed(ActionEvent e){
    String s=t.getText();
    Button aux = (Button) e.getSource();
    n1=Double.parseDouble(s);
    if(aux==CaK) n2= n1+273.15;
    if(aux==KaC) n2= n1-273.15; 
    l.setText(""+n2);
   
    }
}
    // TODO overwrite start(), stop() and destroy() methods

