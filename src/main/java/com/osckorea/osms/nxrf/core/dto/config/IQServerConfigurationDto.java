package com.osckorea.osms.nxrf.core.dto.config;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class IQServerConfigurationDto {
    private String baseUrl;

    private Boolean forceBaseUrl;

    private List<String> frameAncestorsAllowlist;

    @JsonProperty("eventBus.maxThreadPoolSize")
    private Object eventBusMaxThreadPoolSize;

    private Boolean csrfProtection;
    
    private String userAgentSuffix;

    private Integer maxAdvancedSearchClauseCount;

    private String advancedSearchCSVExportDelimiter;

    private Short policyMonitoringHour;

    private String webhookSecretPassphrase;

    @JsonProperty("*hdsUrl")
    private String hdsUrl;

    private String sessionTimeout;

    private String purgeScanFiles;

    private Integer automaticQuarantineReleaseTimeIntervalInMinutes;

    private Integer quarantinedComponentReportExpirationTimeInHours;

    private Boolean waivedComponentUpgradeMonitoringEnabled;

    private String quarantinedItemCustomMessage;

    private Boolean alpObservedLicenseDetectionEnabled;
}
