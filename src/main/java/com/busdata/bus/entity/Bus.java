package com.busdata.bus.entity;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity //表名该类为实体类
public class Bus {
    @Id //用主键与表绑定
private Integer ID;
private Integer BUSROUTES;
private String DEAPRTURE;
private String BACK;
}
