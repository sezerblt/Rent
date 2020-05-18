package com.rootx.foo.util;

import java.sql.Connection;

public class CreditCard {

    private static final CreditCard card_instance = new CreditCard();

    public static final CreditCard getCard_instance(){
        return card_instance;
    }

    public Connection getConnection() {
        return null;
    }

    public CreditCard() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
