package com.tampro.Domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class News {
	@Id
	@GeneratedValue
	private int id;
	private String header;
	private String summary;
	private String img;
	@Transient
	private MultipartFile file;
	private String content;
	private Date date;
	private int quantityView;
	private String url;
	@OneToOne 
	@JoinColumn(name = "user_id")
	private Users user;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id")
	private Category category;
	
	@OneToMany(mappedBy = "news" ,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Comment> listComment;
	
	private int hotNews;//tin nổi bật
	private int showHidden;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuantityView() {
		return quantityView;
	}
	public void setQuantityView(int quantityView) {
		this.quantityView = quantityView;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int isHotNews() {
		return hotNews;
	}
	public void setHotNews(int hotNews) {
		this.hotNews = hotNews;
	}
	public int isShowHidden() {
		return showHidden;
	}
	public void setShowHidden(int showHidden) {
		this.showHidden = showHidden;
	}
	public List<Comment> getListComment() {
		return listComment;
	}
	public void setListComment(List<Comment> listComment) {
		this.listComment = listComment;
	}
	
	
	
	
}
