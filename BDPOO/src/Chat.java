import java.util.Date;

public interface Chat {
	public Comentario criarComentario(Integer id,Date data,int horario) throws IdInvalidoException;
	public Opiniao criarOpiniões(Integer id,String texto,String assunto,Date data,int horario) throws IdInvalidoException ;
	public Pessoa criarPessoas(Integer id,Integer numero )throws numeroInvalidoException;
	public Grupo criarGrupo ( Integer id,String nome,String opiniões)throws NomeInvalidoException;
	public Tema CriarTema (Integer id) throws IdInvalidoException;
}
