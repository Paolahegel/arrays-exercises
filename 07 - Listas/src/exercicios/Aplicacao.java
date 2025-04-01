package exercicios;

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Empregado> listaEmpregados = new ArrayList<Empregado>();

        System.out.println("Quantos empregados você quer registrar? ");
        int quantidadeEmpregados = sc.nextInt();

        for (int i = 0; i < quantidadeEmpregados; i++) { // percorre a lista
            System.out.println("Empregadodo #" + (i+1)); // para mostrar a quantidade a cada loop
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            // loop usando a função aux para não permitir repetição de id na lista
            while (verificarExistenciaId(listaEmpregados, id)) {
                System.out.println("Id já existente! Tente novamente");
                id = sc.nextInt();
            }
            sc.nextLine(); // limpa buffer
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            listaEmpregados.add(new Empregado(nome, salario, id)); // cria e adiciona os objetos na Lista
        }

        // algoritmo para buscar pelo id que o professor fez (com if e else)
        System.out.println("--------------");
        System.out.println("Informe o Id do Empregado que terá aumento de salário: ");
        Integer idEmpregado = sc.nextInt();


        // Fazendo a busca com Stream mais avançado com lambda
        Empregado find = listaEmpregados.stream()// transforma a lista em stream
                .filter(x -> x.getId() == idEmpregado) // cada elemento com id, compara o id com o id do parametro
                .findFirst() // pega o primeiro
                .orElse(null); // senao volta nulo


        //Integer find = procurarId(listaEmpregados, idEmpregado);
        if (find == null) {
            System.out.println("Id informado não existe, operação abortada");
        } else {
            System.out.println("Informe o percentual de aumento no salário: ");
            Double porcentagemDeAumento = sc.nextDouble();
            find.setSalario(porcentagemDeAumento);
            // na list, pego o id achado pela função aux e uso a função para aumentar o
            // salário vinculado nesse id com o valor a porcentagem inserido pela usuario
            //listaEmpregados.get(find).aumetarSalario(porcentagemDeAumento);
        }

// Forma de filtrar por id na lista algoritmo que eu fiz, grande demais rsrsr
//        for (Empregado empregado : listaEmpregados) {
//            if (!Objects.equals(empregado.getId(), idEmpregado)) {
//                System.out.println("Id informado não existe, operação abortada");
//                break;
//            } else {
//                System.out.println("Informe o percentual de aumento no salário: ");
//                Double porcentagemDeAumento = sc.nextDouble();
//                if (Objects.equals(empregado.getId(), idEmpregado)) {
//                    empregado.aumetarSalario(porcentagemDeAumento);
//                }
//            }
//        }

        System.out.println("--------------");
        for (Empregado s : listaEmpregados) { // exibe a lista de funcionários no final
            System.out.println("Lista de Empregados: ");
            System.out.println(s.getId() + ", " + s.getNome() + ", " + s.getSalario());
            }

        sc.close();
    }

    static  Integer procurarId(List<Empregado> list, int id) { // função aux para encontrar o id na lista
        for (int i = 0; i < list.size(); i++) { // varre a lista inteira
            if (list.get(i).getId() == id) {  // se o elemento da posição i, se seu id for igual o id de argumento
                return i;
            }
        }
        return null;
    }
    // função auxilixar para não permitir repetição de id
    static boolean verificarExistenciaId(List<Empregado> list, int id) {
        Empregado empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return empregado != null;
    }
}
