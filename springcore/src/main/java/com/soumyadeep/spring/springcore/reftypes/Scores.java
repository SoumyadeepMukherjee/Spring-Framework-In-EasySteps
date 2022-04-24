package com.soumyadeep.spring.springcore.reftypes;

public class Scores {
    private int phy;
    private int maths;
    private int chem;

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    @Override
    public String toString() {
        return "Scores [chem=" + chem + ", maths=" + maths + ", phy=" + phy + "]";
    }

}
