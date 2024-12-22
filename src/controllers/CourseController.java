//package controllers;
//
//import models.Course;
//import Database.Database;
//import models.Student;
//import models.Teacher;
//
//public class CourseController {
//    private static final Database db = Database.getInstance();
//    public static void registerStudentForCourse(Student student, Course course){
//        student.registerForCourse(course);
//    }
//    public static void assignTeacherForCourse(Teacher teacher, Course course){
//        course.setInstructor(teacher);
//    }
//
//}
package controllers;

import models.Course;
import Database.Database;
import models.Student;
import models.Teacher;
import java.util.List;

public class CourseController {
    private static final Database db = Database.getInstance();
    public static void registerStudentForCourse(Student student, Course course){
        student.registerForCourse(course);
    }
    public static void assignTeacherForCourse(Teacher teacher, Course course){
        course.setInstructor(teacher);
    }
    public static Course getCourseByName(String name){
        return db.getCourse(name);
    }
  public static List<Course> getAllCourses(){
        return db.getAllCourses();
    }
  public static void addCourse(Course course){
        db.addCourse(course);
    }
}