import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class InterfaceRobo {

	private static int opcao;
	private static int n1 = 0;
	private static int n2 = 0;
	private static Robo robo;
	private static Scanner name;
	private static Scanner opc;
	private static Date d;
	private static Scanner scaum;
	private static Scanner scadois;
	private static FileWriter file;


	private static void inicializa() throws IOException {
		robo = new Robo("",100,"");
		name = new Scanner(System.in);
		opc = new Scanner(System.in);
		d = new Date();
		file = new FileWriter(new File(System.getProperty("user.dir")+"/file.txt"));
	}

	public static void pegaNumero() {
		scaum = new Scanner(System.in);
		scadois = new Scanner(System.in);
		System.out.println("\nDigite o primeiro numero:");
		n1 = scaum.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = scadois.nextInt();
	}

	public static void opcaoMenu (Robo robo, double value, String tipo) throws IOException {
		robo.setBateria(robo.getBateria()-1);
		System.out.println("\nResultado = " + value + " Bateria = " + robo.getBateria());
		file.write(tipo);
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

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		inicializa();
		String nome;
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
				file.write("robô mostrado");
				break;
			case 2:
				pegaNumero();
				opcaoMenu(robo, robo.Soma(n1, n2), "soma");
				break;
			case 3:
				pegaNumero();
				opcaoMenu(robo, robo.Subtracao(n1, n2), "subtração");
				break;
			case 4:
				pegaNumero();
				opcaoMenu(robo, robo.Multiplicacao(n1, n2), "multiplicação");
				break;
			case 5:
				pegaNumero();
				opcaoMenu(robo, robo.Divisao(n1, n2), "divisão");
				break;
			case 6:
				robo.setBateria(100);
				System.out.println("\nBateria Carregada");
				file.write("bateria carregada");
				break;
			default:
				System.out.println("\nOpção inválida! Tente novamente.");     }
		} while(opcao != 0);
		System.out.println("Fim de execução");   }   

}