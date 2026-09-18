package AT1;

public class Desafio1 {
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
        System.out.println("Nome em maiúsculo: " + nomeCompleto.toUpperCase());
        System.out.println("Total de caracteres: " + nomeCompleto.length());
        System.out.println("Primeiro caractere: " + nomeCompleto.charAt(0));

        int idade = 38;
        System.out.println("Idade: " + idade);
        String cpf = "400.289.222-98";
        System.out.println("CPF: " + cpf);
        System.out.println();

        //DESAFIO  3  //
        String desafio03 =  "Desafio 3";
        System.out.println(desafio03);
        System.out.println();







    }
}