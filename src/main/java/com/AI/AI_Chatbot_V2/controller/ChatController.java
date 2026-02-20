package com.AI.AI_Chatbot_V2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AI.AI_Chatbot_V2.dtos.ChatRequest;
import com.AI.AI_Chatbot_V2.dtos.ChatResponse;
import com.AI.AI_Chatbot_V2.service.AIService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor //This creates constructor for only final fields and fields marked with @NotNull
//@Data includes @RequiredArgsConstructor but if we don't want full @data then we can separately use it
public class ChatController {

	private final AIService aiService;
	
	@PostMapping
	public ChatResponse chat(@RequestBody ChatRequest chatRequest) {
		String reply = aiService.getReply(chatRequest.getMessage());
		return new ChatResponse(reply);
	}
}
