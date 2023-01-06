package com.xyz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
ApplicationContext cnt=new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor te=(TextEditor)cnt.getBean("textEditor",TextEditor.class);
		
		te.spellCheck();

	}

}
