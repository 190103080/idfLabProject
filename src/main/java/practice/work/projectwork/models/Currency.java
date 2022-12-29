package practice.work.projectwork.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_currency")
@Getter
@Setter
public class Currency extends BaseEntity{

    @Column(name = "kzt")
    private double kzt;

    @Column(name = "rub")
    private double rub;

    @Column(name = "usd")
    private double usd;

}
