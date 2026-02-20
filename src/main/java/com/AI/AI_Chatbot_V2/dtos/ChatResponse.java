package com.AI.AI_Chatbot_V2.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //This generates manual constructor 
//It is used here because we are creating in controller "new ChatResponse(reply)"
public class ChatResponse {

	private String reply;
}
