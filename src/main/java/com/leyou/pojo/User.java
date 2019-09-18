package com.leyou.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@Data
@ConfigurationProperties(prefix = "users")
public class User implements Serializable {
    private int id;
    private String name;
    private int age;
    private List<String> bf;

}
