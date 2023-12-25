package com.questions.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PractiseQuestions {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 10, 23, 30, 10, 15, 265, 23, 45, 212, 30);

		sumOfIntegers(numbers);
		averageOfNumbers(numbers);
		numberSquareFilterAverage(numbers);
		evenOdd(numbers);
		numbersStartingWithPrefix(numbers);
		duplicateNumbers(numbers);
		maxAndMin(numbers);
		SortNumbers(numbers);
		limitAndSkip(numbers);
		secondLowetAndHighest(numbers);
//		firstNonRepeatingCharacter("Hello Hi Java");
	}

	public static void sumOfIntegers(List<Integer> numbers) {
		System.out.println("");
		Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
		// Integer sum = numbers.stream().mapToInt(e-> e).sum();
		System.out.println("Sum = " + sum.get());
	}

	public static void averageOfNumbers(List<Integer> numbers) {
		System.out.println("");
		double avg = numbers.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average = " + avg);
	}

	public static void numberSquareFilterAverage(List<Integer> numbers) {
		System.out.println("");
		// square each numbers and then filter number greater than 500 and find the
		// average of those filtered numbers

		double filteredAvg = numbers.stream().map(n -> n * n).filter(n -> n > 100).mapToInt(n -> n).average()
				.getAsDouble();

		System.out.println("Square of numbers and average of those greater than 100: " + filteredAvg);
	}

	public static void evenOdd(List<Integer> numbers) {
		System.out.println("");
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("Even Numbers = " + evenNumbers);
		System.out.println("Odd Numbers = " + oddNumbers);
	}

	public static void numbersStartingWithPrefix(List<Integer> numbers) {
		System.out.println("");
		List<Integer> numbersStartingWith2 = numbers.stream().map(n -> String.valueOf(n)).filter(n -> n.startsWith("1"))
				.map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("numbersStartingWith2 = " + numbersStartingWith2);
	}

	public static void duplicateNumbers(List<Integer> numbers) {
		System.out.println("");
		Set<Integer> uniqueNumbers = new HashSet<>();
		Set<Integer> duplicateNumbers = numbers.stream().filter(n -> !uniqueNumbers.add(n)).collect(Collectors.toSet());

		// Set<Integer> duplicateNumbers1 = numbers.stream().filter(n ->
		// Collections.frequency(numbers, n) > 1).collect(Collectors.toSet());
		System.out.println("duplicateNumbers = " + duplicateNumbers);
		// System.out.println("duplicateNumbers1 = "+duplicateNumbers1);
	}

	public static void maxAndMin(List<Integer> numbers) {
		System.out.println("");
		int max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

	public static void SortNumbers(List<Integer> numbers) {
		System.out.println("");

		List<Integer> ascending = numbers.stream().sorted().collect(Collectors.toList());
		List<Integer> descending = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

		System.out.println("ascending = " + ascending);
		System.out.println("descending = " + descending);
	}

	public static void limitAndSkip(List<Integer> numbers) {
		System.out.println("");

		// Sum of first 5 numbers
		Integer sumOfFirstFive = numbers.stream().limit(5).mapToInt(n -> n).sum();

		List<Integer> skippedNumbers = numbers.stream().skip(5).collect(Collectors.toList());
		System.out.println("sumOfFirstFive = " + sumOfFirstFive);
		System.out.println("skippedNumbers = " + skippedNumbers);
	}
	
	public static void secondLowetAndHighest(List<Integer> numbers) {
		System.out.println("");
		int secondLowest = numbers.stream().sorted().distinct().skip(1).findFirst().get();
		int secondHighest = numbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		
		System.out.println("secondLowest = " + secondLowest);
		System.out.println("secondHighest = " + secondHighest);
	}

	public static void firstNonRepeatingCharacter(String input) {
		Set<Character> letters = new HashSet<>();
		input.chars().forEach(null);
	}
}
