package com.pti.concurrency;

import java.util.concurrent.CompletableFuture;

public class App02 {

	public static void main(String[] args) {
		CompletableFuture.supplyAsync(() -> {
			System.out.println("Fetching daa..");
			return "Java Concurrency";
		}).thenApply(data -> data.toUpperCase()).thenAccept(System.out::println).join();

	}

}
