package com.oracle.simpleInterest.controller;

import com.oracle.simpleInterest.exception.InterestException;
import com.oracle.simpleInterest.model.OutputSi;
import com.oracle.simpleInterest.service.CalculateSi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/restService")
public class SiController {

    @Autowired
    CalculateSi calculateSi;

    @RequestMapping(value="/si/{principal:.+}/{rate:.+}/{time:.+}", method = RequestMethod.GET)
    public @ResponseBody
    OutputSi getSimpleInterest(@PathVariable("principal") double principal,
                                        @PathVariable("rate") double rate,
                                        @PathVariable("time") double time) throws InterestException {
        try {
            return calculateSi.getSi(principal,rate,time);
        }catch(RuntimeException exception){
            throw new InterestException(exception.getLocalizedMessage());
        }
    }
}
