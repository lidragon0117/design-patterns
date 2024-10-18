package com.lilong.design.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : lilong
 * @date : 2024-10-18 22:20
 * @description :
 */
@Data
@AllArgsConstructor
public class GameRecord {
    /**
     * 版本号
     */
    private Integer id;
    /**
     * 游戏名称
     */
    private String name;
    /**
     * 状态
     */
    private String status;
}
