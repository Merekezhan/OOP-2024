package models;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//ResearchProject.java
public class ResearchProject {
    private String topic;
    private List<ResearchPaper> publishedPapers;
    private List<Researcher> participants;
    public ResearchProject(){
      this.publishedPapers = new ArrayList<>();
      this.participants = new ArrayList<>();
    }
    public ResearchProject(String topic) {
        this.topic = topic;
      this.publishedPapers = new ArrayList<>();
      this.participants = new ArrayList<>();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }

    public void setPublishedPapers(List<ResearchPaper> publishedPapers) {
        this.publishedPapers = publishedPapers;
    }

    public List<Researcher> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Researcher> participants) {
        this.participants = participants;
    }

    public void addParticipant(Researcher researcher) throws exceptions.ResearchProjectParticipationException {
        if (!(researcher instanceof Researcher)) {
            throw new exceptions.ResearchProjectParticipationException("Only researchers can join the project!");
        }
        participants.add(researcher);
    }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResearchProject that = (ResearchProject) o;
    return Objects.equals(topic, that.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic);
  }

  @Override
  public String toString() {
    return "ResearchProject{" +
        "topic='" + topic + '\'' +
        ", publishedPapers=" + publishedPapers +
        ", participants=" + participants +
        '}';
  }
}
