package com.charles.smile.dto.data;

import com.alibaba.cola.dto.Response;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

/**
 * @author charles
 * @date 2023/5/17 0:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class IPageResponse<T> extends Response {

    private static final long serialVersionUID = 1L;
    private long totalCount = 0;
    private long pageSize = 1;
    private long pageIndex = 1;
    private Collection<T> data;

    public static <T> IPageResponse<T> of(IPage<T> page) {
        IPageResponse<T> response = new IPageResponse<>();
        response.setSuccess(true);
        response.setData(page.getRecords());
        response.setTotalCount(page.getTotal());
        response.setPageSize(page.getSize());
        response.setPageIndex(page.getCurrent());
        return response;
    }
}
