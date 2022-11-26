package com.example.myaccounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@SpringBootApplication
public class MyAccountingApplication {

	public static void main(String[] args) throws ScriptException {
		SpringApplication.run(MyAccountingApplication.class, args);

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String code = "6";
		Object o = engine.eval(code);
		System.out.println(o);
	}

}
