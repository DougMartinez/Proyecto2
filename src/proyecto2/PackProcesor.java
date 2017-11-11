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
    
    public PackProcesor(ListaEnlazada listaprod){
        this.listaprod =  listaprod;
    }
    
    public void AgregarInv (int id, int tiempo, int cantidad){
        new Thread(){
            
            @Override
            public void run(){
                try{
                    listaprod.getValor(id - 1).setCantidad( listaprod.getValor(id - 1).getCantidad() + cantidad);
                } catch(Exception e){}
            }
        };
    }
}
