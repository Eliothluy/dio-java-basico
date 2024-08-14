package iPhone;

import util.AparelhoTelefonico;
import util.NavegadorInternet;
import util.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		int aba = 0;
		System.out.println("Adicionando nova aba:" + aba++);

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para número: "+ numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	}

	@Override
	public void tocar() {
		System.out.println("Telefone tocando");
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica);
	}

}
