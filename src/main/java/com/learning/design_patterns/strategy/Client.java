package com.learning.design_patterns.strategy;

import com.learning.design_patterns.strategy.solider.Solider;
import com.learning.design_patterns.strategy.solider.TypeASolider;
import com.learning.design_patterns.strategy.stategies.ArrowAttackStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {

    public static void main(String[] args) {
        Solider soliderA = new TypeASolider(new ArrowAttackStrategy());
        System.out.println(soliderA.attack());
    }
}
