package escrita_de_arquivos;

import java.io.FileWriter;
import java.io.IOException; 
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Digite o nome do arquivo de destino: ");
            String arquivo = "D:\\Edson\\Estudos\\Programação\\back-end\\utilities-java\\caminhotext\\txt.json";
            String mensagemTest = scan.next();
            
            try {
                FileWriter fileWriter = new FileWriter(arquivo);

                fileWriter.write(mensagemTest);
     
                fileWriter.close();
         
                System.out.println("Conteúdo foi escrito no arquivo com sucesso.");
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        }
    }
}
