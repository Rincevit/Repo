package com.example.testing;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    @Test
    public void newAccountShouldNotBeActiveAfterCreation() {

        //given
        Account account = new Account();

        //then
        assertFalse(account.isActive(),"Check if new account is active");
    }

    @Test
    void accountShouldBeActiveAfterCreation() {

        //given
        Account account = new Account();

        //when
        account.activate();

        //then
        assertTrue(account.isActive());
    }

}