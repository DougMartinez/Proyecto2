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
    int contador = Principal.personaLista.getHead().getValor().getX();
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
        
        
//        g.setColor(Color.YELLOW);
//        g.fillOval(Principal.personaLista.getValor(0).getX(),
//                    Principal.personaLista.getValor(0).getY(),
//                    Principal.personaLista.getValor(0).getRadio()*4,
//                    Principal.personaLista.getValor(0).getRadio()*4);
        Simulador that = this;
//        Thread t = new Thread(){
//            int x = Principal.personaLista.getValor(0).getX(); 
//            @Override
//            public void run(){
//                System.out.println("MANDO A LLAMAR ESTE METODO");
//            while(x < Principal.servidorLista.getLast().getValor().getX() + Principal.servidorLista.getLast().getValor().getAncho() + 15){
//            x=x+50;
//                System.out.println("X "+x);
//                    g.setColor(Color.RED);
//                
//                    g.fillOval(x,
//                    Principal.personaLista.getValor(0).getY(),
//                    (Principal.personaLista.getValor(0).getRadio()*4 + x),
//                    (Principal.personaLista.getValor(0).getRadio()*4) + x); 
////                    repaint(g);
//                    long start = System.currentTimeMillis();
//                    long last = start + 100;
//                    while(System.currentTimeMillis() < last){
//                        
//                    }
//                    
//                that.repaint();
//                that.revalidate();
//                    
//                    g.clearRect(0, 0, 1990, 1020);
//                    that.removeAll();
//            try {
////                Thread.sleep(100);
//            } catch (Exception e){
//                System.out.println(e);
//            }
//        } 
//                System.out.println("TERMINE PVTOS");
//            }
//        };
////        if(this.contador==0){
//            t.start();
//            contador++;
//        };
        this.moverCirculo(g);
    }
    public void moverCirculo(Graphics g){
        //System.out.println("Si estoy llegando");
//        if(contador==0){
//            for(int i=0;i<150;i+=50){
//                g.setColor(Color.RED);
//                g.fillOval(i,
//                Principal.personaLista.getValor(0).getY(),
//                (Principal.personaLista.getValor(0).getRadio()*4),
//                (Principal.personaLista.getValor(0).getRadio()*4));
//
//            }            
//        }
        contador+=50;
                    
//                    this.repaint();
                    g.setColor(Color.YELLOW);
                    g.fillOval(contador-10,
                    Principal.personaLista.getValor(0).getY(),
                    (Principal.personaLista.getValor(0).getRadio()*4),
                    (Principal.personaLista.getValor(0).getRadio()*4));
                    
                    this.repaint();
                    long start = System.currentTimeMillis();
                    long last = start + 3000;
                    while(System.currentTimeMillis() < last){
                        
                    }

//                    this.revalidate();
//                            pack();
//                            setBounds(0,0,1200,1000);
//                    this.repaint(g);
    }
}