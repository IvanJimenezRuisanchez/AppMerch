package com.ecommerceapp.dto;

import lombok.Data;

@Data
public class EmailDto {
    public EmailDto(String recipient, String msgBody, String subject, String attachment) {
        this.recipient = recipient;
        this.msgBody = msgBody;
        this.subject = subject;
        this.attachment = attachment;
    }

    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}
