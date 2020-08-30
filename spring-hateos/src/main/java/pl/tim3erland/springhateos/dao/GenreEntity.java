package pl.tim3erland.springhateos.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "genre", schema = "public", catalog = "postgres")
public class GenreEntity {
    private String genreid;
    private String genretype;

    @Id
    @Column(name = "genreid")
    public String getGenreid() {
        return genreid;
    }

    public void setGenreid(String genreid) {
        this.genreid = genreid;
    }

    @Basic
    @Column(name = "genretype")
    public String getGenretype() {
        return genretype;
    }

    public void setGenretype(String genretype) {
        this.genretype = genretype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreEntity that = (GenreEntity) o;
        return Objects.equals(genreid, that.genreid) &&
                Objects.equals(genretype, that.genretype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreid, genretype);
    }
}
