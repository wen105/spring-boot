package application.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by wen on 2017/3/17.
 * User实体类
 */
@Setter
@Getter
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
}
