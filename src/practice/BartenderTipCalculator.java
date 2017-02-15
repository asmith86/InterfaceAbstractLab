/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author asmith86
 */
public class BartenderTipCalculator extends TipCalculator{
    private int numDrinks;

    public BartenderTipCalculator(int numDrinks) {
        this.numDrinks = numDrinks;
    }

    public int getNumDrinks() {
        return numDrinks;
    }

    public void setNumDrinks(int numDrinks) {
        this.numDrinks = numDrinks;
    }

    @Override
    public double getTip(double billTotal, double percentTip) {
        return 1.0 * numDrinks;
    }
    
}
