package pl.tim3erland.springhateos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.tim3erland.springhateos.dao.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity,String> {
}
