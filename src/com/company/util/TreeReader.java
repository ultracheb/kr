package com.company.util;

import com.company.collection.TreeCollection;
import com.company.entity.TreeType;
import com.company.entity.ForestTree;
import com.company.entity.FruitTree;
import com.company.entity.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Function;

public final class TreeReader {

    public TreeCollection<Tree> readTrees(String filePath, Class clazz) {
        TreeCollection<Tree> forest = new TreeCollection<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                if (clazz.equals(FruitTree.class)) {
                    forest.add(readFruitTree(scanner));
                } else if (clazz.equals(ForestTree.class)) {
                    forest.add(readForestTree(scanner));
                }
            }
        } catch (FileNotFoundException exc) {
            System.out.println(String.format("No file %s\n", filePath));
        }

        return forest;
    }

    private FruitTree readFruitTree(Scanner sc) {
        return new FruitTree(sc.next(), Integer.parseInt(sc.next()),
            TreeType.ofName(sc.next()), Integer.parseInt(sc.next()));
    }

    private ForestTree readForestTree(Scanner sc) {
        return new ForestTree(sc.next(), Integer.parseInt(sc.next()),
            TreeType.ofName(sc.next()), Integer.parseInt(sc.next()));
    }
}
