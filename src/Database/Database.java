package Database;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.*;

// Database.java
public class Database {
    private Map<String, User> users;
    private List<Course> courses;
    private List<ResearchPaper> researchPapers;
    private List<ResearchProject> researchProjects;
    private List<News> news;
  private List<ResearchJournal> researchJournals;
    private List<Student> scholarship;

    private static Database instance;

    private Database() {
        this.users = new HashMap<>();
        this.courses = new ArrayList<>();
        this.researchPapers = new ArrayList<>();
        this.researchProjects = new ArrayList<>();
        this.news = new ArrayList<>();
        this.researchJournals = new ArrayList<>();
        this.scholarship = new ArrayList<>();
    }

  public static Database getInstance(){
    if(instance == null){
      instance = new Database();
    }
    return instance;
  }
    // User Management
    public void addUser(User user) {
        this.users.put(user.getName(),user);
    }

    public User getUser(String username) {
        return this.users.get(username);
    }

    public void removeUser(String username) {
        this.users.remove(username);
    }

    public List<User> getAllUsers(){
      return new ArrayList<>(this.users.values());
    }
  public List<Student> getAllStudents(){
    List<Student> students = new ArrayList<>();
    for(User user: this.users.values()){
      if(user instanceof Student){
        students.add((Student) user);
      }
    }
    return students;
  }
  public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        for(User user: this.users.values()){
            if(user instanceof Employee){
              employees.add((Employee) user);
            }
        }
        return employees;
    }

    // Course Management
    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public Course getCourse(String courseName) {
        for(Course course:courses){
          if(course.getCourseName().equals(courseName)){
            return course;
          }
        }
        return null;
    }
    public void removeCourse(String courseName){
      for (int i = 0; i < this.courses.size(); i++) {
        if (this.courses.get(i).getCourseName().equals(courseName)){
            this.courses.remove(i);
        }
      }
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(this.courses);
    }

    // ResearchPaper Management
    public void addResearchPaper(ResearchPaper researchPaper) {
        this.researchPapers.add(researchPaper);
    }

    public ResearchPaper getResearchPaper(String title) {
        for (ResearchPaper researchPaper : this.researchPapers) {
            if(researchPaper.getTitle().equals(title)){
              return researchPaper;
            }
        }
        return null;
    }

    public void removeResearchPaper(String title) {
      for (int i = 0; i < this.researchPapers.size(); i++) {
        if (this.researchPapers.get(i).getTitle().equals(title)){
          this.researchPapers.remove(i);
        }
      }
    }

  public List<ResearchPaper> getAllResearchPapers() {
    return new ArrayList<>(this.researchPapers);
  }
    // ResearchProject Management
    public void addResearchProject(ResearchProject researchProject) {
        this.researchProjects.add(researchProject);
    }

    public ResearchProject getResearchProject(String topic) {
        for (ResearchProject researchProject : this.researchProjects) {
            if(researchProject.getTopic().equals(topic)){
                return researchProject;
            }
        }
        return null;
    }

    public void removeResearchProject(String topic) {
      for (int i = 0; i < this.researchProjects.size(); i++) {
          if (this.researchProjects.get(i).getTopic().equals(topic)){
            this.researchProjects.remove(i);
          }
      }
    }

  public List<ResearchProject> getAllResearchProjects() {
    return new ArrayList<>(this.researchProjects);
  }

    // News Management
    public void addNews(News newsItem) {
        this.news.add(newsItem);
    }

    public News getNews(String title) {
      for (News newsItem: this.news){
        if (newsItem.getTitle().equals(title)){
          return newsItem;
        }
      }
        return null;
    }
  public void removeNews(String title){
    for (int i = 0; i < this.news.size(); i++) {
      if (this.news.get(i).getTitle().equals(title)){
        this.news.remove(i);
      }
    }
  }

    public List<News> getAllNews() {
        return new ArrayList<>(this.news);
    }

    //Research Journal Management
    public void addResearchJournal(ResearchJournal researchJournal){
        this.researchJournals.add(researchJournal);
    }
    public ResearchJournal getResearchJournal(String name){
        for (ResearchJournal journal: this.researchJournals){
            if (journal.getName().equals(name)){
                return journal;
            }
        }
        return null;
    }
    public void removeResearchJournal(String name){
        for (int i = 0; i < this.researchJournals.size(); i++) {
            if (this.researchJournals.get(i).getName().equals(name)){
                this.researchJournals.remove(i);
            }
        }
    }

    public List<ResearchJournal> getAllResearchJournals(){
      return new ArrayList<>(this.researchJournals);
    }
  // Scholarship Management
  public void setScholarship(List<Student> students){
      this.scholarship = students;
  }
  public List<Student> getScholarship(){
      return this.scholarship;
  }

  public void clearDatabase(){
        this.users.clear();
        this.courses.clear();
        this.researchPapers.clear();
        this.researchProjects.clear();
        this.news.clear();
        this.researchJournals.clear();
      this.scholarship.clear();
  }
}