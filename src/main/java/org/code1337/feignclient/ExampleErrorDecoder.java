package org.code1337.feignclient;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExampleErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        log.info("Method : {}, Response: {}", s, response);

        switch (response.status()) {
            case 400:
            case 404:
                return new Exception("40X Error");
            default:
                return new Exception("Generic error");
        }
    }
}
