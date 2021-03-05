```sql
CREATE TABLE `user_info` (
  `id` bigint(30) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` bigint(30) NOT NULL DEFAULT '0' COMMENT 'uid',
  `openid` varchar(128) NOT NULL DEFAULT '' COMMENT '微信openid',
  `avatar` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',
  `wechat_name` varchar(30) NOT NULL DEFAULT '' COMMENT '微信昵称',
  `nick_name` varchar(20) NOT NULL DEFAULT '' COMMENT '昵称',
  `role` int(5) NOT NULL DEFAULT '4' COMMENT '角色',
  `phone` varchar(15) NOT NULL DEFAULT '' COMMENT '手机号',
  `password` varchar(20) NOT NULL DEFAULT '' COMMENT '密码',
  `classes` varchar(64) NOT NULL DEFAULT '[]' COMMENT '所属班级',
  `ext` varchar(512) NOT NULL DEFAULT '{}' COMMENT '扩展信息',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

```sql
CREATE TABLE `class`(
    `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键' ,
    `school_name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '学校名称' ,
    `grade` INT(5) NOT NULL DEFAULT '1' COMMENT '年级' ,
    `class_number` INT(5) NOT NULL DEFAULT '1' COMMENT '班级' ,
    `ext` VARCHAR(512) NOT NULL DEFAULT '{}' COMMENT '扩展信息' ,
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
    PRIMARY KEY(`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;
```

```sql
CREATE TABLE `notify`(
    `id` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT '主键' ,
    `type` INT(5) NOT NULL DEFAULT '0' COMMENT '通知类型' ,
    `title` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '标题' ,
    `content` VARCHAR(512) NOT NULL DEFAULT '' COMMENT '内容' ,
    `time` INT(12) NOT NULL DEFAULT '0' COMMENT '通知时间' ,
    `author_id` BIGINT(30) NOT NULL DEFAULT '0' COMMENT '作者uid' ,
    `class_ids` VARCHAR(128) NOT NULL DEFAULT '[]' COMMENT '所属班级id' ,
    `ext` VARCHAR(512) NOT NULL DEFAULT '{}' COMMENT '扩展信息' ,
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
    PRIMARY KEY(`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;
```

```sql
CREATE TABLE `menu`(
    `id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '主键' ,
    `parent_id` INT(10) NOT NULL DEFAULT '0' COMMENT '父级id' ,
    `level` INT(5) NOT NULL DEFAULT '0' COMMENT '层级' ,
    `order` INT(5) NOT NULL DEFAULT '0' COMMENT '顺序' ,
    `menu_name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '菜单名称' ,
    `menu_url` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '菜单url' ,
    `menu_icon` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '菜单icon' ,
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间' ,
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间' ,
    PRIMARY KEY(`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;
```
