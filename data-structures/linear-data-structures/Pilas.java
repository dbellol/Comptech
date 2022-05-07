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

public class Pilas {

    int tope = 0;
    ArrayList Arrayd = new ArrayList();

    void push(Object ingreso) {
        Arrayd.push(ingreso);
        tope++;
    }

    void pop() {
        Arrayd.pop(tope);
        tope--;
    }

    boolean isEmpty() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }
}
