package com.jaycekon.dubbo.domain;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
public class User implements Serializable {
    private int id;
    private String username;
    private String password;

}
