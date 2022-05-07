/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author tique
 */
public class ArrayList {

    Comparable Arrayd[] = new Comparable[10];
    int cola = 0;

    public void push(Comparable dato) {
        if (cola == Arrayd.length) {
            Comparable Nuevo_Array[] = new Comparable[Arrayd.length * 2]; //crecimiento doble del tamaño
            for (int i = 0; i < Arrayd.length; i++) {
                Nuevo_Array[i] = Arrayd[i];
            }
            Arrayd = Nuevo_Array;
        }
        Arrayd[cola] = dato;
        cola++;
    }

    public void pop() {
        cola--;
    }

    public void pop(int index) {
        for (int i = index; i < (Arrayd.length) - 1; i++) {
            Arrayd[i] = Arrayd[i + 1];
            pop();
        }
    }

 

}
