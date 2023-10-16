package com.telusko.app.dao;

import com.telusko.app.dao.Question;

public class Quiz 
{
	private Integer id;
	private String title;

	Question questions[] = new Question[5];

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(Integer id, String title, Question[] questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}

	public Quiz(String title) {
		super();
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Question[] getQuestions() {
		return questions;
	}

	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}

}
