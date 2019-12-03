package com.company;

import com.company.collection.TreeCollection;
import com.company.entity.Tree;
import com.company.entity.TreeType;
import com.company.entity.ForestTree;
import com.company.entity.FruitTree;
import com.company.exception.EmptyCollectionException;
import com.company.util.TreeReader;

public class Main {
    private static void testForestTree() {
        TreeReader reader = new TreeReader();
        TreeCollection<Tree> forest = reader.readTrees("input1.txt", ForestTree.class);

        try {
            forest.print();
            System.out.println(forest.totalNumberOfLeafs(TreeType.CONIFEROUS));
            System.out.print(forest.countEquals(new ForestTree("Сосна", 4, TreeType.CONIFEROUS, 100)));
        }
        catch (EmptyCollectionException exc) {
            System.out.print(exc.getMessage());
        }
    }

    private static void testFruitTree() {
        TreeReader reader = new TreeReader();
        TreeCollection<Tree> forest = reader.readTrees("input1.txt", FruitTree.class);

        try {
            forest.print();
            System.out.println(forest.totalNumberOfLeafs(TreeType.CONIFEROUS));
            System.out.print(forest.countEquals(new FruitTree("Сосна", 4, TreeType.CONIFEROUS, 100)));
        }
        catch (EmptyCollectionException exc) {
            System.out.print(exc.getMessage());
        }
    }

    public static void main(String[] args) {
        testForestTree();
        testFruitTree();
    }
}
