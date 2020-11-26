package app.web.newsapi.dto;

public abstract class BaseDto {
	private Long id;

	public Long getId() {
		return id;
	}
	public Long setId(Long id) {
		return this.id=id;
	}
}
