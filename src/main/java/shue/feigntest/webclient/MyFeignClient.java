package shue.feigntest.webclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;
import shue.feigntest.classes.User;
import shue.feigntest.config.WebClientConfig;

import java.util.List;

@FeignClient(name = "web-client",
        url = "http://localhost:8081",
        configuration = WebClientConfig.class)
public interface MyFeignClient {

    @GetMapping("/getAll")
    List<String> getAll();
}
