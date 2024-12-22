package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
// ResearchJournal.java
public class ResearchJournal {
  private String name;
  private List<ResearchPaper> papers;
  private List<User> subscribers;

  public ResearchJournal() {
    this.papers = new ArrayList<>();
    this.subscribers = new ArrayList<>();
  }

  public ResearchJournal(String name) {
    this.name = name;
    this.papers = new ArrayList<>();
    this.subscribers = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ResearchPaper> getPapers() {
    return papers;
  }

  public void setPapers(List<ResearchPaper> papers) {
    this.papers = papers;
  }

  public List<User> getSubscribers() {
    return subscribers;
  }

  public void setSubscribers(List<User> subscribers) {
    this.subscribers = subscribers;
  }

  public void addPaper(ResearchPaper paper) {
    this.papers.add(paper);
    notifySubscribers(paper);
  }

  public void subscribe(User user) {
    this.subscribers.add(user);
  }

  public void unsubscribe(User user) {
    this.subscribers.remove(user);
  }
  private void notifySubscribers(ResearchPaper paper){
    for (User user: this.subscribers){
      System.out.println("New paper " + paper.getTitle() + " has been published for user" + user.getName());
    }
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResearchJournal that = (ResearchJournal) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "ResearchJournal{" +
        "name='" + name + '\'' +
        ", papers=" + papers +
        ", subscribers=" + subscribers +
        '}';
  }
}