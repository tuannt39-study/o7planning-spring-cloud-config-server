package vn.its.o7planningspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class O7planningSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(O7planningSpringCloudConfigServerApplication.class, args);
    }
}
