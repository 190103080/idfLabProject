package practice.work.projectwork.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "t_exchangevalue")
public class ExchangeValue extends BaseEntity{

    @Column(name = "account_from")
    private int accountFrom;

    @Column(name = "account_to")
    private int accountTo;

    @Column(name = "currency_shortname")
    private String currencyShortName;

    @Column(name = "summ")
    private double sum;

    @Column(name = "expense_category")
    private String expenseCategory;

    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;

}
