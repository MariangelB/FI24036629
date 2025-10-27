
import java.io.*;
import java.util.ArrayList;

public class Revert implements MyStrackInterface<Character>{

    private ArrayList<Character> myList = new ArrayList<Character>();

    public void push(Character item) {
        myList.add(item);
    }

    public Character pop() {
        if(!myList.isEmpty()){
            Character item = myList.removeLast();
            return item;
        }else {
            System.out.print("\n 'pop' failed: Stack underflow");
            return 'x';
        }
    }

    public Character peek() {
        return null;
    }
    public boolean empty() {
        boolean isEmpty = myList.isEmpty();
        return isEmpty;
    }

    public int size() {
        int count = myList.size();
        System.out.println("\n size: " + count);
        return count;
    }


    public static void main(String[] args) {
        Revert myStack = new Revert();
        String archivoEntrada = "input.txt";
        String archivoSalida = "output.txt";

        //Leer archivo input.txt y agrega al ArrayList
        try (FileReader leerEntrada = new FileReader(archivoEntrada)){
            int letra;
            while ((letra = leerEntrada.read()) !=-1){
                char ch = (char) letra;
                if (ch !='\r'){
                    myStack.push((char) letra);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Escribe en el archivo output.txt
        try (FileWriter escribir = new FileWriter(archivoSalida)){
            while(!myStack.empty()){
                char ch = myStack.pop();
                if (ch == '\n'){
                    escribir.write('\n');
                }else{
                    escribir.write(ch);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Muestra el contenido en consola
        /*try (BufferedReader leerSalida = new BufferedReader(new FileReader(archivoSalida))){
            String linea;
            while((linea = leerSalida.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


    }
}
