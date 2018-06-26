package com.run.myprojects.design.patterns.chapter18Memento.definition;

/**
 * 备忘录角色
 *
 * @author hewei
 */
public class Memento {
    private String status = "";

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
