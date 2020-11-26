package app.web.newsapi.dto;

import java.util.Date;

import app.web.newsapi.model.Source;

public class ArticleDto extends BaseDto{
	
	private String title;
	
	private String description;
	
	private String urlToImage;
	
	private Date publishedAt; 
	
	private String content;
	
	private String author;
	
	private String url;
	
	private Source Source;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Source getSources() {
		return Source;
	}

	public void setSources(Source Source) {
		this.Source = Source;
	}

	
}
