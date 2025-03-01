package aplicacao;

import java.util.Scanner;

import model.Iphone;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char opcao;
		boolean bloqueado = false;
		String musica = null;
		char opcoes = 0;
		String numero;
		String paginaInternet;
		
		Iphone iphone = new Iphone();
		
		do {
			System.out.println("----- Iphone ----");
			System.out.println("--- Apps ---");
			System.out.println("- Reprodutor Musical (1)-");
			System.out.println("- Aparelho Telefonico (2)-");
			System.out.println("- Navegador Internet (3)-");
			System.out.println("- Bloquear iphone - (0)");

			System.out.print("Digite: ");
			opcao = sc.next().charAt(0);

			if(!bloqueado) {
				switch(opcao) {
				case '1':{
					
					System.out.println("Musica");
					System.out.print("Selecione a musica: ");
					sc.nextLine();
					musica = sc.nextLine();
					iphone.selecionarMusica(musica);
					System.out.print("Tocar musica? (T/P) ");
					opcoes = sc.next().charAt(0);
					if(opcoes == 'T') {
						iphone.tocar();
						System.out.print("Parar tocar? (P) ");
						opcoes = sc.next().charAt(0);
					}
					else if(opcoes == 'P') {
						iphone.pausar();
					}
					System.out.println();
					break;
				}
				case '2':{
					System.out.println("Telefone");
					System.out.print("Digite o numero para ligar: ");
					sc.nextLine();
					numero = sc.nextLine();
					iphone.ligar(numero);
					System.out.println();
					System.out.print("Iphone tocando! Atender ligação? (S/N) ");
					opcoes = sc.next().charAt(0);
					if(opcoes == 'S') {
						iphone.atender();
					}
					System.out.println();
					System.out.println("Correio de voz!!");
					iphone.iniciarCorreioVoz();
					System.out.print("Confirme (C): ");
					opcoes = sc.next().charAt(0);
					System.out.println();
					break;
				}
				case '3':{
					System.out.println("Internet");
					System.out.print("Digite o nome do site para exibir: ");
					sc.nextLine();
					paginaInternet = sc.nextLine();
					iphone.atualizarPagina();
					iphone.exibirPagina(paginaInternet);	
					System.out.print("Adicionar nova aba? (S/N) ");
					opcoes = sc.next().charAt(0);
					if(opcoes == 'S') {
						iphone.adicionarNovaAba();
					}
					System.out.println();
					break;
				}
				case '0':{
					System.out.println("Iphone bloqueado!");
					break;
				}
				default:
					System.out.println("Opção invalida");
				}
			}
			else if(opcao == '0') {
				bloqueado = false;
				System.out.println("Iphone desbloqueado");
			}
			else {
				System.out.println("Iphone desbloqueado!");
			}
			
		}while(opcao != '0' || bloqueado);
		
		sc.close();
	}

}
