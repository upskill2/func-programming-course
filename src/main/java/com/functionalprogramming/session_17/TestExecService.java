package com.functionalprogramming.session_17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecService {

    public static void main (String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit a task for asynchronous execution
        executorService.submit(() -> {
            try {
                // Simulate some time-consuming task
                Thread.sleep(2000);
                System.out.println("Task completed asynchronously!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit another task
        executorService.submit(() -> System.out.println("Another task_1" + " " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("Another task_2" + " " + Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println("Another task_3" + " " + Thread.currentThread().getName()));

        // Shutdown the executor service when done
        executorService.shutdown();
    }
}
