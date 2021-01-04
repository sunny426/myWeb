package com.my.web.xyz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ControlTestDto {
	
	@JsonProperty("chapterId")
	private int chapterId;
	
	@JsonProperty("question")
	private String question;

	@JsonProperty("answer")
	private String answer;

	public ControlTestDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ControlTestDto(int chapterId, String question, String answer) {
		super();
		this.chapterId = chapterId;
		this.question = question;
		this.answer = answer;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "ControlTestDto [chapterId=" + chapterId + ", question=" + question + ", answer=" + answer + "]";
	}

}
