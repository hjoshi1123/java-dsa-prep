package com.rushi.dsaportfolio.core;

import java.util.Scanner;

public abstract class BaseProblem implements DSAProblem {
    protected final Scanner scanner;
    public BaseProblem(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public final void run() {
        try {
            executeLogic(); // Hook method implemented by individual problems
        } catch (Exception e) {
            System.err.println("Execution error: " + e.getMessage());
        }
    }

    protected abstract void executeLogic() throws Exception;
}
