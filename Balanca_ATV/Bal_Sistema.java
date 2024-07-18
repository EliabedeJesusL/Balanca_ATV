package Balanca_ATV;

import java.util.Scanner;

public class Bal_Sistema {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Bal_Pessoa cliente = new Bal_Pessoa();
        double maior_imc = 0;
        String nome_maior_imc = "";
        double bt;

        System.out.println("Digite seu nome: ");
        cliente.nome = teclado.nextLine(); //NOME

        while (cliente.nome != "" && cliente.nome != " ") {

            System.out.println("Digite sua idade: ");
            cliente.idade = teclado.nextInt(); //IDADE

            teclado.nextLine();

            System.out.println("Digite seu Gênero: ");
            cliente.genero  = teclado.nextLine();

            System.out.println("Digite seu peso: ");
            cliente.peso = teclado.nextDouble(); //PESO

            System.out.println("Digite sua altura: ");
            cliente.altura = teclado.nextDouble(); //ALTURA
            
            bt = cliente.BT(cliente.IMC(), cliente.idade, cliente.genero);

            System.out.println(cliente.nome + ", Seu IMC é: " + cliente.IMC());
            System.out.println(cliente.nome + ", Seu BT é: " + bt);

            if (cliente.IMC() >  maior_imc) {
                maior_imc = cliente.IMC();
                nome_maior_imc = cliente.nome;
            }

            teclado.nextLine();
            System.out.println("Digite seu nome: ");
            cliente.nome = teclado.nextLine();
        }

        System.out.println("O(A) " + nome_maior_imc + " Tem o maior IMC, de: " + maior_imc);

        teclado.close();
    }
}
