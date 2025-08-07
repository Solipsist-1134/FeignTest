package shue.feigntest.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;
import shue.feigntest.webclient.MyFeignClient;

@RestController
@AllArgsConstructor
public class TestController {
    private MyFeignClient webClient;

    @GetMapping("/get")
    public Flux<String> get() {
        return Flux.fromIterable(webClient.getAll());
    }

}
