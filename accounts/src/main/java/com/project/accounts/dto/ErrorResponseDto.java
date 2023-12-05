package com.project.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            name = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            name = "Error code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            name = "Error message representing the error happened"
    )
    private String errorMessage;

    @Schema(
            name = "Time representing when the error happened"
    )
    private LocalDateTime errorTime;

}
