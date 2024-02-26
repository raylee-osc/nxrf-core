package com.osckorea.osms.nxrf.core.model.repository;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class Repository {
    private String repositoryId;
    private String publicId;
    private String format;
}
