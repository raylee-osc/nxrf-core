package com.osckorea.osms.nxrf.core.vo.summary;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class ReleaseQuarantineSummaryVo {
    private Integer autoReleaseQuarantineCountMTD;
    private Integer autoReleaseQuarantineCountYTD;
}
