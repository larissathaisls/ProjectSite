import java.util.Scanner;
import java.util.Random;

public class Caixa {
    
    public Conta(){

this.codigo = r.nextInt(9999);
System.out.println("Digite seu Nome: ");
this.nome = s.nextLine();
System.out.println("Digite o saldo Inicial: ");
this.saldo = s.nextDouble();
System.out.println();


}
    
    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
    
        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Ente com seu nome: ");
        nome = entrada.nextLine();
        
        System.out.print("Entre com o valor inicial depositado na conta: ");
        inicial = entrada.nextDouble();
        
        //Criando a conta de um cliente
        Conta minhaConta = new Conta(nome, conta, inicial);
        minhaConta.iniciar();
    }
    
    
}
