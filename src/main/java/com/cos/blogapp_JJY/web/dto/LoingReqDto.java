package com.cos.blogapp_JJY.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoingReqDto {
private String username;
private String password;

public static void main(String[] args) {
	LoingReqDto dto = new LoingReqDto();
}
}
