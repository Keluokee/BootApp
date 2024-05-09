package com.boot.common.dto;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import lombok.Data;

@Data
public class BasePage<T> {

    private int pageSize = 10;

    private int pageNumber = 1;

    public IPage<T> toPage() {
        return new Page<>(pageNumber, pageSize);
    }

}
