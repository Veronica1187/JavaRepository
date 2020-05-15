public class Example {
    public static void main (String [] args){
        String mensaje1 = "Hola Mundo";
        String mensaje2 = "aaaabbbbccccdddeeeefff";

        boolean bBandera1= true;
        boolean bBandera2= false;

        int contador= 2;
        int num1 = 1;
        int num2 = 5;
        int resultado;

        if(bBandera1) {
            System.out.println("variable" + mensaje1);
            System.out.println(contador);
        } else{
            System.out.println(mensaje2);


        }

        for (int i = 0; i <= contador; i++){
            System.out.println(mensaje1);
        }
        for (int i = 0; i <= contador; i++){
            resultado = num1 / num2;
            System.out.println(resultado);
            num1 = num1 +i;
            num2++;
        }
        while (contador < 7){
            System.out.println("while");
            contador ++;

        }
    }
}
