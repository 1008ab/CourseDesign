package com.lottery.lottery;

public class Result {
    private Integer id;
    private String participantName;
    private String prizeName;

    public Result() {
    }

    public Result(Integer id, String participantName, String prizeName) {
        this.id = id;
        this.participantName = participantName;
        this.prizeName = prizeName;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return participantName
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * 设置
     * @param participantName
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    /**
     * 获取
     * @return prizeName
     */
    public String getPrizeName() {
        return prizeName;
    }

    /**
     * 设置
     * @param prizeName
     */
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String toString() {
        return "Result{id = " + id + ", participantName = " + participantName + ", prizeName = " + prizeName + "}";
    }
}
