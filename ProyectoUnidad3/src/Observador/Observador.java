/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observador;

/**
 *
 * @author Alejandro
 */
public interface Observador {
    public void actualiza(double costo_total,double costo_unitario,  String nombre);
    public void Telepantalla();
}
