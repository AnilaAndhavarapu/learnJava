package com.learning.design_patterns.strategy.solider;

import com.learning.design_patterns.strategy.stategies.IAttackStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TypeASolider extends Solider{

    @Autowired
    public TypeASolider(@Qualifier("gunAttack") IAttackStrategy attackStrategy) {
        super(attackStrategy);
    }
}
