import java.util.Date;

public class Implementar implements Chat  {

	@Override
	public Comentario criarComentario(Integer id, Date data, int horario) throws IdInvalidoException {
		Comentario comentario= new Comentario();
		    boolean IdInvalido = false;
			if (IdInvalido) {
				System.out.println("id não deu certo");
			}
			else {
				System.out.println("Deu certo");
		return comentario;
	}
	return null;
	}

	@Override
	public Opiniao criarOpiniões(Integer id, String texto, String assunto, Date data, int horario)
			throws IdInvalidoException {
		Opiniao opiniao = new Opiniao();
			boolean IdInvalido =  false;
			if (IdInvalido) {
				System.out.println("id não deu certo");
			}
			else {
				System.out.println("Deu certo");
		return opiniao;
	}
	return null;
	}

	@Override
	public Pessoa criarPessoas(Integer id, Integer numero) throws numeroInvalidoException {
	  Pessoa pessoa = new Pessoa ();
		boolean IdInvalido =  false;
		if (IdInvalido) {
			System.out.println("id não deu certo");
		}
		else {
			System.out.println("Deu certo");
	return pessoa;
   }
		return null;
	}

	@Override
	public Grupo criarGrupo(Integer id, String nome, String opiniões) throws NomeInvalidoException {
		Grupo grupo = new Grupo ();
		boolean IdInvalido =  false;
		if (IdInvalido) {
			System.out.println("id não deu certo");
		}
		else {
			System.out.println("Deu certo");
	return grupo;
}
		return null;
	}

	@Override
	public Tema CriarTema(Integer id) throws IdInvalidoException {
		Tema tema = new Tema ();
		boolean IdInvalido =  false;
		if (IdInvalido) {
			System.out.println("id não deu certo");
		}
		else {
			System.out.println("Deu certo");
	return tema;
}
		return null;
	}

}
