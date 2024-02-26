package com.osckorea.osms.nxrf.core.model.component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PypiComponentIdentifier extends AbstractComponentIdentifier{
    private PypiComponentCoordinates coordinates;
}
