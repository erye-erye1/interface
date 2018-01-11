package com.erye.service;

import javax.validation.constraints.NotNull;

import com.erye.entity.Consumer;

/**
 * 测试  校验
 */
public interface ValidationServiceInter {

	public void save(Consumer consumer); // 验证参数不能为 null
}
