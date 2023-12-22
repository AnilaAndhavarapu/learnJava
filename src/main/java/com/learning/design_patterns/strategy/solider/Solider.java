package com.learning.design_patterns.strategy.solider;

import com.learning.design_patterns.strategy.stategies.IAttackStrategy;
import org.springframework.stereotype.Component;

@Component
public class Solider {

    public IAttackStrategy attackStrategy;
    public String level;


    public Solider(IAttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public String attack(){
        return  attackStrategy.attack();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
