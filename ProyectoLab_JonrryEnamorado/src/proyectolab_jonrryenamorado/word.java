/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_jonrryenamorado;

/**
 *
 * @author wende
 */
public class word {
    private String word;
    private int count;
    private boolean alapar;
    public word() {
    }

    public word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public word(String word, int count, boolean alapar) {
        this.word = word;
        this.count = count;
        this.alapar = alapar;
    }

    public boolean isAlapar() {
        return alapar;
    }

    public void setAlapar(boolean alapar) {
        this.alapar = alapar;
    }
    
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return word + " = " + count;
    }
    
    
}
