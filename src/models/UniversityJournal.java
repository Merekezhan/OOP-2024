package models;

import java.util.ArrayList;
import java.util.List;
import researchWorks.ResearchPaper;

public class UniversityJournal {
    private String name;
    private String publisher;
    private List<ResearchPaper> papers;

    public UniversityJournal(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
        this.papers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<ResearchPaper> getPapers() {
        return new ArrayList<>(papers);
    }

    public void addPaper(ResearchPaper paper) {
        if (paper != null && !papers.contains(paper)) {
            papers.add(paper);
        }
    }

    public void removePaper(ResearchPaper paper) {
        if (paper != null) {
            papers.remove(paper);
        }
    }

    public ResearchPaper findPaperByTitle(String title) {
        for (ResearchPaper paper : papers) {
            if (paper.getTitle().equalsIgnoreCase(title)) {
                return paper;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Journal: " + name + ", Publisher: " + publisher + ", Papers count: " + papers.size();
    }
}
