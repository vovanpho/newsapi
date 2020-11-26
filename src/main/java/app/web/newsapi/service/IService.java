package app.web.newsapi.service;

import app.web.newsapi.dto.ArticleDto;

public interface IService {
	ArticleDto save(ArticleDto articleDto);
}
