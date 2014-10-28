package com.yydb.models;

import java.io.Serializable;
import java.util.List;

/**
 * Model UserRank
 *
 * @author: York Chow<york.chow@actionsky.com>
 * @since: 2014/10/28
 * Time: 15:16
 */
// @Table(name = "yydb_user_rank", catalog = "yydb_db")
public class UserRank implements Serializable {

    private static final long serialVersionUID = 1655049871882907685L;

    private int id;

    private String name;

    private long minPoints;

    private long maxPoints;

    private int specialRank;

    private List<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(long minPoints) {
        this.minPoints = minPoints;
    }

    public long getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(long maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getSpecialRank() {
        return specialRank;
    }

    public void setSpecialRank(int specialRank) {
        this.specialRank = specialRank;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
