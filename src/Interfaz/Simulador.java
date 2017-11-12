/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.Principal;
import java.awt.Color;
import java.awt.Graphics;
import javafx.scene.text.Font;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import proyecto2.Nodos.NodoServer;

/**
 *
 * @author Douglas
 */
public class Simulador extends JFrame{
    
    Font fuente = new Font(20);
    
    public Simulador(){
        super("Simulator");
        setSize(1990,1020);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.BLUE.darker().darker());
        NodoServer cuad = Principal.servidorLista.getHead();
        while(true){
            g.fillRect(cuad.getValor().getX(),cuad.getValor().getY(),cuad.getValor().getAncho(),cuad.getValor().getAlto());
            if(cuad == Principal.servidorLista.getLast()){
                break;
            }
            cuad = cuad.getSiguiente();
        }
        
        g.setColor(Color.GREEN);
        NodoServer tri = Principal.servidorLista.getHead();
        while(true){
            int [] vx1 = {tri.getValor().getX() - 5,
                tri.getValor().getX() - 5,
                tri.getValor().getX() - 50};
            int [] vy1 = {tri.getValor().getY() + tri.getValor().getAncho() + 5,
                tri.getValor().getY() + tri.getValor().getAncho() + 50,
                tri.getValor().getY() + tri.getValor().getAncho() + 50};
            g.fillPolygon (vx1, vy1, 3);
            if(tri == Principal.servidorLista.getLast()){
                break;
            }
            tri = tri.getSiguiente();
        }
        
        g.setColor(Color.YELLOW);
        for(int d = 0; d < Principal.personaLista.size(); d++){
            g.fillOval(Principal.personaLista.getValor(d).getX(),
                    Principal.personaLista.getValor(d).getY(),
                    Principal.personaLista.getValor(d).getRadio()*4,
                    Principal.personaLista.getValor(d).getRadio()*4);
        }
    }
}