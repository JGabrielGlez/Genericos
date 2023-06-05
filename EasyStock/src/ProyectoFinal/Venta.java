package ProyectoFinal;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Venta {

    private String descripcion, fecha=FechaActual(), hora=horaActual();
    private int numVenta;


    public Venta(String descripcion, String fecha, String hora, int numVenta){
        this.descripcion=descripcion; this.fecha=fecha; this.hora=hora; this.numVenta=numVenta;
    }

    public String FechaActual(){
        int d,m,a;
        Calendar c=new GregorianCalendar();
        d=c.get(Calendar.DATE);
        m=c.get(Calendar.MONTH)+1;
        a=c.get(Calendar.YEAR);
        return d +"/" + m +"/" + a;
    }

    public String horaActual(){
        int h,m,s;
        Calendar c= new GregorianCalendar();
        h=c.get(Calendar.HOUR);
        m=c.get(Calendar.MINUTE);
        s=c.get(Calendar.SECOND);
        return h + ":" + m + ":" +s;
    
}
}
