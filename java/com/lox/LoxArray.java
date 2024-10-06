package com.lox;

import java.util.ArrayList;

class LoxArray {
    private final ArrayList<Object> elements;

    LoxArray(ArrayList<Object> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return this.elements.toString();
    }

}
