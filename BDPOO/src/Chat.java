import java.util.Date;

public interface Chat {
	public Comentario criarComentario(Integer id,Date data,int horario);
	public Opini�es criarOpini�es(Integer id,String texto,String assunto,Date data,int horario);
	public Pessoas criarPessoas(Integer id,Integer numero );
	public Grupo criarGrupo ( Integer id,String nome,String opini�es);
	public Tema CriarTema (Integer id);
	
	


}
