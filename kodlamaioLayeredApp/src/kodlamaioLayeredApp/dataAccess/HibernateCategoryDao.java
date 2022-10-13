package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori veritabanına eklendi");
		
	}

}
