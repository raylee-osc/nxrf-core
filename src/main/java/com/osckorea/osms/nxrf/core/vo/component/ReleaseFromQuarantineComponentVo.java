package com.osckorea.osms.nxrf.core.vo.component;

import java.util.List;
import com.osckorea.osms.nxrf.core.model.component.ReleaseFromQuarantineComponent;
import com.osckorea.osms.nxrf.core.model.violation.WaivedPolicyViolation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ReleaseFromQuarantineComponentVo<T> {
    public ComponentReleasedFromQuarantine<T> componentReleasedFromQuarantine;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class ComponentReleasedFromQuarantine<T> {
        private ReleaseFromQuarantineComponent<T> component;
        private List<WaivedPolicyViolation> WaivedPolicyViolation;
    }
}
