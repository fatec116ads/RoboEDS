import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class InterfaceRobo {

	static int opcao;
	private static int n1 = 0;
	private static int n2 = 0;
	
	public static void pegaNumero() {
		Scanner scaum = new Scanner(System.in);
		Scanner scadois = new Scanner(System.in);
		System.out.println("\nDigite o primeiro numero:");
		n1 = scaum.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = scadois.nextInt();
	}
	
	public static void opcao (Robo robo, double value) {
		robo.setBateria(robo.getBateria()-1);
		System.out.println("\nResultado = " + value + " Bateria = " + robo.getBateria());
	}
	
	public static void menu() {
		System.out.println("\nDIGITE A OPÇÃO DESEJADA");
		System.out.println("	1 - Mostrar Robô");
		System.out.println("	2 - Soma");
		System.out.println("	3 - Subtração");
		System.out.println("	4 - Multiplicação");
		System.out.println("	5 - Divisão");
		System.out.println("	6 - Carregar Bateria");
		System.out.println("	0 - Sair");
		System.out.println("\nOpção: "); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robo robo = new Robo("",100,"");
		String nome;
		Scanner name = new Scanner(System.in);
		Scanner opc = new Scanner(System.in);
		java.util.Date d = new Date();
		String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		robo.setFabrica(dStr);
		System.out.println("Digite o nome do seu Robô: ");
		nome = name.nextLine();
		robo.setNome(nome);
		do{
			menu();
			opcao = opc.nextInt();

			switch(opcao){
			case 0:			
				break;
			case 1:
				System.out.println("\nOlá, eu sou o " + robo.getNome() + "! \nEsta é a minha bateria: " + robo.getBateria() + " \nFui fabricado em: " + robo.getFabrica());
				break;
			case 2:
				pegaNumero();
				opcao(robo, robo.Soma(n1, n2));
				break;
			case 3:
				pegaNumero();
				opcao(robo, robo.Subtracao(n1, n2));
				break;
			case 4:
				pegaNumero();
				opcao(robo, robo.Multiplicacao(n1, n2));
				break;
			case 5:
				pegaNumero();
				opcao(robo, robo.Divisao(n1, n2));
				break;
			case 6:
				robo.setBateria(100);
				System.out.println("\nBateria Carregada");
				break;
			default:
				System.out.println("\nOpção inválida! Tente novamente.");     }
		} while(opcao != 0);
		System.out.println("Fim de execução");   }   }