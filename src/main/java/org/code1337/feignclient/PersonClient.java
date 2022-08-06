package org.code1337.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "agify", url = "https://api.agify.io")
public interface PersonClient {
    @GetMapping
    Person getPerson(@RequestParam("name") String name);
}
