package app.web.newsapi.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity(name="article")
@Table(name="article")
public class Article extends BaseEntity {
	

	private String title;
	private String description;
	
	@Column(name="urlToImage")
	private String urlToImage;
	
	@Column(name="publisheAt")
	private Date publishedAt; 
	
	private String content;
	private String author;
	private String url;
	
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })
	    @JoinTable(name = "article_source",
	        joinColumns = @JoinColumn(name = "aid"),
	        inverseJoinColumns = @JoinColumn(name = "sid")
	    )
	private List<Source> Sources = new ArrayList<>();

	
	
	
	public List<Source> getSources() {
		return Sources;
	}
	public void setSources(List<Source> sources) {
		Sources = sources;
	}
	
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

	
	
}
