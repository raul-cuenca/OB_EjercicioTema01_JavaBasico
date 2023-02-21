/**
 * Clase para definir
 * tipo de datos y veriables
 */
public class TipoDatos {
    public static void main(String[] args) {

//        numericos
        byte num_byte = 10;
        short num_short = 23;
        int nun_int = 5;
        long num_long = 1237183;
        float num_float = 29.5f;
        double num_double = 290.3d;

//        booleano
        boolean check = true;

//        String
        String name = "raul cuenca";

//        char
        char vocal = 'a';

        /**
         * Imprimir valores de todos los tipos de datos del capítulo
         *
         */

        imprimir("Tipo de dato byte   => " + num_byte);
        imprimir("Tipo de dato short  => " + num_short);
        imprimir("Tipo de dato int    => " + nun_int);
        imprimir("Tipo de dato long   => " + num_long);
        imprimir("Tipo de dato float  => " + num_float);
        imprimir("Tipo de dato double => " + num_double);
        imprimir("Tipo de dato String => " + name);
        imprimir("Tipo de dato char   => " + vocal);
        imprimir("Tipo de dato boolean =>" + check);


    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    public void imprimir(int variable) {
        System.out.println(variable);
    }

    public void imprimir(double variable) {
        System.out.println(variable);
    }

    public void imprimir(float variable) {
        System.out.println(variable);
    }

    public void imprimir(char variable) {
        System.out.println(variable);
    }


}
