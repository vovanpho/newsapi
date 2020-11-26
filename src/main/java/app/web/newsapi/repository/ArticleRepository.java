package app.web.newsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.web.newsapi.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
