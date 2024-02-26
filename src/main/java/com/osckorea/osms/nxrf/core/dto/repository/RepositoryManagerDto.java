package com.osckorea.osms.nxrf.core.dto.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class RepositoryManagerDto {
    private String id;
    private String name;
    private String instanceId;
    private String productName;
    private String productVersion;

    @Builder
    public RepositoryManagerDto(
        final String name, 
        final String instanceId,
        final String productName,
        final String productVersion
    ) {
        this.name = name;
        this.instanceId = instanceId;
        this.productName = productName;
        this.productVersion = productVersion;
    }
}
