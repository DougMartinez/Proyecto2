/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.ListasEnlazadas;

import proyecto2.Nodos.NodoSimPersona;
import Objeto.Persona;

/**
 *
 * @author Douglas
 */
public class Cola {
    
    NodoSimPersona primero;
    NodoSimPersona ultimo;
    
    public Cola(){
        primero = null;
        ultimo = null;
    }
    
    public void insertarFinal(Persona p){
        NodoSimPersona nuevo = new NodoSimPersona(p);
        if(primero == null){
            primero = nuevo;
            ultimo = primero;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }
    
    public Persona Sacar(){
        Persona cliente = primero.getValor();
        primero = primero.getSiguiente();
        return cliente;
    }
}
