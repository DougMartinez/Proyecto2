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
        } else {
            NodoSimPersona aux = primero;
            while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        nuevo.setAnterior(aux);
        ultimo = aux;
        }          
    }
    
    public void eliminaValor(Persona pa){
        if (primero != null){
            NodoSimPersona aux = primero;
            NodoSimPersona ant = null;
            while (aux != null){
                if (aux.getValor() == pa){
                    if (ant == null){
                        primero = primero.getSiguiente();
                        aux.setSiguiente(null);
                        aux = primero;
                    } else {
                        ant.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = ant.getSiguiente();
                    }                                             
                } else{
                        ant = aux;
                        aux = aux.getSiguiente();
                }
            }
        }
    }
    
    public void buscar(Persona psa){
        if (primero != null){
            NodoSimPersona aux = primero;
            int cont = 0;
            while (aux != null){
                if (aux.getValor()==psa){
                    cont++;
                    aux = aux.getSiguiente();
                }                                 
            }                     
        } 
    }
}
