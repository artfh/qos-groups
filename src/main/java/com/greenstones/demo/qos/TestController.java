package com.greenstones.demo.qos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${NODE_NAME:node-x}")
	String node;

	@RequestMapping("/**")
	public String process() {
		return String.format("request processed by node '%s'\n", node);
	}

}
