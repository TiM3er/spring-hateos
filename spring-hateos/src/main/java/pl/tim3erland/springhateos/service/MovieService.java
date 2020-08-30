package pl.tim3erland.springhateos.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tim3erland.springhateos.dto.MoviedDto;
import pl.tim3erland.springhateos.repository.MovieRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<MoviedDto> getMovies() {
        return movieRepository.findAll().stream().map(movieEntity -> {
            return MoviedDto.builder()
                    .directorid(movieEntity.getDirectorid())
                    .genereid(movieEntity.getGenereid())
                    .movieid(movieEntity.getMovieid())
                    .movietitle(movieEntity.getMovietitle())
                    .releasedate(movieEntity.getReleasedate())
                    .build();
        }).collect(Collectors.toList());
    }
}
