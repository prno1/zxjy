package com.zxjy.eduservice.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 课程简介表
 * </p>
 *
 * @author pr
 * @since 2023-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_course_des")
@ApiModel(value="CourseDes对象", description="课程简介表")
public class CourseDes implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "课程id")
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @ApiModelProperty(value = "课程简介")
    private String description;
    @TableField(fill = FieldFill.INSERT)
    private Date dateCreate;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date dateUpdate;


}
