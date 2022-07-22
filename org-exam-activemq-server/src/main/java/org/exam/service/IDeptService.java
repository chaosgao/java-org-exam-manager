package org.exam.service;

public interface IDeptService {

    // hystrix 熔断器示例 ok
    String deptInfo_Ok(Integer id);
    //hystrix 熔断器超时案例
    String deptInfo_Timeout(Integer id);

}
