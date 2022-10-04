import java.io.File;

public class Ej4 {
    public static void main(String[] args) {
            ProcessBuilder pb=new ProcessBuilder(args);
            pb.command("java", "ProcesoLento");
            pb.redirectOutput(new File("C:\\Users\\amulero\\IdeaProjects\\Procesos\\salidaProceso.txt"));
            pb.directory(new File("C:\\Users\\amulero\\IdeaProjects\\Procesos\\out\\production\\Procesos"));
            try {

            }catch (Exception e){
                e.printStackTrace();
            }
    }
}
