/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

import java.util.Random;

/**
 *
 * @author tamar
 */
public class Tienda {
    private Productos[] productos;
    private int[][] ventas; // Matriz de ventas: [días][productos]
 
    // Constructor
    public Tienda(String[] nombresProductos) {
        int cantidadProductos = nombresProductos.length;
        this.productos = new Productos[cantidadProductos];
        this.ventas = new int[7][cantidadProductos];
 
        // Inicializar productos
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i] = new Productos(nombresProductos[i]);
        }
 
        // Se generan cantidades randoms para los productos 
        Random random = new Random();
        for (int i = 0; i < 7; i++) { // 7 días
            for (int j = 0; j < cantidadProductos; j++) {
                ventas[i][j] = random.nextInt(10); // Ventas entre 0 y 9
                productos[j].setTotalVentas(ventas[i][j]);
            }
        }
    }
 
    // Calculo para sacar el dia de mayores ventas totales 
    public String diaConMayorVenta() {
        int maxVentas = 0;
        int diaMayor = 0;
 
        for (int i = 0; i < 7; i++) {
            int sumaDia = 0;
            for (int j = 0; j < productos.length; j++) {
                sumaDia += ventas[i][j];
            }
 
            if (sumaDia > maxVentas) {
                maxVentas = sumaDia;
                diaMayor = i;
            }
        }
 
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        return dias[diaMayor] + " (con un total de " + maxVentas + " ventas.)";
    }
 
    // Se obtiene el producto más vendido
    public Productos productoMasVendido() {
        Productos masVendido = productos[0];
 
        for (Productos producto : productos) {
            if (producto.getTotalVentas() > masVendido.getTotalVentas()) {
                masVendido = producto;
            }
        }
        return masVendido;
    }
 
    // Las ventas por producto
    public void mostrarVentasPorProducto() {
        System.out.println("Total de ventas por producto:");
        for (Productos producto : productos) {
            System.out.println(producto.getNombre() + ": " + producto.getTotalVentas());
        }
    }
}