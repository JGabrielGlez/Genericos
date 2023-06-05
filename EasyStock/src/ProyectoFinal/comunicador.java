
package ProyectoFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class comunicador {
    //en esta clase comunicador es donde podría implementar la creación y el abrir los archivos para generar una persistencia. 
                             //ponerle el mismo limite que en el pnlArticulo
    private static Articulo[] articulo=new Articulo[5];
    private static int a=-1;
    //a es el controlador para saber hasta donde se llenará la tabla de venta
    

    public static Articulo[] getArticulo() {
        
        return articulo;
    }
        //este es para cuando solo se agreganm 
    public static void setArticulo(Articulo[] articulo, int indice) {
        a=indice;
        
        comunicador.articulo = articulo;
        
        guardarArray(a);
        
    }

    public static int getA() {
        return a;
    }
    
    public static int getLength(){
        return articulo.length;
    }
    //este es para cuando se elimina algún elemento de la tabla principal.
    public static void setArticulo(Articulo[] articulo, int indice,int pos) {
        a=indice;
       if(pos==comunicador.articulo.length-1){a--;
       }else{a--;
                for(int i=pos; i<a++; i++){
                    comunicador.articulo[i]= articulo[i];
                }
                

    }
            guardarArray(a);

    }
    
    
    public static void guardarArray(int a){
          
          FileWriter fcs;//flujo de escritura
          FileReader fce;//flujo de lectura
          BufferedReader bce;//
        try{//limpia el archivo
        fcs=new FileWriter("DatosArticulos.NoBorrar");
        fcs.write(""); fcs.flush();
        }catch(IOException e){JOptionPane.showMessageDialog(null, "Este es el error"+e.getMessage());}
        
        try{
            fcs=new FileWriter("DatosArticulos.NoBorrar",true);
            
            for(int i = 0; i<a+1;i++){
            articulo[i].guardar(fcs);
            }
        }catch(IOException e){JOptionPane.showMessageDialog(null, "Este es el error"+e.getMessage());}
    }
    
   
    
    public void msg(String m){
        JOptionPane.showMessageDialog(null,m);
    }

    
}


