/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author tamar
 */
public class Productos {
        private String nombre;
        private int totalVentas;

        // Constructor
        public Productos(String nombre) {
            this.nombre = nombre;
            this.totalVentas = 0;
        }

        // Métodos de los setters y getters
        public String getNombre() {
            return nombre;
        }

        public void setTotalVentas(int ventas) {
            this.totalVentas += ventas;
        }

        public int getTotalVentas() {
            return totalVentas;
        }
}