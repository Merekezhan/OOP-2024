package models;
import java.util.Objects;
//Mark.java
public class Mark {
    private int markId;
    private double firstAttestation;
    private double secondAttestation;
    private double finalMark;

  public Mark() {
  }

  public Mark(int markId, double firstAttestation, double secondAttestation, double finalMark) {
        this.markId = markId;
    this.firstAttestation = firstAttestation;
    this.secondAttestation = secondAttestation;
    this.finalMark = finalMark;
  }

  public int getMarkId() {
    return markId;
  }

  public void setMarkId(int markId) {
    this.markId = markId;
  }

  public double getFirstAttestation() {
    return firstAttestation;
  }

  public void setFirstAttestation(double firstAttestation) {
    this.firstAttestation = firstAttestation;
  }

  public double getSecondAttestation() {
    return secondAttestation;
  }

  public void setSecondAttestation(double secondAttestation) {
    this.secondAttestation = secondAttestation;
  }

  public double getFinalMark() {
    return finalMark;
  }

  public void setFinalMark(double finalMark) {
    this.finalMark = finalMark;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Mark mark = (Mark) o;
    return markId == mark.markId && Double.compare(mark.firstAttestation, firstAttestation) == 0 && Double.compare(mark.secondAttestation, secondAttestation) == 0 && Double.compare(mark.finalMark, finalMark) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(markId, firstAttestation, secondAttestation, finalMark);
  }

  @Override
  public String toString() {
    return "Mark{" +
        "markId=" + markId +
        ", firstAttestation=" + firstAttestation +
        ", secondAttestation=" + secondAttestation +
        ", finalMark=" + finalMark +
        '}';
  }
}