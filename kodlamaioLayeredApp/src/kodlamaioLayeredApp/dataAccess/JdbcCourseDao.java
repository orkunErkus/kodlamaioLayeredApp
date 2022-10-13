package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile kurs veritabanına eklendi");
		
	}

}
