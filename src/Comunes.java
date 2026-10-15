public class Comunes {
    public static void main(String[] args) {
        int [] numeros = {2, 3, 4, 5, 6, 7, 8, 9};
        int [] numeros2 = {10, 11, 12, 4, 9, 13, 14, 15};
        int iguales= 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros[i] == numeros2[j]) {
                    System.out.println("Se repite en ambos arrays: " + numeros[i]);
                }
            }
        }

    }
}
