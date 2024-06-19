import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException, IOException {
        ConsultaConversion consulta = new ConsultaConversion();
        Scanner teclado = new Scanner(System.in);
        List<Moneda> conversion = new ArrayList<>();
        Moneda moneda;
        int opcion = 0;
        float monto = 0.0F;

        System.out.println("\n\nBuen dia tenga usted, gracias por usar nuestro servicio de conversor de monedas.\n");

        do
        {
            System.out.println("\n\nPor favor seleccione que de que moneda desea realizar conversion.\n");
            System.out.println("1.- De peso mexicano a dolar (MXN - USD)...");
            System.out.println("2.- De peso mexicano a euro (MXN - EUR)...");
            System.out.println("3.- De peso mexicano a Yen (MXN - JPY)...");
            System.out.println("4.- De peso colombiano a dolar (COP - USD)...");
            System.out.println("5.- De peso chileno a real brasileño (CLP - BRL)...");
            System.out.println("6.- De dolar a peso mexicano (USD - MXN)...");
            System.out.println("7.- De peso argentino a dolar (ARS - USD)...");
            System.out.println("8.- De real brasileño a dolar (BRL - USD)...");
            System.out.println("9.- De peso argentino a peso mexicano (ARS - MXN)...");
            System.out.println("10.- Salir...");

            opcion = teclado.nextInt();

            switch(opcion)
            {
                case 1:
                    System.out.println("\n\nDe peso mexicano a dolar...\n");
                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("MXN", "USD", monto);
                    System.out.println("\nEl monto de: "+monto+" pesos mexicanos ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" dolares ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 2:
                    System.out.println("\n\nDe peso mexicano a euro...\n");
                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("MXN", "EUR", monto);
                    System.out.println("\nEl monto de: "+monto+" pesos mexicanos ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" euros ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 3:
                    System.out.println("\n\nDe peso mexicano a Yen...\n");
                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("MXN", "JPY", monto);
                    System.out.println("\nEl monto de: "+monto+" pesos mexicanos ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" yens ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 4:
                    System.out.println("\n\nDe peso colombiano a dolar...\n");

                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("COP", "USD", monto);
                    System.out.println("\nEl monto de: "+monto+" pesos colombianos ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" dolares ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 5:
                    System.out.println("\n\nDe peso chileno a real brasileño...\n");

                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("CLP", "BRL", monto);
                    System.out.println("\nEl monto de: "+monto+" pesos chilenos ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" reales brasileños ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 6:
                    System.out.println("\n\nDe dolar a peso mexicano...\n");

                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("USD", "MXN", monto);
                    System.out.println("\nEl monto de: "+monto+" dolares ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" pesos mexicanos ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 7:
                    System.out.println("\n\nDe peso argentino a dolar...\n");

                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("ARS", "USD", monto);
                    System.out.println("\nEl monto de: "+monto+" pesos argentinos ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" dolares ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 8:
                    System.out.println("\n\nDe real brasileño a dolar...\n");

                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("BRL", "USD", monto);
                    System.out.println("\nEl monto de: "+monto+" reales brasileños ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" dolares ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 9:
                    System.out.println("\n\nDe peso argentino a peso mexicano...\n");

                    System.out.println("Ingrese la cantidad a convertir");
                    monto = teclado.nextFloat();

                    moneda = consulta.realizarConversion("ARS", "MXN", monto);
                    System.out.println("\nEl monto de: "+monto+" pesos argentinos ("+moneda.base_code()+") convertido corresponde a: "+moneda.conversion_result()+" pesos mexicanos ("+moneda.target_code()+")...");
                    conversion.add(moneda);
                break;

                case 10:
                    System.out.println("\n\nSaliendo... Gracias por usar nuestro conversor de monedas, por favor, vuelva pronto...\n");
                break;

                default:
                    System.out.println("\n\nLa opción selecionada no es la correcta, por favor, vuelva a intentar...\n");
                break;
            }

        }while(opcion!=10);

        GeneradorDeArchivo generador = new GeneradorDeArchivo();
        generador.guardarJson(conversion);
    }
}