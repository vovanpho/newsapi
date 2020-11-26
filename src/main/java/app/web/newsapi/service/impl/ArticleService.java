package app.web.newsapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.web.newsapi.dto.ArticleDto;
import app.web.newsapi.mapperModelDto.ArticleMapper;
import app.web.newsapi.repository.ArticleRepository;
import app.web.newsapi.service.IService;

@Service
public class ArticleService implements IService {
	
	@Autowired private ArticleRepository articleRepository;
	
	@Autowired private SourceService sourceService;
	
	@Autowired private ArticleMapper articleMapper;
	@Override
	public ArticleDto save(ArticleDto articleDto) {
		// TODO Auto-generated method stub
		sourceService.save(articleDto.getSources());
		articleRepository.save(articleMapper.toArticle(articleDto));
		return articleDto;
	}

}
