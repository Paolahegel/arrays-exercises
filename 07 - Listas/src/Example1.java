import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {

        // Declarando uma lista inteiros em uma List, com classe ArrayList que implenta a interface List
        List<String> list = new ArrayList<>();

        list.add("Linda");
        list.add("Estudiosa");
        list.add("Paola está aprendendo");
        // passando aposição que quero adicionar o tipo String
        list.add(2, "Orgulhosa");

        // ver o tamanho da lista
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------");
        // remove elemento na posiçaõ indicada
        list.remove(2);

        // remove um elemento por predicato, operação removeIf faz isso
        list.removeIf(x -> x.charAt(0) == 'P');
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.size());

        System.out.println("---------------");
        // encontrar algum elemento na lista usa-se index Of, caso não tenha retorna -1
        System.out.println("Index of Paola: " + list.indexOf("Paola"));

        System.out.println("---------------");
        // Filtar minha lista por um caracter
        List<String> listFilter = list.stream() // transforma em uma Stream para filtrar a nova lista
                .filter(x -> x.charAt(0) == 'P') // filtra na nova lista apenas os que começam com o elemento determinado
                .collect(Collectors.toList()); // transforma em lista novamente o filtro da coleção na nova lista
        for (String s : listFilter) {
            System.out.println(s);
        }
        // pegando o primeiro elemento que atende ao predicato do lambda
        System.out.println("---------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(name);


    }
}
