package com.osckorea.osms.nxrf.core.constants;

public final class NxrfRestApiConstant {
    private final static String BASE_URL = "/api/v2";

    public static class Firewall {
        public final static String BASE_URL = NxrfRestApiConstant.BASE_URL + "/firewall";

        public final static String AUTO_RELEASED_FROM_QUARANTINE_SUMMARY = BASE_URL + "/releaseQuarantine/summary";
    
        public final static String AUTO_RELEASED_FROM_QUARANTINE_CONFIG = BASE_URL + "/releaseQuarantine/configuration";
    
        public final static String AUTO_RELEASED_FROM_QUARANTINE_COMPONENTS = BASE_URL + "/components/autoReleasedFromQuarantine";
    
        public final static String QUARANTINED_COMPONENTS_SUMMARY = BASE_URL + "/quarantine/summary";
    
        public final static String QUARANTINED_COMPONENTS = BASE_URL + "/components/quarantined";
    
        private final static String CONFIG_ANONYMOUS_ACCESS_FOR_THE_QUARANTINED_COMPONENT_VIEW = BASE_URL + "/quarantinedComponentView/configuration/anonymousAccess";
    
        public final static String ANONYMOUS_ACCESS_ENABLE_FOR_THE_QUARANTINED_COMPONENT_VIEW = CONFIG_ANONYMOUS_ACCESS_FOR_THE_QUARANTINED_COMPONENT_VIEW + "/true";
    
        public final static String ANONYMOUS_ACCESS_DISABLE_FOR_THE_QUARANTINED_COMPONENT_VIEW = CONFIG_ANONYMOUS_ACCESS_FOR_THE_QUARANTINED_COMPONENT_VIEW + "/false";
    
        public final static String REPOSITORY_MANAGER_CONFIG = BASE_URL + "/repositoryManagers";
    
        public final static String REPOSITORY_MANAGER_REPOSITORY_CONFIG = BASE_URL + "/repositories/configuration";
    
        public final static String FIREWALL_METRICS = BASE_URL + "/metrics/embedded";
    }

    public static class Quarantine {
        public final static String QUARANTINED_COMPONENTS = BASE_URL + "/reports/components/quarantined";

        // public final static String RELEASE_FROM_QUARANTINE = BASE_URL + "/repositories/quarantine/{quarantineId}/release";
    }
}
