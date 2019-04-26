package com.cmd.exchange.common.model;

import java.math.BigDecimal;
import java.util.Date;

public class TicketLog {
    private Integer id;

    private Integer userid;

    private String usedcoinname;

    private Integer number;

    private BigDecimal price;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsedcoinname() {
        return usedcoinname;
    }

    public void setUsedcoinname(String usedcoinname) {
        this.usedcoinname = usedcoinname == null ? null : usedcoinname.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}