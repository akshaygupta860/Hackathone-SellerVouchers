package com.hackathon.RewardManagement.Controller;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/v1/events")
@RequiredArgsConstructor
@Slf4j
public class EventsController {

    @PostMapping()
    @ResponseStatus(OK)
    @SneakyThrows
    public ResponseEntity receiveEvents(@RequestAttribute Map<String, String> tracingHeaders) {


        return ResponseEntity.status(OK).build();

    }
}
