import java.util.Date;

public interface Chat {
	public Comentario criarComentario(Integer id,Date data,int horario);
	public Opiniao criarOpiniões(Integer id,String texto,String assunto,Date data,int horario);
	public Pessoa criarPessoas(Integer id,Integer numero );
	public Grupo criarGrupo ( Integer id,String nome,String opiniões);
	public Tema CriarTema (Integer id);
}
