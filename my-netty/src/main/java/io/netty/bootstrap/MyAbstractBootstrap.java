package io.netty.bootstrap;

import io.netty.channel.MyEventLoopGroup;
import io.netty.util.concurrent.MyEventExecutorGroup;

public abstract class MyAbstractBootstrap<B, C>  {
    private volatile MyEventLoopGroup group;
}
