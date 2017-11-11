/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Interfaz.Inicio;
import proyecto2.ListasEnlazadas.ListaEnlazada;

/**
 *
 * @author Douglas
 */
public class Proyecto2 {
    
    public boolean servidor1 = false;
    public boolean servidor2 = false;
    public boolean servidor3 = false;
    
    static ListaEnlazada lista = new ListaEnlazada();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
//        Principal prin = new Principal();
//        prin.setVisible(true);
        
        
    }
    
//    public static void imprimir(){
//        int contador = 0;
//        Nodo temporal = lista.head;
//        while(contador < lista.size()){
//            System.out.println(lista.getValor(contador));
//            temporal = temporal.getSiguiente();
//            contador++;
//        }
//    }
}
