package app.web.newsapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity(name="source")
@Table(name="source")
public class Source extends BaseEntity {

	
	private String sname;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@ManyToMany(mappedBy = "article")
	private List<Article> articles = new ArrayList<Article>();

	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	
	

	
}
