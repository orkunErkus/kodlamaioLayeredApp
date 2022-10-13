package kodlamaioLayeredApp;

import kodlamaioLayeredApp.business.CourseManager;
import kodlamaioLayeredApp.coreLogging.DatabasaLogger;
import kodlamaioLayeredApp.coreLogging.FileLogger;
import kodlamaioLayeredApp.coreLogging.Logger;
import kodlamaioLayeredApp.coreLogging.MailLogger;
import kodlamaioLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioLayeredApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course = new Course(1, "java", 1);
		Logger[] loggers = { new FileLogger(), new DatabasaLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
	}

}
