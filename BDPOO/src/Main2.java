
public class Main2 {

	public static void main(String[] args) {
		Dao<Comentario> dao = new Dao<Comentario>();
		Comentario p = new Comentario();
		p.setId(22l);
		p.setComentario ("digite seu comentario");
		dao.save(p);
		Comentario p2 = new Comentario();
		p2.setId(23l);
		p2.setComentario("digite seu comentario");
		dao.save(p2);
		Comentario find = dao.find(Comentario.class, 22l);
		System.out.println(find.getComentario());
		
		Dao<Grupo> daoK = new Dao<Grupo>();
		Grupo g = new Grupo();
		g.setId(22l);
		g.setNome ("");
		daoK.save(g);
		
		Dao<Opiniao> daoJ = new Dao<Opiniao>();
		Opiniao f = new Opiniao();
		f.setId(22l);
		f.setTexto ("");
		daoJ.save(f);
		
		Dao<Pessoa> daoF = new Dao<Pessoa>();
		Pessoa j = new Pessoa();
		j.setId(22l);
		j.setNumero(15);
		daoF.save(j);
		
		Dao<Tema> daoB = new Dao<Tema>();
		Tema v = new Tema();
		v.setId(22l);
		v.setId (12l);
		daoB.save(v);
	}

}
