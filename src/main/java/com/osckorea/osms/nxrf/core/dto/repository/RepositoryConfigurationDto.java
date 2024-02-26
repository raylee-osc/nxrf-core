package com.osckorea.osms.nxrf.core.dto.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RepositoryConfigurationDto {
    private String repositoryId;
    private String publicId;
    private String format;
    private String type;
    private Boolean auditEnabled;
    private Boolean quarantineEnabled;
    private Boolean policyCompliantComponentSelectionEnabled;
    private Boolean namespaceConfusionProtectionEnabled;

    @Builder
    public RepositoryConfigurationDto(
        final String publicId,
        final String format,
        final String type,
        final Boolean auditEnabled,
        final Boolean quarantineEnabled,
        final Boolean policyCompliantComponentSelectionEnabled,
        final Boolean namespaceConfusionProtectionEnabled
    ) {
        this.publicId = publicId;
        this.format = format;
        this.type = type;
        this.auditEnabled = auditEnabled;
        this.quarantineEnabled = quarantineEnabled;
        this.policyCompliantComponentSelectionEnabled = policyCompliantComponentSelectionEnabled;
        this.namespaceConfusionProtectionEnabled = namespaceConfusionProtectionEnabled;
    }
}
