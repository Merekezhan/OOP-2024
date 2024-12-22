package models;

import research.Research;
import java.util.List;
import java.util.Comparator;
//AbstractResearcher.java
public abstract class Researcher implements Research{
    private List<ResearchPaper> researchPapers;
    private List<ResearchProject> researchProjects;
    public Researcher(){

    }
    public Researcher(List<ResearchPaper> researchPapers,List<ResearchProject> researchProjects) {
        this.researchPapers = researchPapers;
        this.researchProjects = researchProjects;
    }

    @Override
    public List<ResearchPaper> getResearchPapers() {
        return researchPapers;
    }

    public void setResearchPapers(List<ResearchPaper> researchPapers) {
        this.researchPapers = researchPapers;
    }

    @Override
    public List<ResearchProject> getResearchProjects() {
        return researchProjects;
    }

    public void setResearchProjects(List<ResearchProject> researchProjects) {
        this.researchProjects = researchProjects;
    }

    @Override
    public abstract void printPapers(Comparator<ResearchPaper> comparator) ;

    @Override
    public abstract int calculateHIndex();

}