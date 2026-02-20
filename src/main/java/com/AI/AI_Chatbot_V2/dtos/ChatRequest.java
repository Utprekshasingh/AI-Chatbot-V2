package com.AI.AI_Chatbot_V2.dtos;

import lombok.Data;

@Data //@Data includes @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
public class ChatRequest {

	private String message;
}
