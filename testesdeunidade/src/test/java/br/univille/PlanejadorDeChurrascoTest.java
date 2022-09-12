package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanejadorDeChurrascoTest {
    private PlanejadorDeChurrasco plan;

    @BeforeEach 
    public void inicio(){ // pode ser outro nome no lugar de paraCada (Ex. inicio)
        plan = new PlanejadorDeChurrasco();
    }
    @Test
    public void testaUmAdultoZeroCrianca(){
        plan.setAdulto(1);
        plan.setCrianca(0);
        assertEquals(250f, plan.calculaQtdCarne());
    }
    @Test
    public void testaSeteAdultoCincoCrianca(){
        plan.setAdulto(7);
        plan.setCrianca(5);
        assertEquals(1750f, 500f, plan.calculaQtdCarne());
    }
    @Test
    public void testaZeroAdultoUmaCrianca(){
        plan.setAdulto(0);
        plan.setCrianca(1);
        assertEquals(100f, plan.calculaQtdCarne());
    }
    @Test
    public void testaOitoAdultoDuasCrianca(){
        plan.setAdulto(8);
        plan.setCrianca(2);
        assertEquals(2000f, 200f, plan.calculaQtdCarne());   
    }

}


