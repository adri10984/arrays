import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int [] numeros = {10, 34, 86, 8 , 19, 22};
        Scanner sc = new Scanner(System.in);
        int busqueda;
        System.out.println("Introduce el numero: ");
        busqueda = sc.nextInt();
        for (int i = 0; i < numeros.length; i++ ){
            if (numeros[i] == busqueda){
                System.out.println(busqueda + " esta en la posicion " + i);
            } else {
                System.out.println("El numero no existe, posición -1");
            }
        }
    }
}
