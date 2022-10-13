package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kategori veritabanına eklendi");
		
	}

}
