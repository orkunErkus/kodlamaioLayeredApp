package kodlamaioLayeredApp.business;

import kodlamaioLayeredApp.coreLogging.Logger;
import kodlamaioLayeredApp.dataAccess.CourseDao;
import kodlamaioLayeredApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getName().equals(course)) {
			throw new Exception("Kurs ismi tekrar edemez");
		}
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
