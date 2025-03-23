package com.secor.ecommercecustomerservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class MainRestController {


    private static final Logger log = LoggerFactory.getLogger(MainRestController.class);


    @Autowired
    CustomerDetailRepository customerDetailRepository;

    @Autowired
    AuthService authService;

    @PostMapping("update/customer/details")
    public ResponseEntity<?> updateCustomerDetails(@RequestBody CustomerDetail customerDetail,
                                               @RequestHeader("Authorization") String token)
    {
        log.info("Received request to update customer details: {}", customerDetail);
        if(!authService.validateToken(token))
        {
            log.info("Invalid token: {}", token);
            return ResponseEntity.badRequest().body("Invalid token");
        }
        log.info("Token is valid: {}", token);
        log.info("Updating customer details: {}", customerDetail);
        customerDetailRepository.save(customerDetail);
        return ResponseEntity.ok(customerDetail);
    }



}
