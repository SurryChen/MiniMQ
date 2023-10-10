package com.somecode.minimq.network;

/**
 * 服务被请求时，触发的钩子函数接口
 */
public interface BeforeRequestHook<Node, Message> {

    void doBeforeRequestHook(Node node, Message request);

}
