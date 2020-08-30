package pl.tim3erland.springhateos.dao;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "director", schema = "public", catalog = "postgres")
public class DirectorEntity {
    private String directorid;
    private String directorname;
    private String directorynationality;

    @Id
    @Column(name = "directorid")
    public String getDirectorid() {
        return directorid;
    }

    public void setDirectorid(String directorid) {
        this.directorid = directorid;
    }

    @Basic
    @Column(name = "directorname")
    public String getDirectorname() {
        return directorname;
    }

    public void setDirectorname(String directorname) {
        this.directorname = directorname;
    }

    @Basic
    @Column(name = "directorynationality")
    public String getDirectorynationality() {
        return directorynationality;
    }

    public void setDirectorynationality(String directorynationality) {
        this.directorynationality = directorynationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectorEntity that = (DirectorEntity) o;
        return Objects.equals(directorid, that.directorid) &&
                Objects.equals(directorname, that.directorname) &&
                Objects.equals(directorynationality, that.directorynationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directorid, directorname, directorynationality);
    }
}
