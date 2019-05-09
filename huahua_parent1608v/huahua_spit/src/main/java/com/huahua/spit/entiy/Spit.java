/**
 * Date:    2019/4/17 19:20
 * <author>
 * 陈柏
 */
package com.huahua.spit.entiy;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
@Data
public class Spit implements Serializable {

    private static final long serialVersionUID = -1309989533678918098L;

    @Id
    private String _id;

    private String content;

    private Date publishtime;

    private String userid;

    private String nickname;

    private Integer visits;

    private Integer thumbup;

    private Integer share;

    private Integer comment;

    private String state;

    private String parentid;

}
