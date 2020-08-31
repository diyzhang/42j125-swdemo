package cn.toj.agenttest.controller;

import cn.toj.agenttest.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carlos
 * @description
 * @Date 2020/8/24
 */

@RestController
public class AgentTestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getConfig")
    public ResponseResult<String> getConfig() {
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), "Hello, I'm in port " + port + ".");
    }

    @GetMapping("/exception")
    public ResponseResult<String> getException() {
        int i = 1/0;
        return new ResponseResult<>(Integer.valueOf(HttpStatus.OK.value()), HttpStatus.OK.toString(), "Hello, I'm in port " + port + ".");
    }

}
