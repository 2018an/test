package com.cmd.exchange.common.model;

import java.util.Date;

public class Ticket {
    private Integer id;

    private String name;

    private Integer issuenumber;

    private Integer sellquantity;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIssuenumber() {
        return issuenumber;
    }

    public void setIssuenumber(Integer issuenumber) {
        this.issuenumber = issuenumber;
    }

    public Integer getSellquantity() {
        return sellquantity;
    }

    public void setSellquantity(Integer sellquantity) {
        this.sellquantity = sellquantity;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}