package com.jaycekon.dubbo.domain;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Long id;
    private String name;
    private int age;
    private String pwd;

}
