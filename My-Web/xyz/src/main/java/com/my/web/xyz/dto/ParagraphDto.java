package com.my.web.xyz.dto;


import java.util.Arrays;

import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonProperty;



public class ParagraphDto {

	@JsonProperty("chapterId")
	private int chapterId;

	@JsonProperty("text")
	private int	text;
	
	@Lob
    @JsonProperty("image")
    private byte[] image;

	public ParagraphDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParagraphDto(int chapterId, int text, byte[] image) {
		super();
		this.chapterId = chapterId;
		this.text = text;
		this.image = image;
	}

	public int getChapterId() {
		return chapterId;
	}

	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}

	public int getText() {
		return text;
	}

	public void setText(int text) {
		this.text = text;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ParagraphDto [chapterId=" + chapterId + ", text=" + text + ", image=" + Arrays.toString(image) + "]";
	}

}
