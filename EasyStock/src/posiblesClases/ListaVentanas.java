/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posiblesClases;

import ProyectoFinal.controladorPanel;
import java.util.ArrayList;


// el 0 es la venta y el 1 el articulos
public class ListaVentanas {
    private ArrayList<controladorPanel> listaPaneles = new ArrayList<>(4);

    public ListaVentanas() {
    }

    public void setListaPaneles(ArrayList<controladorPanel> listaPaneles) {
        this.listaPaneles = listaPaneles;
    }

    public ArrayList<controladorPanel> getListaPaneles() {
        return listaPaneles;
    }

    public void add(controladorPanel panel) {
        listaPaneles.add(panel);
    }
}


