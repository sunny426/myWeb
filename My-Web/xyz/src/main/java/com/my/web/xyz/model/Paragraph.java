package com.my.web.xyz.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="PARAGRAPH")
public class Paragraph {
	
	@Id
	@GeneratedValue
	@Column(name = "PARAGRAPH_ID")
	private int paragraphId;
	
	@NotNull
	@Column(name = "CHAPTER_ID")
	private int chapterId;
	
	@NotNull
	@Lob
	@Column(name = "TEXT")
	private String	text;
	
	@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] image;

}