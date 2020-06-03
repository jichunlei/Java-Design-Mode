package com.jicl.design.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 电脑产品
 *
 * @author : xianzilei
 * @date : 2020/6/3 14:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
}
