/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author jesusgabriel
 */
public class Array {
    private int tam;
    private Object A[];
    private String arreglo="";
    
    public Array(int t){
        tam=t; A=new Object [tam];
    }
    
    public void leer(){
        for(int i=0; i<tam; i++){
            A[i]=showInputDialog("Ingrese el valor");
        }
    }//fin mostrar
    public void mostrar(){
        for(int i=0; i<tam; i++){
            arreglo+=A[i]+"\n";
        }
        showMessageDialog(null,arreglo);
    }//fin leer
   
    
    
    public static void main(String[] args) {
        Array a=new Array(5); a.leer(); a.mostrar();
        
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array de enteros:");
        printArray(intArray);

        System.out.println("\nArray de números decimales:");
        printArray(doubleArray);

        System.out.println("\nArray de caracteres:");
        printArray(charArray);
    }

    // Método genérico para imprimir arrays de cualquier tipo
    public static <T> void printArray(T[] array) {
       // for (T element : array) {
         //   System.out.printf("%s ", element);
         
         //esto es lo mismo que lo de arriba, pero en otra sintaxis
         for(int i=0; i< array.length; i++){
             System.out.println(array[i]+" ");
                     //System.out.println();

         }
        }
    }

    

