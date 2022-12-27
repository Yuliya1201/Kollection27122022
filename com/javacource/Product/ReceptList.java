package com.javacource.Product;


import java.util.HashSet;
import java.util.Set;

public class ReceptList {
    private Set <Recept> recepts = new HashSet<>();
    public ReceptList (Set <Recept>recepts) {
        this.recepts = recepts;


    }
    public void add(Recept recept) {
        if (recepts.contains(recept)) {
            throw new IllegalArgumentException("такой рецепт уже есть");
        }
        recepts.add(recept);
    }
    public void remove (Recept recept) {
        recepts.remove(recept);
    }
}
