public class Ej9 {
    public static void main(String[] args) {
        int [] numeros = {7, 5, 6, 2, 3, 45, 6, 7, 8, 9};
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < numeros.length; i++ ){
            if (numeros[i] % 2 == 0){
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println("Hay " + pares + " pares");
        System.out.println("Hay " + impares + " impares");


    }
}
