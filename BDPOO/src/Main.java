	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class Main {

		public static void main(String[] args) {
			Dao<Comentario> dao = new Dao<Comentario>();
			Comentario p = new Comentario();
			p.setId(22l);
			p.setNome("HugoFF");
			dao.save(p);
			Comentario p2 = new Comentario();
			p2.setId(23l);
			p2.setNome("Hugo");
			dao.save(p2);
			Comentario find = dao.find(Comentario.class, 22l);
			System.out.println(find.getNome());
		}
		
	}

