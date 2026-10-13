public class Ej6 {
    public static void main(String[] args) {
        int [] numeros = {2, 5, 6, 2, 3, 45, 6, 7, 1, 9};
        int minimo = numeros[0];
        for (int i = 0; i < numeros.length; i++ ){
            if (numeros[i] < minimo){
                minimo = numeros[i];
            }
        }
        System.out.println("El numero más pequeño es el: " + minimo);

    }
}
