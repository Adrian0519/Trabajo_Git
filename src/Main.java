import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        int n1, n2, suma, multiplicación;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        suma = n1 + n2;
        multiplicación = n1 * n2;

        System.out.println( "La suma de " + n1 + " más " + n2 + " es " + suma + "." );
        System.out.println( "La multiplicación de " + n1 + " por " + n2 + " es " + multiplicación + "." );
    }
}