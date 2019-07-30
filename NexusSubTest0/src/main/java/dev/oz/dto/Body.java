package dev.oz.dto;

import java.util.Objects;

public class Body {
    String par1;
    String par2;

    @Override
    public String toString() {
        return "Body{" +
                "par1='" + par1 + '\'' +
                ", par2='" + par2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Body)) return false;
        Body body = (Body) o;
        return Objects.equals(par1, body.par1) &&
                Objects.equals(par2, body.par2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(par1, par2);
    }

    public String getPar1() {
        return par1;
    }

    public void setPar1(String par1) {
        this.par1 = par1;
    }

    public String getPar2() {
        return par2;
    }

    public void setPar2(String par2) {
        this.par2 = par2;
    }
}
