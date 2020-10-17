package com.oracle.simpleInterest.service;

import com.oracle.simpleInterest.model.OutputSi;
import org.springframework.stereotype.Service;

@Service
public class CalculateSi {
    public OutputSi getSi(double p, double r, double t){
        double result = ((p*r*t)/100);
        OutputSi res = new OutputSi();
        res.setResult(result);
        return res;
    }
}
