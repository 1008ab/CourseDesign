package com.lottery.lottery;

public class Prize {
    private String name;
    private String level;
    private Integer count;

    public Prize() {
    }

    public Prize(String name, String level, Integer count) {
        this.name = name;
        this.level = level;
        this.count = count;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    public String toString() {
        return "Prize{name = " + name + ", level = " + level + ", count = " + count + "}";
    }
}
