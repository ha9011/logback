package com.log.study.api.controller;

import com.log.study.api.domain.Sample;
import com.log.study.api.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleContoller {

    private final SampleService sampleService;

    @GetMapping("/api/sample")
    public List<Sample> getSample(){

        List<Sample> samples = sampleService.findAll();
        return samples;
    }

}
