package researchWorks;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.List;
//
//import enums.FormatResearch;
//import models.User;
//
//public class ResearchPaper extends ResearchProject {
//    private String title;
//    private String journal;
//    private LocalDate publishedDate;
//    private int pages;
//    private String doi;
//    private List<User> subscribers = new ArrayList<>();
//    private List<String> authors = new ArrayList<>();
//    private List<String> citations = new ArrayList<>();
//
//    public ResearchPaper(String title, String journal, LocalDate publishedDate, int pages) {
//        this.title = title;
//        this.journal = journal;
//        this.publishedDate = publishedDate;
//        this.pages = pages;
//    }
//
//    public void addCitation(String citation) {
//        citations.add(citation);
//    }
//  
//    public int getCitationCount() {
//        return citations.size();
//    }
//
//    public void notifySubscribers() {
//        for (User subscriber : subscribers) {
//            subscriber.notifySubscription(this);
//        }
//    }
//
//    public String getCitation(FormatResearch f) {
//        String formattedAuthors = String.join(", ", authors);
//        String formattedDate = publishedDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//
//        switch (f) {
//            case PLAIN_TEXT:
//                return String.format("%s. \"%s.\" %s, %s, %d pages, DOI: %s.",
//                        formattedAuthors, title, journal, formattedDate, pages, doi != null ? doi : "N/A");
//            case BIBTEX:
//                return String.format("@article{%s,\n  author = {%s},\n  title = {%s},\n  journal = {%s},\n  year = {%s},\n  pages = {%d},\n  doi = {%s}\n}",
//                        doi != null ? doi : title.replaceAll("\\s+", "_"), formattedAuthors, title, journal, formattedDate.substring(0, 4), pages, doi != null ? doi : "N/A");
//            default:
//                throw new IllegalArgumentException("Unsupported format: " + f);
//        }
//    }
//
//	public String getTitle() {
//		return title;
//	}
//
//	public Object getJournal() {
//		return journal;
//	}
//}
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import enums.FormatResearch;
// ResearchPaper.java
public class ResearchPaper {
    private String title;
    private String journal;
    private Date publicationDate;
    private List<String> authors;
    private int citations;
    private String doi;
    private String pages;

    public ResearchPaper() {
    }

    public ResearchPaper(String title, String journal, Date publicationDate, List<String> authors, int citations, String doi, String pages) {
        this.title = title;
        this.journal = journal;
        this.publicationDate = publicationDate;
        this.authors = authors;
        this.citations = citations;
        this.doi = doi;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getCitation(FormatResearch f) {
      if (f == FormatResearch.PLAIN_TEXT) {
        return String.format("%s, %s, %s, %s, %s, %s", this.title, this.authors, this.journal, this.pages, this.publicationDate, this.doi);
      } else if (f == FormatResearch.BIBTEX) {
        return "@article{" + this.doi + ",\n" +
            "author = {" + this.authors + "},\n" +
            "title = {" + this.title + "},\n" +
            "journal = {" + this.journal + "},\n" +
            "pages = {" + this.pages + "},\n" +
            "date = {" + this.publicationDate + "},\n" +
            "doi = {" + this.doi + "}\n" +
            "}";
      }
      return null;
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ResearchPaper that = (ResearchPaper) o;
    return citations == that.citations && Objects.equals(title, that.title) && Objects.equals(journal, that.journal) && Objects.equals(publicationDate, that.publicationDate) && Objects.equals(authors, that.authors) && Objects.equals(doi, that.doi) && Objects.equals(pages, that.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, journal, publicationDate, authors, citations, doi, pages);
  }

  @Override
  public String toString() {
    return "ResearchPaper{" +
        "title='" + title + '\'' +
        ", journal='" + journal + '\'' +
        ", publicationDate=" + publicationDate +
        ", authors=" + authors +
        ", citations=" + citations +
        ", doi='" + doi + '\'' +
        ", pages='" + pages + '\'' +
        '}';
  }
}
