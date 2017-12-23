package com.zyl.designpatterns.creationalpatterns.builder;

/**
 * Description: Computer类
 * Created by zouyulong on 2017/12/23.
 */

public class Computer {
    private String cpu;
    private String ram;
    private String mainboard;

    private Computer(Builder builder) {
        setCpu(builder.cpu);
        setRam(builder.ram);
        setMainboard(builder.mainboard);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return (cpu!=null?("cpu:" + cpu):"") + (ram!=null?(" ,ram" + ram):"") + (mainboard!=null?(" ,mainboard" + mainboard):"");
    }

    static class Builder {
        private String cpu;
        private String ram;
        private String mainboard;

        public Builder() {
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder ram(String val) {
            ram = val;
            return this;
        }

        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
