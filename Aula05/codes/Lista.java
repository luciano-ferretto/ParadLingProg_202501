import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        //Lista Imutável usando o List.of()
        List<String> listaImutavel = List.of("A", "B", "C");

        //Lista de tamanho fixo usando o Arrays.asList()
        List<String> listaTamanhoFixo = Arrays.asList("X", "Y", "Z");
        
        //Testando operações de adição e remoção
        //listaImutavel.add("D");
        listaTamanhoFixo.add("X");
    }
}
