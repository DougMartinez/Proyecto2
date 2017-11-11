/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JOptionPane;
import proyecto2.ListasEnlazadas.ListaEnlazada;

/**
 *
 * @author Douglas
 */
public class PackProcesor {
    
    ListaEnlazada listaprod;
    
    public boolean respuestaserver;
    
    public PackProcesor(ListaEnlazada listaprod){
        this.listaprod =  listaprod;
    }
    
    public void AgregarInv (int id, int tiempo, int cantidad){
        new Thread(){
            @Override
            public void run(){
                while(true){
                    try{
                        listaprod.getValor(id - 1).setCantidad(listaprod.getValor(id - 1).getCantidad() + cantidad);
                        System.out.println("Agrego del producto "+(id-1));
                        try{
                            System.out.println("TIEMPO ES "+tiempo);
                            Thread.sleep(tiempo*1000);
                        } catch (Exception e){
                            System.out.println("No se pudo");
                        }
                    } catch(Exception e){
                        System.out.println("Sale en vacas");
                    }
                }
            }
        }.start();
    }
    
    public void Personas(){
        Thread cliente = new Thread(){
            @Override
            public void run(){
                int cantidad = (int)(Math.random()*8)+1;
                if(cantidad==9){
                    cantidad = 8;
                }
                int tipo = (int)(Math.random()*3);
                if(tipo==3){
                    tipo = 2;
                }
                while(listaprod.getValor(tipo).getCantidad()<cantidad){
                    
                }
                listaprod.getValor(tipo).setCantidad(listaprod.getValor(tipo).getCantidad() - cantidad);
            }
        };
        while(respuestaserver != true){
            cliente.start();
        }
    }
}
