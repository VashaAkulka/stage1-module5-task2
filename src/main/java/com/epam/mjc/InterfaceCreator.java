package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> operation = list -> {
            List<Integer> result = new ArrayList<>();
            for (Integer x : list) {
                result.add(x / divider);
            }

            return result;
        };

        return  operation;
    }
}
