package com.xxxx.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxxx.seckill.mapper")
/*指定要变成实现类的接口所在的包，使用后包下面*所有接口在编译之后都会生成相应的实现类
添加位置：是在Springboot启动类上面添加，*/
public class SeckillDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillDemoApplication.class, args);
    }

}
