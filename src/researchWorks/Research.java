package researchWorks;

import java.util.Comparator;
import java.util.List;
// Research.java
public interface Research {
  List<ResearchPaper> getResearchPapers();
  List<ResearchProject> getResearchProjects();
  void printPapers(Comparator<ResearchPaper> comparator);
  int calculateHIndex();

}
