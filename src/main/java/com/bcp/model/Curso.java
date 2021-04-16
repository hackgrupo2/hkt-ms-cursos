package com.bcp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cursos", schema = "equipo2")
//@Table(name = "equipo2.cursos")
public class Curso{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "pk_course_id")
	private int pk_courseId;
	@Column(name = "user_id")
	private int userId;	
	@Column(name = "channel_id")
	private int channelId;
	@Column(name = "is_free")	
	private int isFree;
	@Column(name = "title")
	private String title;
	@Column(name = "long_description")
	private String longDescription;
	@Column(name = "short_description")
	private String shortDescription;
	@Column(name = "category_id")
	private int categoryId;
	@Column(name = "url_video")
	private String urlVideo;
	@Column(name = "tags")
	private String tags;
	@Column(name = "categoria")
	private String categoria;
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public int getIsFree() {
		return isFree;
	}

	public void setIsFree(int isFree) {
		this.isFree = isFree;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public int getPk_courseId() {
		return pk_courseId;
	}

	public void setPk_courseId(int pk_courseId) {
		this.pk_courseId = pk_courseId;
	}




	public Curso(int pk_courseId, int userId, int channelId, int isFree, String title, String longDescription,
			String shortDescription, int categoryId, String urlVideo, String categoria, String tags) {
		super();
		this.pk_courseId = pk_courseId;
		this.userId = userId;
		this.channelId = channelId;
		this.isFree = isFree;
		this.title = title;
		this.longDescription = longDescription;
		this.shortDescription = shortDescription;
		this.categoryId = categoryId;
		this.urlVideo = urlVideo;
		this.categoria = categoria;
		this.tags = tags;
	}

	public Curso() {
		super();
	}

	public Curso(int userId, int channelId, int isFree, String title, String longDescription, String shortDescription,
			int categoryId, String urlVideo, String tags, String categoria) {
		super();
		this.userId = userId;
		this.channelId = channelId;
		this.isFree = isFree;
		this.title = title;
		this.longDescription = longDescription;
		this.shortDescription = shortDescription;
		this.categoryId = categoryId;
		this.urlVideo = urlVideo;
		this.tags = tags;
		this.categoria = categoria;
	}


	

	
	
}
