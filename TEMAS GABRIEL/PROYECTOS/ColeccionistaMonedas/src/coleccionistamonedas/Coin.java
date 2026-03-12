package coleccionistamonedas;
import java.util.Scanner;

/**
 * Coin
 * @author Gabriel Acaro Sánchez
 */
public class Coin {
    
    // Atributos privados
    
    private double value;
    private String country;
    private String material;
    
    // Constructores
    
    public Coin() {
        value = 0;
        country = "";
        material = "";
    }

    public Coin(double value, String country, String material) {
        this.value = value;
        this.country = country;
        this.material = material;
    }
    
    // Getters y Setters

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    // Otros métodos
    
    // Metodo que pide al usuario los datos de las monedas y rellena el array con esos datos
    
    public static Coin[][] fillSecurityBox(Coin[][] securityBox){
        Scanner sc = new Scanner(System.in);
        
        double value = 0;
        String country = "";
        String material = "";
        
        for (int i = 0; i < securityBox.length; i++) {
            for (int j = 0; j < securityBox[i].length; j++) {
                System.out.println("\nIntroduzca el valor de la moneda situada en el cuadrante " + i + "" + j + ":");
                value = sc.nextDouble();
                sc.nextLine();
        
                System.out.println("\nIntroduzca el nombre del pais de fabricacion de la moneda situada en el cuadrante " + i + "" + j + ":");
                country = sc.nextLine();
        
                System.out.println("\nIntroduzca el material con el que se hizo la moneda situada en el cuadrante " + i + "" + j + ":");
                material = sc.nextLine();
                
                securityBox[i][j] = new Coin(value, country, material);
            }
        }
        
        return securityBox;
    }
    
    // Metodo que muestra la informacion de todas las monedas
    
    public static void showCoins(Coin[][] securityBox) {
        for (int i = 0; i < securityBox.length; i++) {
            for (int j = 0; j < securityBox[i].length; j++) {
                System.out.println("\nMoneda situada en el cuadrante " + i + "" + j + ": "+ securityBox[i][j].toString() + "\n");
            }
        }
    }
    
    // Metodo que muestra las monedas que sean de un material especificado
    
    public static void showCoinByMaterial(Coin[][] securityBox) {
        Scanner sc = new Scanner(System.in);
        
        String material = "";
        
        System.out.println("Introduzca el material a filtrar: \n");
        
        material = sc.nextLine();
        
        System.out.println("Mostrando las monedas segun el material introducido...\n");
        
        for (int i = 0; i < securityBox.length; i++) {
            for (int j = 0; j < securityBox[i].length; j++) {
                if (securityBox[i][j].getMaterial().equals(material)) {
                    System.out.println(securityBox[i][j].toString());
                } else {
                    System.out.println("\nNo se encontraron monedas de ese material!");
                }
            }
        }
    }
    
    // Metodo que muestra la moneda con el valor mas alto
    
    public static void showMostValuatedCoin(Coin[][] securityBox) {
        double mostValuateCoin = 0;
        
        for (int i = 0; i < securityBox.length; i++) {
            for (int j = 0; j < securityBox[i].length; j++) {
                if (securityBox[i][j].getValue() > mostValuateCoin) {
                    mostValuateCoin = securityBox[i][j].getValue();
                }
            }
        }
        
        System.out.println("La moneda mas valiosa es la que vale: " + mostValuateCoin + " euros");
    }
    
    // ToString

    @Override
    public String toString() {
        return "\nValor en euros: " + value + " euros\n"
                + "Pais de fabricacion: " + country + "\n"
                + "Material de la moneda: " + material + "\n";
    }
}
