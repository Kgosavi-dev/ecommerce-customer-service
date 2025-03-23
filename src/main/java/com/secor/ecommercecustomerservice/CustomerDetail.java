package com.secor.ecommercecustomerservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customerdetails")
@Getter @Setter
public class CustomerDetail {

    @Id
    private String username;
    private String fullname;
    private String usertype;
    private String email;
    private String phone;
    private String address;

}
