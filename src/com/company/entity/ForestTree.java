package com.company.entity;

public class ForestTree extends Tree {
    private Integer wood;

    public ForestTree(String name, Integer foliage, TreeType type, int wood) {
        super(name, foliage, type);
        this.wood = wood;
    }

    @Override
    public String toString() {
        return super.toString() + "with wood : " + wood + '\n';
    }

    @Override
    public boolean equals(Object obj) throws IllegalArgumentException {
        if (obj instanceof ForestTree) {
            return super.equals(obj) && wood.equals(((ForestTree) obj).wood);
        } else {
            throw new IllegalArgumentException("Cannot compare forest tree to non-forest tree object!\n");
        }
    }
}

