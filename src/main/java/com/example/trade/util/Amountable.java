package com.example.trade.util;

import java.math.BigInteger;

public interface Amountable {

    String getDecimalPointLocator();
    BigInteger getAmount();

}
