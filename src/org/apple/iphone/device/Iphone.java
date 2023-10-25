package org.apple.iphone.device;

public class Iphone implements ReprodutorMusical, 
	AparelhoTelefone, NavegadorInternet {
	public void tocar() {
		System.out.println("Reproduzindo Música");
	}
	
	public void pausar() {
		System.out.println("Pausando música");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecione a música a ser reproduzida");
	}

	public void exibirPagina() {
		System.out.println("Exibindo página da internet");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando Página");
		
	}

	public void ligar() {
		System.out.println("Fazendo ligação");
	}

	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz");
	}
}
