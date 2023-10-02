package com.jsyoo.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControlletTest {
		
		@GetMapping("/test/hello")
		public String hello() { 
			return "<h1>hello spring boot</h1>";
		}
}
