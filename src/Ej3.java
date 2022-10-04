import java.io.IOException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserte el comando a insertar en consola");
        String linea=sc.nextLine();
        String[] comando=linea.split(",");
        ProcessBuilder pb=new ProcessBuilder(comando);
        try {
            Process p=pb.start();
            int cod=p.waitFor();
            System.out.println(cod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
