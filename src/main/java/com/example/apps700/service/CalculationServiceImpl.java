package com.example.apps700.service;

import com.example.apps700.dto.CalculationResultDto;
import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public CalculationResultDto addMultiCalculation(double firstNum, double secondNum) {

        double sum = firstNum + secondNum;
        double product = firstNum * secondNum;

        return new CalculationResultDto(sum, product);
    }
}
