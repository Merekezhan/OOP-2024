package research;

import java.util.Comparator;
import java.util.List;

import models.ResearchPaper;
import models.ResearchProject;
// Research.java
public interface Research {
  List<ResearchPaper> getResearchPapers();
  List<ResearchProject> getResearchProjects();
  void printPapers(Comparator<ResearchPaper> comparator);
  int calculateHIndex();
}