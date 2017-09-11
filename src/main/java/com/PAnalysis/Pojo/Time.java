package com.PAnalysis.Pojo;

/**
 * Created by sickle on 17-9-6.
 */
public class Time {
/**
 1引入新课
 2讲授新课
 3巩固知识
 4课堂小结
 5布置作业
 */
    private int load;
    private int teach;
    private int strengthen;
    private int summary;
    private int homework;
    private int all;

    @Override
    public String toString() {
        return "Time{" +
                "load=" + load +
                ", teach=" + teach +
                ", strengthen=" + strengthen +
                ", summary=" + summary +
                ", homework=" + homework +
                ", all=" + all +
                '}';
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getTeach() {
        return teach;
    }

    public void setTeach(int teach) {
        this.teach = teach;
    }

    public int getStrengthen() {
        return strengthen;
    }

    public void setStrengthen(int strengthen) {
        this.strengthen = strengthen;
    }

    public int getSummary() {
        return summary;
    }

    public void setSummary(int summary) {
        this.summary = summary;
    }

    public int getHomework() {
        return homework;
    }

    public void setHomework(int homework) {
        this.homework = homework;
    }

}
