/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaconsola;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class PracticaConsola {
    
    int[] listaNumeros = {20, 31, 27, 2, 5, 99};
    
    
    /*
    el metodo maximos va a calcular el maximo y el segundo maximo del array
    */
    private int[] maximos (int[] lista){
        int [] listaMaximos = {lista[0], 0};
        for(int i=0; i<lista.length; i++){
            if(listaMaximos[0] < lista[i]){
                listaMaximos[1] = listaMaximos[0];
                listaMaximos[0] = lista[i];
            }else{
                if(listaMaximos[1] < lista[i]){
                    
                }
                    
            }
        }
        return listaMaximos;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PracticaConsola ejercicios = new PracticaConsola();
       System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        
    }
    
}
