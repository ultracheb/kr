package com.company.entity;

public class FruitTree extends Tree {
    private Integer harvest;

    public FruitTree(String name, Integer numberOfLeafs, TreeType type, int harvest) {
        super(name, numberOfLeafs, type);
        this.harvest = harvest;
    }

    @Override
    public String toString() {
        return super.toString() + "with harvest: " + harvest + '\n';
    }

    @Override
    public boolean equals(Object obj) throws IllegalArgumentException {
        if (obj instanceof FruitTree) {
            return super.equals(obj) && harvest.equals(((FruitTree) obj).harvest);
        } else {
            throw new IllegalArgumentException("Cannot compare fruit tree to non fruit tree object!\n");
        }
    }
}
