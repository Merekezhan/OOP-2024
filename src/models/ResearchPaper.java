package models;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import enums.Format;
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

    public String getCitation(Format f) {
      if (f == Format.PLAIN_TEXT) {
        return String.format("%s, %s, %s, %s, %s, %s", this.title, this.authors, this.journal, this.pages, this.publicationDate, this.doi);
      } else if (f == Format.BIBTEX) {
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
