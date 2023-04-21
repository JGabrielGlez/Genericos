
package genericos;

/**
 *
 * @author jesusgabriel
 */
public class Clase <tipo> {
    private tipo a;

    public Clase(tipo t) { a=t;}
    

    public tipo getA() {return a;}

    public void setA(tipo a) {this.a = a;}
    
    public static void main(String[] args) {
            //debemos poner la clase que representa al tipo primitivo Integer=int;
        Clase <Integer> obj=new Clase(3);
        System.out.println(obj.getA());
        System.out.println(obj.getClass());
            }
    
}
