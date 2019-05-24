/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritodecompras;

import static carritodecompras.Ventana.cbCantidad;
import static carritodecompras.Ventana.cbProductos;
import static carritodecompras.Ventana.lblTotal;
import static carritodecompras.Ventana.modelo;
import static carritodecompras.Ventana.tablaVentas;
import static carritodecompras.Ventana.txtPrecio;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class Carrito {
    
    public void agregarCarrito() {
        
        double cantidad;
        double precio;
        double total;

        cantidad = Double.parseDouble(cbCantidad.getSelectedItem().toString());
        precio = Double.parseDouble(txtPrecio.getText());
        total = cantidad * precio;

        Object[] fila = new Object[4];
        fila[0] = cbCantidad.getSelectedItem().toString();
        fila[1] = cbProductos.getSelectedItem().toString();
        fila[2] = txtPrecio.getText();
        fila[3] = total;

        modelo.addRow(fila);
        
    }
    
    public void totalVenta() {
        
        double totalFinal = 0;
        double precios = 0;

        if (tablaVentas.getRowCount() > 0) {

            for (int i = 0; i < tablaVentas.getRowCount(); i++) {
                precios = Double.parseDouble(tablaVentas.getValueAt(i, 3).toString());
                totalFinal += precios;
            }

            lblTotal.setText("Total a Pagar: $" + totalFinal);

        }
        
    }
    
    public void eliminarProducto(JTable tablaVentas) {
        
        modelo = (DefaultTableModel) tablaVentas.getModel();
        int fila = tablaVentas.getSelectedRow();
        
        if (fila >= 0) {
            
            int filaSelec[] = tablaVentas.getSelectedRows();
            
            for (int i=0; i<filaSelec.length;i++) {
                modelo.removeRow(filaSelec[i]);
            }
            
        } else {
            System.out.println("No Selecciono Ninguna Fila");
        }
        
    }
    
    public void nuevaVenta() {
        
        cbCantidad.setSelectedIndex(0);
        cbProductos.setSelectedIndex(0);
        txtPrecio.setText("");
        lblTotal.setText("Total a Pagar: $");
        modelo.setRowCount(0);
        
    }
    
}
