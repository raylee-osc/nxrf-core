package com.osckorea.osms.nxrf.core.vo.metric;

import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class FirewallMetricVo {
    private Integer firewallMetricsValue;
    private Timestamp latestUpdatedTime;
}
