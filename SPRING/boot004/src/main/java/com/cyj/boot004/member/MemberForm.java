package com.cyj.boot004.member;

import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;

@Getter
@Setter
public class MemberForm {	//memberForm
	@NotEmpty(message="ID is Required Content")
	@Size(min=4, max=20)
	private String username;

	@NotEmpty(message="Password is Required Content")
	private String password;
	
	@NotEmpty(message="Password check is Required Content")
	private String password2;

	@NotEmpty(message="Email is Required Content")
	private String email;
}

//https://beanvalidation.org/