package com.techstar.modules.mail;

import org.springframework.beans.factory.annotation.Autowired;

import com.techstar.modules.mail.service.DefaultMailService;

public class MailTest {
	@Autowired
	private DefaultMailService defaultMailService;
	@org.junit.Test
	public void Test(){
		
		defaultMailService.send("wcthaoyun@126.com", "418688670@qq.com", "aa", "dd");
	}
}
