package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void tocar() {
		System.out.println("Tocando Musica!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica!");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println(musica);
	

	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz!");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Pagina: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina!");
		
	}

}
