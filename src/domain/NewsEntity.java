package domain;

import java.util.Date;

public class NewsEntity {
	private int newsId;
	private String newsTheme;
	private String newsContent;
	private Date newsDate;
	public int getNewsId() {
		return newsId;
	}
	public String getNewsTheme() {
		return newsTheme;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public Date getNewsDate() {
		return newsDate;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public void setNewsTheme(String newsTheme) {
		this.newsTheme = newsTheme;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}
}
