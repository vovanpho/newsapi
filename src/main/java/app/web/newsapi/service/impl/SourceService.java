package app.web.newsapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.web.newsapi.model.Source;
import app.web.newsapi.repository.SourceRepository;

@Service
public class SourceService {
	@Autowired private SourceRepository sourceRepository;
	public Source save(Source source) {
		// TODO Auto-generated method stub
		sourceRepository.save(source);
		return source;
	}
}
