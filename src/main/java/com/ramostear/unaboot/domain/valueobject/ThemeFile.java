package com.ramostear.unaboot.domain.valueobject;

import lombok.Data;

@Data
public class ThemeFile {

    private String name;

    private String id;      //使用文件的相对路径为ID

    private String pid;     //父文件的相对路径
}
