package com.cos.blogapp_JJY.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.blogapp_JJY.domain.user.User;
import com.cos.blogapp_JJY.domain.user.UserRepository;
import com.cos.blogapp_JJY.web.dto.JoinReqDto;
import com.cos.blogapp_JJY.web.dto.LoingReqDto;


@Controller
public class UserController {

		private UserRepository userRepository;
		private HttpSession httpSession;
		
		public UserController(UserRepository userRepository, HttpSession httpSession) {
			this.userRepository = userRepository;
			this.httpSession = httpSession;
		}
		
		@GetMapping("/login")
		public String login() {
			return "user/loginForm";
		}
		//로그인 아이디어 비번 받기
	
		
		
		@GetMapping("/join")
		public String join() {
			return "user/joinform";
		}
		
		@PostMapping("/join")
		public String join(JoinReqDto dto) {
			User user = new User();
			user.setNusername(dto.getUsername());
			user.setPassword(dto.getPassword());
			user.setEmail(dto.getEmail());
			
			userRepository.save(user);
			
			return "redirect:/loginForm";
		}
		
		
		@GetMapping("/home")
		public String home() {
		return "home"; }
		
		
		
		
		
}
