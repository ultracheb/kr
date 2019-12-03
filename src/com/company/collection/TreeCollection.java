package com.company.collection;

import com.company.entity.TreeType;
import com.company.exception.EmptyCollectionException;
import com.company.entity.Tree;

import java.util.ArrayList;
import java.util.Comparator;

public class TreeCollection<T extends Tree> extends ArrayList<T> {

    public void print() {
        this.stream()
            .sorted(Comparator.reverseOrder())
            .forEach(System.out::print);
    }

    public long countEquals(T tree) throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Cannot count equals in empty collection!\n");
        }

        return this.stream()
            .filter(i -> i.equals(tree))
            .count();
    }

    public T min() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Cannot find minimum in empty collection!\n");
        }

        return (T) this.stream()
            .min(Comparator.naturalOrder())
            .orElseThrow(IllegalArgumentException::new);
    }

    public int totalNumberOfLeafs(TreeType type) {
        return this.stream()
            .filter(i -> i.getType() == type)
            .mapToInt(Tree::getFoliage).sum();
    }
}
