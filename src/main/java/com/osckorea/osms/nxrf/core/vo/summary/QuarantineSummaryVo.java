package com.osckorea.osms.nxrf.core.vo.summary;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class QuarantineSummaryVo {
    private Integer repositoryCount;
    private Integer quarantineEnabledRepositoryCount;
    private Boolean quarantineEnabled;
    private Integer totalComponentCount;
    private Integer quarantinedComponentCount;
}
