package com.lephantrunghieu.lpth_lesson01_spring_boot.entity;

public class lpthStudent {
    private Long lpthId;
    private String lpthName;
    private int lpthAge;
    private String lpthGender;
    private String lpthAddress;
    private String lpthPhone;
    private String lpthEmail;

    // Constructor không tham số
    public lpthStudent() {
    }

    // Constructor có tham số
    public lpthStudent(Long lpthId, String lpthName, int lpthAge, String lpthGender,
                       String lpthAddress, String lpthPhone, String lpthEmail) {
        this.lpthId = lpthId;
        this.lpthName = lpthName;
        this.lpthAge = lpthAge;
        this.lpthGender = lpthGender;
        this.lpthAddress = lpthAddress;
        this.lpthPhone = lpthPhone;
        this.lpthEmail = lpthEmail;
    }

    // Getter và Setter
    public Long getLpthId() {
        return lpthId;
    }

    public void setLpthId(Long lpthId) {
        this.lpthId = lpthId;
    }

    public String getLpthName() {
        return lpthName;
    }

    public void setLpthName(String lpthName) {
        this.lpthName = lpthName;
    }

    public int getLpthAge() {
        return lpthAge;
    }

    public void setLpthAge(int lpthAge) {
        this.lpthAge = lpthAge;
    }

    public String getLpthGender() {
        return lpthGender;
    }

    public void setLpthGender(String lpthGender) {
        this.lpthGender = lpthGender;
    }

    public String getLpthAddress() {
        return lpthAddress;
    }

    public void setLpthAddress(String lpthAddress) {
        this.lpthAddress = lpthAddress;
    }

    public String getLpthPhone() {
        return lpthPhone;
    }

    public void setLpthPhone(String lpthPhone) {
        this.lpthPhone = lpthPhone;
    }

    public String getLpthEmail() {
        return lpthEmail;
    }

    public void setLpthEmail(String lpthEmail) {
        this.lpthEmail = lpthEmail;
    }
}
