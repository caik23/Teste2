package br.emprestimo.servico;


import br.emprestimo.modelo.Usuario;

public class ObtenUsuario {
	public static Usuario comDadosValidos(){
		Usuario usuario = new Usuario();
		usuario.setNome("joao do caminh�o");
		usuario.setRa("454446");
		return usuario;
	}
}
