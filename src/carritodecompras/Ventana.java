/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carritodecompras;

import Componentes.MisComponentes;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class Ventana {
    
    static JComboBox cbProductos, cbCantidad;
    static JButton btnTotal, btnAgregarProducto, btnNuevaVenta, btnEliminarProducto;
    static JLabel lblCantidad, lblProductos, lblPrecio, lblTotal;
    static JTextField txtPrecio;
    static JTable tablaVentas;
    static DefaultTableModel modelo;
    
    Ventana() {
        
        JFrame f = new JFrame("Mi Carrito de Compras");
        
        JPanel p = new JPanel();
        
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints restricciones = new GridBagConstraints();
        
        MisComponentes c = new MisComponentes();
        
        p.setLayout(gridBagLayout);
        f.setSize(700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblCantidad = c.getLabel("Cantidad Kg");
        
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.weightx = 1.0;
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblCantidad, restricciones);
        
        lblProductos = c.getLabel("Productos");
        
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.weightx = 1.0;
        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblProductos, restricciones);
        
        lblPrecio = c.getLabel("Precio");
        
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.weightx = 1.0;
        restricciones.gridx = 2;
        restricciones.gridy = 0;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblPrecio, restricciones);
        
        p.add(lblCantidad);
        p.add(lblProductos);
        p.add(lblPrecio);
        
        cbCantidad = new JComboBox();
        cbCantidad.addItem("Elige una cantidad");
        cbCantidad.addItem("1");
        cbCantidad.addItem("2");
        cbCantidad.addItem("3");
        cbCantidad.addItem("4");
        cbCantidad.addItem("5");
        cbCantidad.addItem("6");
        cbCantidad.addItem("7");
        cbCantidad.addItem("8");
        cbCantidad.addItem("9");
        cbCantidad.addItem("10");
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(cbCantidad, restricciones);
        
        p.add(cbCantidad);
        
        cbProductos = new JComboBox();
        cbProductos.addActionListener(new Eventos());
        cbProductos.addItem("Selecciona un producto");
        cbProductos.addItem("Chiles Serranos");
        cbProductos.addItem("Chiles Jalapenios Grandes");
        cbProductos.addItem("Chiles Jalapenios Chicos");
        cbProductos.addItem("Chiles Poblanos");
        cbProductos.addItem("Chile Morron");
        cbProductos.addItem("Chile Habanero");
        cbProductos.addItem("Cebollas Blancas Grandes");
        cbProductos.addItem("Cebollas Blancas Taqueras");
        cbProductos.addItem("Cebollas Amarillas Americanas");
        cbProductos.addItem("Cebollas Moradas");
        cbProductos.addItem("Tomates Verdes");
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(cbProductos, restricciones);
        
        p.add(cbProductos);
        
        txtPrecio = c.getField(10);
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 2;
        restricciones.gridy = 1;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(txtPrecio, restricciones);
        
        p.add(txtPrecio);
        
        btnAgregarProducto = c.getButton("Agregar al Carrito");
        btnAgregarProducto.addActionListener(new Eventos());
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 1;
        restricciones.gridy = 2;
        restricciones.insets = new Insets(5, 5, 5, 5);
        restricciones.anchor = GridBagConstraints.CENTER;
        gridBagLayout.setConstraints(btnAgregarProducto, restricciones);
        
        p.add(btnAgregarProducto);
        
        tablaVentas = new JTable();
        
        modelo = (DefaultTableModel) tablaVentas.getModel();
        tablaVentas.setModel(modelo);
        
        modelo.addColumn("Cantidad");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Total");
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 1;
        restricciones.gridy = 3;
        restricciones.insets = new Insets(5, 5, 5, 5);
        restricciones.anchor = GridBagConstraints.CENTER;
        gridBagLayout.setConstraints(tablaVentas, restricciones);
        
        p.add(tablaVentas);
        
        btnEliminarProducto = c.getButton("Eliminar del Carrito");
        btnEliminarProducto.addActionListener(new Eventos());
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 1;
        restricciones.gridy = 4;
        restricciones.insets = new Insets(5, 5, 5, 5);
        restricciones.anchor = GridBagConstraints.CENTER;
        gridBagLayout.setConstraints(btnEliminarProducto, restricciones);
        
        p.add(btnEliminarProducto);
        
        btnTotal = c.getButton("Total");
        btnTotal.addActionListener(new Eventos());
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.insets = new Insets(5, 5, 5, 5);
        restricciones.anchor = GridBagConstraints.CENTER;
        gridBagLayout.setConstraints(btnTotal, restricciones);
        
        p.add(btnTotal);
        
        lblTotal = c.getLabel("Total a Pagar: $0.00");
        lblTotal.setFont(new java.awt.Font("Gill Sans", 0, 24));
        
        restricciones.weightx = 0.0;
        restricciones.gridx = 1;
        restricciones.gridy = 6;
        restricciones.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(lblTotal, restricciones);
        
        p.add(lblTotal);
        
        btnNuevaVenta = c.getButton("Nueva Venta");
        btnNuevaVenta.addActionListener(new Eventos());
        
        restricciones.weightx = 1.0;
        restricciones.gridx = 1;
        restricciones.gridy = 7;
        restricciones.insets = new Insets(5, 5, 5, 5);
        restricciones.anchor = GridBagConstraints.CENTER;
        gridBagLayout.setConstraints(btnNuevaVenta, restricciones);
        
        p.add(btnNuevaVenta);
        
        f.add(p);
        
        f.setVisible(true);
        
    }
    
}
