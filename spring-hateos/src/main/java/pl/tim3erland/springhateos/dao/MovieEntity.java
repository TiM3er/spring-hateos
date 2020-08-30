package pl.tim3erland.springhateos.dao;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "movie", schema = "public", catalog = "postgres")
public class MovieEntity {
    private String movieid;
    private String movietitle;
    private Date releasedate;
    private String genereid;
    private String directorid;

    @Id
    @Column(name = "movieid")
    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    @Basic
    @Column(name = "movietitle")
    public String getMovietitle() {
        return movietitle;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    @Basic
    @Column(name = "releasedate")
    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    @Basic
    @Column(name = "genereid")
    public String getGenereid() {
        return genereid;
    }

    public void setGenereid(String genereid) {
        this.genereid = genereid;
    }

    @Basic
    @Column(name = "directorid")
    public String getDirectorid() {
        return directorid;
    }

    public void setDirectorid(String directorid) {
        this.directorid = directorid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieEntity that = (MovieEntity) o;
        return Objects.equals(movieid, that.movieid) &&
                Objects.equals(movietitle, that.movietitle) &&
                Objects.equals(releasedate, that.releasedate) &&
                Objects.equals(genereid, that.genereid) &&
                Objects.equals(directorid, that.directorid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieid, movietitle, releasedate, genereid, directorid);
    }
}
