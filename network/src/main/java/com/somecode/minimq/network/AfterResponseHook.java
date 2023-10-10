package com.somecode.minimq.network;

/**
 * 服务返回数据包时，触发的钩子函数接口
 */
public interface AfterResponseHook<Node, Message> {

    void doAfterResponseHook(Node node, Message request, Message reponse);

}
