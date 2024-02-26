package com.osckorea.osms.nxrf.core.model.violation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class WaivedPolicyViolation {
    private String policyId;
    private String policyName;
    private String policyViolationId;
    private Integer threatLevel;
    private ConstraintViolation constraintViolation;
}
