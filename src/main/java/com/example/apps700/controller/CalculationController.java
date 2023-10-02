package com.example.apps700.controller;

import com.example.apps700.dto.CalculationResultDto;
import com.example.apps700.service.CalculationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/addMulti")
    public CalculationResultDto addMulti(
            @RequestParam("i") double firstNum,
            @RequestParam("j") double secondNum
    ) {

        return calculationService.addMultiCalculation(firstNum, secondNum);
    }
}
