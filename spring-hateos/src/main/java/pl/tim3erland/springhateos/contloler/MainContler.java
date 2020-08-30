package pl.tim3erland.springhateos.contloler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.tim3erland.springhateos.dto.DirectorDto;
import pl.tim3erland.springhateos.dto.GenreDto;
import pl.tim3erland.springhateos.dto.MoviedDto;
import pl.tim3erland.springhateos.service.MovieService;
import sun.applet.Main;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class MainContler {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie")
    public ResponseEntity<List<MoviedDto>> getMovies() {
        List<MoviedDto> moviedDtos = movieService.getMovies();
        moviedDtos.stream().forEach(moviedDto -> {
            moviedDto.add(linkTo(methodOn(MainContler.class)
                    .getMovies()).withSelfRel());
            moviedDto.add(linkTo(methodOn(MainContler.class).getDirector(moviedDto.getMovieid())).withRel("movieDirector"));
            moviedDto.add(linkTo(methodOn(MainContler.class).getGenre(moviedDto.getMovieid())).withRel("movieGenre"));
        });
        
        return ResponseEntity.ok(moviedDtos);
    }

    @GetMapping("/director/{id}")
    public ResponseEntity<DirectorDto> getDirector(@PathVariable String id) {
        return null;
    }

    @GetMapping("/genre/{id}")
    public ResponseEntity<GenreDto> getGenre(@PathVariable String id) {
        return null;
    }
}

