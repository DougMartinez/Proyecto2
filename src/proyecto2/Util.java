/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import Objeto.Producto;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Douglas
 */
public class Util {
    
    static Producto[] productos;
    
    public Util(){
        super();
    }
    
    public Producto[] add(Producto[] mat, Producto prod){
        
        Producto[] array = mat;
        if(mat.length == 0){
            Util.productos = new Producto[1];
            productos[0] = prod;
        } else {
            Producto[] temp = new Producto[mat.length];
            temp = mat;
            Util.productos = new Producto[mat.length + 1];
            for(int i=0; i<temp.length; i++){
                productos[i] = temp[i];
            }
            productos[productos.length - 1] = prod;
        }
        return productos;
    }
    
    public void Graph(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(0, 0, 0, 0);
        //RecorrerX
        //for(){
            
        //}
    }
}