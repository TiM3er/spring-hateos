package pl.tim3erland.springhateos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoviedDto extends RepresentationModel<MoviedDto> {
    private String movieid;
    private String movietitle;
    private Date releasedate;
    private String genereid;
    private String directorid;

}
