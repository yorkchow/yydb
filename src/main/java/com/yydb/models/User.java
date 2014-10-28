package com.yydb.models;

import java.io.Serializable;
import java.util.List;

/**
 * Model User
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/28
 * Time: 14:00
 */
// @Table(name = "yydb_user", catalog = "yydb_db")
public class User implements Serializable {

    private static final long serialVersionUID = 7163202134455274083L;

    private int id;

    private String email;

    private String name;

    private String password;

    private long money;

    private long payPoints;

    private long rankPoints;

    private long regTime;

    private long lastLogin;

    private String lastIp;

    private int visitCount;

    private UserRank rank;

    private int parentId;

    private String mobilePhone;

    private boolean isValidated;

    private UserAddress userAddress;

    private List<UserAddress> userAddresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public long getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(long payPoints) {
        this.payPoints = payPoints;
    }

    public long getRankPoints() {
        return rankPoints;
    }

    public void setRankPoints(long rankPoints) {
        this.rankPoints = rankPoints;
    }

    public long getRegTime() {
        return regTime;
    }

    public void setRegTime(long regTime) {
        this.regTime = regTime;
    }

    public long getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(long lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    public UserRank getRank() {
        return rank;
    }

    public void setRank(UserRank rank) {
        this.rank = rank;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public boolean isValidated() {
        return isValidated;
    }

    public void setValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public List<UserAddress> getUserAddresses() {
        return userAddresses;
    }

    public void setUserAddresses(List<UserAddress> userAddresses) {
        this.userAddresses = userAddresses;
    }
}
