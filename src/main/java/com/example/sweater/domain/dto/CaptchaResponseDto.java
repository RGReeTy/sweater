package com.example.sweater.domain.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

/**
 * The type Captcha response dto.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaptchaResponseDto {

    private boolean SUCCESS;
    @JsonAlias("error-codes")
    private Set<String> errorCode;

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSUCCESS() {
        return SUCCESS;
    }

    /**
     * Sets success.
     *
     * @param SUCCESS the success
     */
    public void setSUCCESS(boolean SUCCESS) {
        this.SUCCESS = SUCCESS;
    }

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public Set<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(Set<String> errorCode) {
        this.errorCode = errorCode;
    }
}
