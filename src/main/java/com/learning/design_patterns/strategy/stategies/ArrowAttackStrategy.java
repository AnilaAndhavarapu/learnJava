package com.learning.design_patterns.strategy.stategies;

import org.springframework.stereotype.Component;

@Component("arrowAttack")
public class ArrowAttackStrategy implements IAttackStrategy{

    @Override
    public String attack() {
        return "Attack with arrows";
    }
}
