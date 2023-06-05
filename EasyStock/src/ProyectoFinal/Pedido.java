package ProyectoFinal;
import static javax.swing.JOptionPane.*;

public  class Pedido {

    private String articulosFaltante;
    private int cantidad;

    Pedido(){}
    Pedido(String articulosFaltante, int cantidad){this.articulosFaltante=articulosFaltante;
    this.cantidad=cantidad;}

    //podríamos implememtar una forma para que el articulo faltante se haga en automatico
    //mediante el stock y producto minimo.
    //también en articulos faltantes podríamos desplegar una lista y seleccionarla por ahí
    //o hacerla en automatico cuando se llegue a un minimo.

    public void leer(){
        articulosFaltante=showInputDialog("Ingrese el nombre del artículo faltante: ");
        cantidad=Integer.parseInt(showInputDialog("Ingrese la cantidad deseada: "));
    }

    public void mostrar(){
        showMessageDialog(null, toString());
    }

    public String toString(){
        return "Artículos faltantes: " + articulosFaltante + "\nCantidad: " + cantidad;
    }


    public static void main(String asd[]){
        Pedido x=new Pedido(); x.leer();x.mostrar();

    }
}
