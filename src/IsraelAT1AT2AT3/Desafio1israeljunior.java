package Aula02.IsraelAT1AT2;

public class Desafio1israeljunior {
    public static void main(String[] args) {

        // DESAFIO  1 //
        String desafio01 =  "Desafio 1";
        System.out.println(desafio01);
        System.out.println();


        String nome = "Israel";
        String sobrenome = "Junior";

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Nome completo: " + nome.concat(sobrenome));

        System.out.println(nome.equals(sobrenome));
        System.out.println(nome.equalsIgnoreCase(sobrenome));
        System.out.println(nome.length());

        String nomeCompleto = "Israel Junior";
        System.out.println("Nome em maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Total de caracteres: " + nomeCompleto.length());
        System.out.println("Primeiro caractere: " + nomeCompleto.charAt(0));

        int idade = 38;
        System.out.println("Idade: " + idade);
        String cpf = "400.289.222-98";
        System.out.println("CPF: " + cpf);
        System.out.println();



        //DESAFIO  2  //
        String desafio02 =  "Desafio 2";
        System.out.println(desafio02);
        System.out.println();

        String frase02 =  " Java é muito Legal! ";
        frase02 = frase02.trim();
        System.out.println(frase02);

        System.out.println(frase02.toLowerCase().endsWith("legal!"));

        frase02 = frase02.replace("Legal", "Incrível");
        System.out.println(frase02);

        String[] palavras = frase02.split(" ");
        for (String palavra : palavras){
            System.out.println(palavra);
        }

        //DESAFIO  3  //
        String desafio03 =  "Desafio 3";
        System.out.println(desafio03);
        System.out.println();






    }
}