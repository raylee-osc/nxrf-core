package com.osckorea.osms.nxrf.core.model.violation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class ConstraintViolation {
    private String constraintId;
    private String constraintName;
    private List<Reason> reasons;
    
    @JsonInclude(Include.NON_ABSENT)
    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class Reason {
        private String reason;
        private String reference;   // Optinal Field
    }
}
