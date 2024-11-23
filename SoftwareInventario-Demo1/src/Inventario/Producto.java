/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author hp
 */
public class Producto extends Item{
    private double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(double precio, int cantidad, String codigo, String nombre) {
        super(codigo, nombre);
        this.precio = precio;
        this.cantidad = cantidad;
    }

  

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    void mostrar() {
        JTextArea salida = new JTextArea();
        salida.setText("Código\tNombre\tPrecio\tCantidad\n");
        salida.append(getCodigo() + "\t" + getNombre() + "\t" + getPrecio() + "\t" + getCantidad() + "\n");
        JOptionPane.showMessageDialog(null, salida);
    }
    
}
