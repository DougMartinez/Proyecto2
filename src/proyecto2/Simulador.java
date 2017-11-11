/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Color;
import java.awt.Graphics;
import javafx.scene.text.Font;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

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
        for(int y = 0; y < Principal.servidorLista.size(); y++){
            g.fillRect(Principal.servidorLista.getValor(y).getX(),
                    Principal.servidorLista.getValor(y).getY(),
                    Principal.servidorLista.getValor(y).getAncho(),
                    Principal.servidorLista.getValor(y).getAlto());
        }
        
        g.setColor(Color.GREEN);
        for(int u = 0; u < Principal.servidorLista.size(); u++){
            int [] vx1 = {Principal.servidorLista.getValor(u).getX() - 5,
                Principal.servidorLista.getValor(u).getX() - 5,
                Principal.servidorLista.getValor(u).getX() - 50};
            int [] vy1 = {Principal.servidorLista.getValor(u).getY() + Principal.servidorLista.getValor(u).getAncho() + 5,
                Principal.servidorLista.getValor(u).getY() + Principal.servidorLista.getValor(u).getAncho() + 50,
                Principal.servidorLista.getValor(u).getY() + Principal.servidorLista.getValor(u).getAncho() + 50};
            g.fillPolygon (vx1, vy1, 3);
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