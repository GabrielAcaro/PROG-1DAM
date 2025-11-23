package ejercicio24;
/**
 * Test
 * @author Gabriel Acaro Sánchez
 */
public class Test {
    public static void main(String[] args) {
        
        // Creo los objetos necesarios con el constructor parametrizado
        
        ProductoFresco fresco = new ProductoFresco("2025-12-31", "F123", "2025-06-01", "Espania");
        ProductoRefrigerado refrigerado = new ProductoRefrigerado("2025-11-30", "R456", "ORG789");
        ProductoCongelado congelado = new ProductoCongelado("2026-01-15", "C789", -18.0);

        // Mostramos la información
        
        System.out.println(fresco.toString() + "\n");
        System.out.println(refrigerado.toString() + "\n");
        System.out.println(congelado.toString() + "\n");
    }
}
