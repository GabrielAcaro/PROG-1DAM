package caritmetica2;
public class CAritmetica2 {
    /**
     * @author Gabriel Acaro Sánchez
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato1, dato2, dato3, resultado;
        
        dato1 = 40;
        dato2 = 20;
        dato3 = 2;
        
        //Suma
        
        resultado = dato1 + dato2 + dato3;
        System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);
        
        //Resta
        
        resultado = dato1 - dato2 - dato3;
        System.out.println(dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);
        
        //Producto
        
        resultado = dato1 * dato2 * dato3;
        System.out.println(dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);
        
        //Cociente
        
        resultado = dato1 / dato2 / dato3;
        System.out.println(dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado);
    }
    
}
