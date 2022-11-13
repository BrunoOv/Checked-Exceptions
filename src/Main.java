import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        prueba1();

        prueba2();

        prueba3();

    }

    private static void prueba1() throws IOException {
        File file = new File("prueba1.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("En esta prueba el archivo se crea cada vez que el código se ejecuta");
            fileWriter.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    private static void prueba2() throws IOException {
        File file = new File("prueba2.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("En esta prueba el archivo crece en cada ejecución, lo nuevo se añade al final\n");
            fileWriter.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private static void prueba3() throws IOException {
        File file = new File("prueba3.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("En esta prueba ocurrirá un error\n");
            fileWriter.write("El resultado fallará: " + (1 / 0));
            fileWriter.close();
        } catch (ArithmeticException exception){
            System.out.println("Error Aritmetico");
        }
        fileWriter.close();
    }

}
