package pl.tim3erland.springhateos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DirectorDto extends RepresentationModel<DirectorDto> {
    private String directorid;
    private String directorname;
    private String directorynationality;

}
