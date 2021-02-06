package si.qi.clazz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"si.qi.clazz.dao"})
public class ZhousClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhousClassApplication.class, args);
    }

}
