package com.jaycekon.dubbo.domain;

import lombok.*;

import java.io.Serializable;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

}
