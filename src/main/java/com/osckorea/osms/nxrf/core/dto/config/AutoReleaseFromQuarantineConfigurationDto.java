package com.osckorea.osms.nxrf.core.dto.config;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class AutoReleaseFromQuarantineConfigurationDto {
    private String id;
    private String name;
    private Boolean autoReleaseQuarantineEnabled;
    
    @Builder
    public AutoReleaseFromQuarantineConfigurationDto(
        final String id, 
        final Boolean autoReleaseQuarantineEnabled
    ) {
        this.id = id;
        this.autoReleaseQuarantineEnabled = autoReleaseQuarantineEnabled;
    }
}
