package com.keep.going.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
//@Table(name="memnberinfo");
@Table(name="memberinfo")
@Data
public class Member {
	
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="id")
	private String id;
	@Column(name="password")
	private String password;
	@Column(name="name")
	private String name;
	
}
