package com.practice.datatype;

import java.math.BigDecimal;

public class SimpleIntrestCalc {
    private BigDecimal principal;
    private BigDecimal interest;

    public SimpleIntrestCalc(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal caclulateValue(int years) {
        BigDecimal result = principal.add((principal.multiply(interest)).multiply(new BigDecimal(years)));
        return result;
    }
}
