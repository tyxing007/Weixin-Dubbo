package com.cheng.weixin.rpc.promotion;

import com.cheng.common.entity.DataEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Desc: 优惠券
 * Author: cheng
 * Date: 2016/6/17
 */
public class Coupon extends DataEntity<Coupon> {
    private String name;
    private String couponTypeId;
    private BigDecimal faceValue;
    private int delayDay;
    private boolean isFree;
    private boolean isReuse;
    private BigDecimal enoughMoney;
    private BigDecimal discount;
    private String includeGroup;
    private String excludeGroup;
    private Date beginTime;
    private Date endTime;
    private boolean isEnable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCouponTypeId() {
        return couponTypeId;
    }

    public void setCouponTypeId(String couponTypeId) {
        this.couponTypeId = couponTypeId;
    }

    public BigDecimal getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }

    public int getDelayDay() {
        return delayDay;
    }

    public void setDelayDay(int delayDay) {
        this.delayDay = delayDay;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isReuse() {
        return isReuse;
    }

    public void setReuse(boolean reuse) {
        isReuse = reuse;
    }

    public BigDecimal getEnoughMoney() {
        return enoughMoney;
    }

    public void setEnoughMoney(BigDecimal enoughMoney) {
        this.enoughMoney = enoughMoney;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getIncludeGroup() {
        return includeGroup;
    }

    public void setIncludeGroup(String includeGroup) {
        this.includeGroup = includeGroup;
    }

    public String getExcludeGroup() {
        return excludeGroup;
    }

    public void setExcludeGroup(String excludeGroup) {
        this.excludeGroup = excludeGroup;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}

