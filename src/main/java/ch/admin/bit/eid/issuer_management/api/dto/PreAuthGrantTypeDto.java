package ch.admin.bit.eid.issuer_management.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
@Schema(name = "PreAuthGrantType")
public class PreAuthGrantTypeDto {

    @JsonProperty("pre-authorized_code_expires_in")
    private int preAuthorizedCodeExpiresIn;

    @JsonProperty("pre-authorized_code")
    private UUID preAuthorizedCode;

    @JsonProperty("pre-authorized_code")
    private String userPin;
}
