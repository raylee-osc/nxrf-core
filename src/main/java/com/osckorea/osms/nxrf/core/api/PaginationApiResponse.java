package com.osckorea.osms.nxrf.core.api;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class PaginationApiResponse<T> {
    private Integer total;
    private Integer page;
    private Integer pageSize;
    private Integer pageCount;
    private List<T> results;
}
