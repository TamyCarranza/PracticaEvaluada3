/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author tamar
 */
public class PracticaEvaluada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ingresar nombres de productos
        String[] nombresProductos = {"Arroz", "Azucar", "Leche"};
 
        // Identamos tienda
        Tienda tienda = new Tienda(nombresProductos);
 
        // Se muestra ventas por producto
        tienda.mostrarVentasPorProducto();
 
        // El dia con mayores ventas
        System.out.println("El dia con mayores ventas es: " + tienda.diaConMayorVenta());
 
        // Producto más vendido
        Productos masVendido = tienda.productoMasVendido();
        System.out.println("El producto mas vendido es: " + masVendido.getNombre() +
                           " con " + masVendido.getTotalVentas() + " unidades.");
    }
}
       