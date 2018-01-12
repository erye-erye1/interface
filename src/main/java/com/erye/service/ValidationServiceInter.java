package com.erye.service;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

import com.erye.entity.Consumer;

/**
 * 测试  校验
 */
public interface ValidationServiceInter {

	@GroupSequence(Update.class) // 同时验证Update组规则.  关联验证
	@interface Save{} // 与方法同名接口，首字母大写，用于区分验证场景，如：(加在属性上@NotNull(groups = ValidationService.Save.class))  分组验证
	public void save(Consumer consumer);
	
	@interface Update{}
	public void update(@NotNull Consumer consumer); // 验证参数不为null
}
