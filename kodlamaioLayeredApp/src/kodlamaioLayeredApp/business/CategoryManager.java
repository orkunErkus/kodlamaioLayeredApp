package kodlamaioLayeredApp.business;

import kodlamaioLayeredApp.coreLogging.Logger;
import kodlamaioLayeredApp.dataAccess.CategoryDao;
import kodlamaioLayeredApp.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		if (category.getName().equals(category)) {
			throw new Exception("Kategori ismi tekrar edemez");
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
