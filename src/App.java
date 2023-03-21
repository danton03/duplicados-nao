import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[]{"Morango", "Uva", "Acerola", "Manga", "Caju", "Abacaxi", "Kiwi"};
        String[] array2 = new String[]{"Pêra", "Caju", "Morango", "Kiwi"};
        String resposta = retornaDuplicadas(array1, array2);
        System.out.println(resposta);
    }

    static String retornaDuplicadas(String[] array1, String[] array2){
        List <String> duplicados = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    duplicados.add(array1[i]);
                }
            }
        }
        return formataResposta(duplicados);
    }

    static String formataResposta(List<String> duplicados){
        String resposta = "";
        if (!duplicados.isEmpty()) {
            resposta = "Palavras duplicadas: ";
            for (int i = 0; i < duplicados.size(); i++) {
                if (i == duplicados.size()-1) {
                    resposta+= duplicados.get(i);
                }
                else{
                    resposta+= (duplicados.get(i)+", ");
                }
            }
        }
        else{
            resposta = "Nenhuma palavra duplicada encontrada.";
        }
        return resposta;
    }
}
