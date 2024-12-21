package dll;

import java.util.Vector;

import models.Teacher;

public class DBContext {
	
	private static String fullPath = "C:\\Users\\mekaz\\eclipse-workspace\\teamProject\\src\\data\\";
	private static DBContext db = new DBContext();
	
	public static Vector<Teacher> teacher;
	
	{
		this.teacher = getTeachers();
	}
	
	private DBContext() {
		
	}
	
	// ...
	
	public static Vector<Teacher> getTeachers() {
		Object o = ReaderWriter.deserialize(fullPath + "teachers.txt");
		
		if (o instanceof Vector) {
			return (Vector<Teacher>) o;
		}
		return null;
	}
	
	public static boolean saveTeachers() {
		return ReaderWriter.serialize(teacher, fullPath + "teachers.txt");
	}

	public static DBContext getDb() {
		return db;
	}
	
	
}