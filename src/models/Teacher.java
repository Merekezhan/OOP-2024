
import database.Database;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Vector;
import java.util.List;

public class Teacher extends Employee{
	private static final long serialVersionUID = -1784786685350038867L;
	private Faculty department;
	private TeacherPosition position;
	private Vector<Course> courses;
	private Schedule teacherSchedule;
	private TeacherResearcher researcherAccount;
	private Vector<ResearchPaper> researchPapers;
	private Vector<Integer> rates;
	
	{
		researchPapers = new Vector<ResearchPaper>();
		rates = new Vector<Integer>();
	}
	
	public Teacher(String userID, String login, String password, String firstName, String lastName, double salary, Faculty dep, TeacherPosition pos) {
		super(userID, login, password, firstName, lastName, salary);
		this.department = dep;
		this.position = pos;
	}
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public Faculty getDepartment() {
		return department;
	}
	
	public TeacherPosition getPosition() {
		return position;
	}
	
	public Vector<Course> gerCourses(){
		return courses;
	}
	private void validateCourse(Course course) {
		if (!courses.contains(course)) {
			throw new IllegalArgumentException("This teacher does not teach the specified course.");
		}
	}

	public String viewStudentInfo(Student student) {
		return student.firstName + " " + student.lastName+ "\nuserID: "+student.getUserID()+ "\nGPA: "+ student.calculateGPA();
	}

	public void becomeResearcher(String researchArea) {
		researcherAccount = new TeacherResearcher(this, researchArea);
		System.out.println(this.firstName+" "+ this.lastName + " is now a researcher");
	}

	public void addFirstAttestationMark(Student student, Course course, double points) {
		validateCourse(course);
		Mark mark = student.courseAndMarks.getOrDefault(course, new Mark());
		mark.addToFirstAttestation(points);
		student.courseAndMarks.put(course, mark);
		System.out.println("Added " + points + " points to First Attestation for student " + student.lastName+ " "+ student.firstName+ " in course " + course.getName());
	}
	public void addSecondAttestationMark(Student student, Course course, double points) {
		validateCourse(course);
		Mark mark = student.courseAndMarks.getOrDefault(course, new Mark());
		mark.addToSecondAttestation(points);
		student.courseAndMarks.put(course, mark);
		System.out.println("Added " + points + " points to Second Attestation for student " + student.lastName+ " "+ student.firstName + " in course " + course.getName());
	}

	public void setFinalExamMark(Student student, Course course, double points) {
		validateCourse(course);
		Mark mark = student.courseAndMarks.getOrDefault(course, new Mark());
		mark.setFinalExamMark(points);
		student.courseAndMarks.put(course, mark);
		System.out.println("Set Final Exam Mark " + points + " for student " + student.lastName+ " "+ student.firstName + " in course " + course.getName());
	}

	public void assignCourse(Course course) {
		if (courses.size() >= 5) {
			throw new IllegalStateException("This teacher cannot handle more than 5 courses.");
		}
		courses.add(course);
		System.out.println("Course assigned: " + course.getName());
	}
	public boolean removeCourse(Course course) {
		return courses.remove(course);
	}

	public String createTask() {
		String taskDescription = "Create a new task for students regarding course material.";
		System.out.println("Task created: " + taskDescription);
		return taskDescription;
	}

	public boolean closeAccess() {
		boolean accessClosed = true;
		System.out.println("Access closed: " + accessClosed);
		return accessClosed;
	}
	public void publishResearchPaper(ResearchPaper rp) {
		researchPapers.add(rp);
		System.out.println("Research paper published: " + rp.getTitle());
	}

	public void generateReport(Course course) {
		System.out.println("Generating report for course: " + course.getName());

		//информация о курсе
		System.out.println("Course Information:");
		System.out.println("Code: " + course.getCode());
		System.out.println("Credits: " + course.getCredits());
		System.out.println("Type: " + course.getType());
		System.out.println("Faculty: " + course.getFaculty());
		System.out.println("Maximum Students: " + course.getMaxStudents());
		System.out.println("Price of the course: " + course.getPrice());

		//проверка на пререквизиты
		if (course.getPrereq().isEmpty()) {
			System.out.println("No prerequisites for this course.");
		} else {
			System.out.println("Prerequisites: ");
			for (String prereq : course.getPrereq()) {
				System.out.println(prereq);
			}
		}

		//проверка заполнен ли курс
		if (course.isFull()) {
			System.out.println("The course is full.");
		} else {
			System.out.println("The course has available slots.");
		}

		//cписок студентов на курсе
		System.out.println("Enrolled students (" + course.getStudents().size() + "):");
		for (Student student : course.getStudents()) {
			System.out.println(student.getName());
		}

		//cписок преподавателей
		System.out.println("Instructors (" + course.getInstructors().size() + "):");
		for (Teacher instructor : course.getInstructors()) {
			System.out.println(instructor.getName());
		}
	}

	public List<ResearchPaper> getResearchPapers() {
		researchPapers.sort((p1, p2) -> p1.getTitle().compareToIgnoreCase(p2.getTitle()));
		return researchPapers;
	}

	public void sendComplaints(Employee e, String comment) {
		String complaint = "Complaint about employee: " + e.getName() + ". Comment: " + comment;
		System.out.println("Complaint sent to: " + e.getName() + ". Comment: " + comment);
		Database.accessDB().getComplaints().add(complaint);
	}


	public void scheduleOfficeHours(String time) {
		System.out.println("Office hours scheduled at: " + time);
	}

	public void viewCources() {
		for(Course c : courses) {
			System.out.println(c);
		}
	}
	
	public Schedule getSchedule() {
		return teacherSchedule;
	}
	
	public double getRating() {
		double rate = 0;
		for(double r : rates) rate += r;
		return rate / rates.size();
	}
	
	public Vector<Integer> getRates(){
		return rates;
	}
	
	@Override
	public String getRole() {
		return "Teacher";
	}
	@Override
	public void userMenu(BufferedReader input) {
			while(true) {
				System.out.println("Choose action to do:\n1.View my cources\n2.Get research papers\n3.Generate report\n4.Get schedule");
				try {
					int action = Integer.parseInt(input.readLine());
					if (action == 1) {
						viewCources();
					} else if (action == 2) {
						getResearchPapers();
					}else if (action == 3) {
						generateReport(courses.get(0));
					}else if (action == 4) {
						getSchedule();
					}
				} catch (IOException ioe) {
						System.out.println("Error occured!");
						ioe.printStackTrace();
						}
					}
				}
	}