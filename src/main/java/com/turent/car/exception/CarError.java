package com.turent.car.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarError {
    @JsonInclude(Include.NON_NULL)
    @JsonProperty("status")
    private HttpStatus status;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("code")
    private String errorCode;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("message")
    private String message;

    @JsonProperty("detail")
    private String detail;

    @JsonProperty("timestamp")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "dd-MM-yyyy hh:mm:ss"
    )
    private LocalDateTime localDateTime;

    @JsonProperty("uri")
    private String uriRequested;



}
