package com.nisum.jeffreycortes.userManagement.aplication.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Getter
@Setter
public class UserCreatedResponse {
    String id;
    @JsonProperty("created")
    Instant createdDate;
    @JsonProperty("modified")
    Instant modifiedDate;
    @JsonProperty("last_login")
    Instant lastLogin;
    String token;
    @JsonProperty("isactive")
    Boolean isActive;

}
