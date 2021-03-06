package com.client.github.model;

import java.io.Serializable;
import java.util.Date;

public class Repository implements Serializable{

	private String name;
	private String full_name;
	private String description;
	private String size;
	private String language;
	private String has_issues;
	private Date created_at,updated_at,pushed_at;
	private int watchers_count;
	
	public Repository() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getHas_issues() {
		return has_issues;
	}

	public void setHas_issues(String has_issues) {
		this.has_issues = has_issues;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getPushed_at() {
		return pushed_at;
	}

	public void setPushed_at(Date pushed_at) {
		this.pushed_at = pushed_at;
	}

	public int getWatchers_count() {
		return watchers_count;
	}

	public void setWatchers_count(int watchers_count) {
		this.watchers_count = watchers_count;
	}
	
	
}
