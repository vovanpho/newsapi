package app.web.newsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.web.newsapi.model.Source;

@Repository
public interface SourceRepository extends JpaRepository<Source, Long> {

}
