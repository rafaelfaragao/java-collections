package dio.me;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        //CONHECENDO MÉTODOS DO ARRAYLIST

        //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:
        //Como criar uma lista
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Imprimir a lista após inserção dos valores: ");
        System.out.println(notas); // ou notas.toString()

        System.out.println("Exibir posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicionar a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substituir a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Verificar se a nota 5.0 está na lista: " + notas.contains(5.0));

        //System.out.println("Imprimir a lista na ordem que foram inseridas as notas: ");
        //for (Double nota: notas ) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0:");
        notas.remove(0d); //se não colocar o d ou .0, vai ser um int e int é a posição e não o valor.
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0:");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7d) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println();
        System.out.println("LinkedList - notas2: ");
        System.out.println(notas2);

        System.out.println("Primeiro item: " + notas2.getFirst());
        System.out.println("Ultimo item: " + notas2.getLast());

    }
}
