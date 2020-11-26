package app.web.newsapi.mapperModelDto;

import org.springframework.stereotype.Component;

import app.web.newsapi.dto.ArticleDto;
import app.web.newsapi.model.Article;

@Component
public class ArticleMapper {
	
	
	
	public Article toArticle(ArticleDto dto) {
		Article article = new Article();
		article.setTitle(dto.getTitle());
		article.setAuthor(dto.getAuthor());
		article.setContent(dto.getContent());
		article.setDescription(dto.getDescription());
		article.setPublishedAt(dto.getPublishedAt());
		article.setUrl(dto.getUrl());
		article.setUrlToImage(dto.getUrlToImage());
		return article;
		
	}
	public ArticleDto toArticleDto(Article entity) {
		ArticleDto articleDto = new ArticleDto();
		articleDto.setTitle(entity.getTitle());
		articleDto.setAuthor(entity.getAuthor());
		articleDto.setContent(entity.getContent());
		articleDto.setDescription(entity.getDescription());
		articleDto.setPublishedAt(entity.getPublishedAt());
		articleDto.setUrl(entity.getUrl());
		articleDto.setUrlToImage(entity.getUrlToImage());
		
		return articleDto;
	}
}
