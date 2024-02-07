package oo.Calculator;

import java.util.List;

public interface Token<T extends Number> {
    T process(List<Token<T>> tokens);
}
