package com.sunday.dianshang.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Sunday
 * @date 2020/6/20
 */
@Configuration
@Slf4j
public class AsyncTaskExecutorConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        //当我们向ThreadPoolTaskExecutor提交新任务时，如果正在运行的线程少于corePoolSize线程，即使池中有空闲线程，
        // 或者如果正在运行的线程少于maxPoolSize且由queueCapacity定义的队列已满，它也会创建一个新线程。
        threadPoolTaskExecutor.setCorePoolSize(10);
        threadPoolTaskExecutor.setMaxPoolSize(20);
        threadPoolTaskExecutor.setQueueCapacity(10);
        //当线程池的数量超过corePoolSize时，多余的空闲线程的存活时间。
        threadPoolTaskExecutor.setKeepAliveSeconds(3000);
        //当我们的线程数量高于线程池的处理速度时，任务
        //会被缓存到本地的队列中。队列也是有大小的，如果超过了这个大小，就需要有拒绝的策
        //略，不然就会内存溢出了
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return (throwable, method, objects) -> log.error(method.getName() + throwable.getMessage());
    }
}
