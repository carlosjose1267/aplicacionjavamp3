/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
/**
 *
 * @author carlo
 */
public class JavaApplication3 {

   
    public static void main(String[] args) {
        /* Indicamos que la variable reproductor es un tipo de variable AdvancePlayer
        que contiene propiedades para reproducir archivo como .play*/
        AdvancedPlayer reproductor;
        /* JFileChooser es el tipo de recoge el valor a traves de un objeto  */
        JFileChooser seleccionar = new JFileChooser();
        /* Creamos una variable para almacenar el valor de ese objeto
        utilizando showOpendialog que es el tipo de explorador de archivos */
        int a = seleccionar.showOpenDialog(null);
        /* Creamos la condicion para realizar acciones */
        if(a==JFileChooser.APPROVE_OPTION)
        {
           /* Creamos la variable archivo asignamos el tipo de variable File
            y le indicamos que el valor del objeto a recoger sera el que esta seleccionado
            añadiendo getSelectedFile como metodo*/ 
           File archivo = seleccionar.getSelectedFile();
           /* Luego instanciamos el Cuando recoja el valor lanzare el reproductor con el archivo almacenado
           desde la ventana del explorador de archivos y lo reproduce*/
           try
           {
           reproductor = new AdvancedPlayer(new FileInputStream(archivo));
           reproductor.play();
           }
           /* En caso de que no se cumpla lo anterior nos imprimira
           por la salida del interprete "Ocurrio un fallo" */
           catch(Exception e)
           {
               System.out.print("Ocurrio un fallo");
           }
        }
    }
}
    

