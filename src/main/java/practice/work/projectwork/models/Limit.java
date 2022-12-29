package practice.work.projectwork.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "t_limit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Limit extends BaseEntity{

    @Column(name = "limit_sum")
    private double sum;

    @Column(name = "limit_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date utilDate;

    @Column(name = "limit_currency_shortname")
    private String usd;

    @OneToOne(fetch = FetchType.LAZY)
    private LimitExceeded limitExceeded;

}
