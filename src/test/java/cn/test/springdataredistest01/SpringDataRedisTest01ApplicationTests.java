package cn.test.springdataredistest01;

import cn.test.springdataredistest01.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class SpringDataRedisTest01ApplicationTests {

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @Test
    void contextLoads() {
        redisUtils.set("sex", "man");
        String sex = redisUtils.get("sex");
        System.out.println(sex);

    }

}
