
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
	}

}
