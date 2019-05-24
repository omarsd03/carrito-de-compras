/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritodecompras;

import static carritodecompras.Ventana.btnAgregarProducto;
import static carritodecompras.Ventana.btnEliminarProducto;
import static carritodecompras.Ventana.btnNuevaVenta;
import static carritodecompras.Ventana.btnTotal;
import static carritodecompras.Ventana.cbProductos;
import static carritodecompras.Ventana.tablaVentas;
import static carritodecompras.Ventana.txtPrecio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Omar
 */
public class Eventos implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(btnAgregarProducto)) {
            new Carrito().agregarCarrito();
        }
        
        if (e.getSource().equals(btnEliminarProducto)) {
            new Carrito().eliminarProducto(tablaVentas);
        }
        
        if (e.getSource().equals(btnTotal)) {
            new Carrito().totalVenta();
        }
        
        if (e.getSource().equals(btnNuevaVenta)) {
            new Carrito().nuevaVenta();
        }
        
        if (e.getSource().equals(cbProductos)) {
            
            if (cbProductos.getSelectedItem().equals("Chiles Serranos")) {
                txtPrecio.setText("9.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Chiles Jalapenios Grandes")) {
                txtPrecio.setText("9.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Chiles Jalapenios Chicos")) {
                txtPrecio.setText("8.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Chiles Poblanos")) {
                txtPrecio.setText("12.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Chile Morron")) {
                txtPrecio.setText("13.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Chile Habanero")) {
                txtPrecio.setText("40.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Cebollas Blancas Grandes")) {
                txtPrecio.setText("14.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Cebollas Blancas Taqueras")) {
                txtPrecio.setText("10.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Cebollas Amarillas Americanas")) {
                txtPrecio.setText("12.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Cebollas Moradas")) {
                txtPrecio.setText("12.00");
            }
            
            if (cbProductos.getSelectedItem().equals("Tomates Verdes")) {
                txtPrecio.setText("6.00");
            }
            
        }
        
    }
    
}
