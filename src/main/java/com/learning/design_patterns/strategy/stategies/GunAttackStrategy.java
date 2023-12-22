package com.learning.design_patterns.strategy.stategies;

import org.springframework.stereotype.Component;

@Component("gunAttack")
public class GunAttackStrategy implements IAttackStrategy{

    @Override
    public String attack() {
        return "Attack with guns";
    }
}
