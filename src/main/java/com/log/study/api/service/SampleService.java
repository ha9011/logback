package com.log.study.api.service;

import com.log.study.api.domain.Sample;
import com.log.study.api.domain.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;
    public List<Sample> findAll() {
        return sampleRepository.findAll();
    }
}
