package com.somecode.minimq.network;

/**
 * 定义一个网络服务的生命周期
 */
public interface NetworkService {

    /**
     * 启动服务
     */
    void start();

    /**
     * 销毁服务
     */
    void shutdown();

}
