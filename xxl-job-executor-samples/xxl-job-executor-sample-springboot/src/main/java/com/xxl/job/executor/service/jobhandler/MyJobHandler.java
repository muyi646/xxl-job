package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.handler.IJobHandler;
import org.springframework.stereotype.Component;
import com.xxl.job.core.handler.annotation.JobHandler;

/**
 * 编写自己的定时任务Handler
 * 继承IJobHandler
 */
@JobHandler(value = "MyJobHandler")
@Component
public class MyJobHandler extends IJobHandler {
    /**
     * 重写execute方法，里面执行相应的功能
     */
    @Override
    public void execute() throws Exception {
        System.out.println("我们不能失去信仰");
    }
}
