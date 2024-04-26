import java.util.ArrayList;

public class Saver {
    private ArrayList<String> conversiones = new ArrayList<>();
    private String cadena;

    public void SaverStr(double numero, String divisaUno, String divisaDos, double resultado){
        this.cadena = numero + " " + divisaUno+ " a "+divisaDos+ " con resultado: "+resultado;
        conversiones.add(cadena);
    }

    public void Printer(){
        if(this.conversiones.isEmpty()){
            System.out.println("El historial está vacío");
        }else {
            for (int i = 0; i < conversiones.size(); i++) {
                System.out.println("----------------------------------------------------------");
                System.out.println(conversiones.get(i));
            }
        }
        System.out.println("----------------------------------------------------------\n");
    }
}
