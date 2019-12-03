package com.company.entity;

abstract public class Tree implements Comparable<Tree> {
    protected String name;
    protected Integer foliage;
    protected TreeType type;

    public Tree(String name, Integer foliage, TreeType type) {
        this.name = name;
        this.foliage = foliage;
        this.type = type;
    }

    public String toString() {
        return "Tree " + name + " of type " + type.toString() + " with " + foliage + " tree crown ";
    }

    public TreeType getType() {
        return type;
    }

    public Integer getFoliage() {
        return foliage;
    }

    @Override
    public int compareTo(Tree o) throws IllegalArgumentException {
        if (o != null) {
            if (!foliage.equals(o.foliage)) {
                return Integer.compare(foliage, o.foliage);
            } else {
                return -name.compareTo(o.name);
            }
        } else {
            throw new IllegalArgumentException("Cannot compare Tree to null object");
        }
    }

    @Override
    public boolean equals(Object obj) throws IllegalArgumentException {
        if (obj instanceof Tree) {
            Tree o = (Tree) obj;
            return name.equals(o.name) && foliage.equals(o.foliage) && type.equals(o.type);
        } else {
            throw new IllegalArgumentException("Cannot compare Tree to non-Tree object");
        }
    }
}
