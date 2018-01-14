package com.erye.service;

/**
 * 测试  参数回调，将消费者的方法以参数的形式回传给服务端
 */
public interface CallbackServiceInter {

	public void addListerner(String key, CallbackListenerInter listener);
}
