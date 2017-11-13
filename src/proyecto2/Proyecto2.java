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
    
    static ListaEnlazada lista = new ListaEnlazada();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
}
