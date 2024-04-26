import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Busqueda busca = new Busqueda();
        Divisa divisa = busca.buscarDivisa("USD");
        int opc = 0;
        double valor;
        Saver guardar = new Saver();
        System.out.println("**************************\nBienvenido al conversor de divisas by Dhalex");
        while (true){
            System.out.println("1) Dolar ---> Peso mexicano");
            System.out.println("2) Dolar ---> Euro");
            System.out.println("3) Dolar ---> Peso argentino");
            System.out.println("4) Euro ---> Peso argentino");
            System.out.println("5) Euro ---> Peso mexicano");
            System.out.println("6) Peso mexicano ---> Peso argentino");
            System.out.println("7) Consultar historial de transacciones");
            System.out.println("8) Salir");
            System.out.println("***********************");
            System.out.println("Elija una opción válida: ");
            try {
                opc = Integer.parseInt(entrada.next());
                if(opc==8){
                    break;
                }
                switch (opc){
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor = entrada.nextDouble();
                        System.out.println(valor+" dolares es equivalente a: "+(valor*divisa.MXN())+" pesos mexicanos\n");
                        guardar.SaverStr(valor,"USD","MXN",valor* divisa.MXN());
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor = entrada.nextDouble();
                        System.out.println(valor+" dolares es equivalente a: "+(valor*divisa.EUR())+" euros\n");
                        guardar.SaverStr(valor,"USD","EUR",valor* divisa.EUR());
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor = entrada.nextDouble();
                        System.out.println(valor+" dolares es equivalente a: "+(valor*divisa.ARS())+" pesos argentinos\n");
                        guardar.SaverStr(valor,"USD","ARS",valor* divisa.ARS());
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor = entrada.nextDouble();
                        divisa = busca.buscarDivisa("EUR");
                        System.out.println(valor+" euros es equivalente a: "+(valor*divisa.ARS())+" pesos argentinos\n");
                        guardar.SaverStr(valor,"EUR","ARS",valor* divisa.ARS());
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor = entrada.nextDouble();
                        divisa = busca.buscarDivisa("EUR");
                        System.out.println(valor+" euros es equivalente a: "+(valor*divisa.MXN())+" pesos mexicanos\n");
                        guardar.SaverStr(valor,"EUR","MXN",valor* divisa.MXN());
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor = entrada.nextDouble();
                        divisa = busca.buscarDivisa("MXN");
                        System.out.println(valor+" pesos mexicanos es equivalente a: "+(valor*divisa.ARS())+" pesos argentinos\n");
                        guardar.SaverStr(valor,"MXN","ARS",valor* divisa.ARS());
                        break;
                    case 7:
                        try {
                            guardar.Printer();
                        }catch(NullPointerException e){
                            System.out.println("Historial vacio");
                        }
                        break;
                    default:
                        System.out.println("*****Opcion no valida****");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Error: Ingrese un numero valido ");
            }
        }
    }
}
