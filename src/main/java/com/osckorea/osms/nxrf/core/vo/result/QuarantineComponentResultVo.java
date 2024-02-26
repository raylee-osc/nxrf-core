package com.osckorea.osms.nxrf.core.vo.result;

import java.sql.Timestamp;
import java.util.List;
import com.osckorea.osms.nxrf.core.model.violation.QuarantinePolicyViolation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class QuarantineComponentResultVo<T> {
    private String displayName;
    private String repository;
    private Timestamp quarantineDate;
    private Timestamp dateCleared;
    private List<QuarantinePolicyViolation> quarantinePolicyViolations;
    private T componentIdentifier;
    private String pathname;
    private String hash;
    private String matchState;
    private String repositoryId;
    private Boolean quarantined;
}
