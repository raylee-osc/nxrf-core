package com.osckorea.osms.nxrf.core.vo.component;

import java.util.List;
import com.osckorea.osms.nxrf.core.model.component.QuarantineComponent;
import com.osckorea.osms.nxrf.core.model.repository.Repository;
import com.osckorea.osms.nxrf.core.model.violation.PolicyViolation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class QuarantineComponentVo<T> {
    private List<ComponentsInQuarantine<T>> componentsInQuarantine;

    @Getter
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class ComponentsInQuarantine<T> {
        private Repository repository;
        private List<Component<T>> components;

        @Getter
        @NoArgsConstructor(access = AccessLevel.PROTECTED)
        @AllArgsConstructor
        public static class Component<T> {
            private QuarantineComponent<T> component;
            private List<PolicyViolation> policyViolations;
        }
    }
}
