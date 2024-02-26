package com.osckorea.osms.nxrf.core.model.component;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_ABSENT)
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ReleaseFromQuarantineComponent<T> {
    private String packageUrl;
    private String hash;
    private T componentIdentifier;
    private Timestamp quarantineTime;
    private Timestamp quarantineReleaseTime;
}
