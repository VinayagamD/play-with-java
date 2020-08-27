package com.vinaylogics.playwithjava.javaprocess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class PythonProcessRun {

    public static void main(String[] args) throws IOException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("python", "F:\\PythonProgrammingBatch1\\untitled\\test.py" );
        Process process = processBuilder.inheritIO().start();
        try(InputStream inputStream = process.getInputStream()){
            ProcessTask task = new ProcessTask(inputStream);
            Future<List<String>> future = executor.submit(task);
            System.out.println("Task");
            future.get(5, TimeUnit.SECONDS).forEach(System.out::println);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    private static class  ProcessTask implements Callable<List<String>>{
        private InputStream inputStream;

        public ProcessTask(InputStream inputStream) {
            this.inputStream = inputStream;
        }

        @Override
        public List<String> call(){
            return new BufferedReader((new InputStreamReader(inputStream))).lines().collect(Collectors.toList());
        }
    }
}
