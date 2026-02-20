package com.AI.AI_Chatbot_V2.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
//This is used for constructor injection in service and controller as @autowired annotation not used
@RequiredArgsConstructor
public class AIService {

	//ChatClient comes from Spring AI a ready-made helper to communicate with AI provider like "OpenAI"
	private final ChatClient chatClient;
	
	public String getReply(String message) {
		//chatClient.prompt(message) → send question
		//.call()                    → call AI
		//.content()                 → get text reply
		return chatClient.prompt(message).call().content();
	}

}
