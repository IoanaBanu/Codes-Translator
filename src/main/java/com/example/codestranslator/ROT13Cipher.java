package com.example.codestranslator;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.stream.IntStream;

public class ROT13Cipher {

	public static String rot13encode(String value) {

		char[] values = value.toCharArray();
		for (int i = 0; i < values.length; i++) {
			char letter = values[i];

			if (letter >= 'a' && letter <= 'z') {
				// Rotate lowercase letters.

				if (letter > 'm') {
					letter -= 13;
				} else {
					letter += 13;
				}
			} else if (letter >= 'A' && letter <= 'Z') {
				// Rotate uppercase letters.

				if (letter > 'M') {
					letter -= 13;
				} else {
					letter += 13;
				}
			}
			values[i] = letter;
		}
		// Convert array to a new String.
		return new String(values);
	}
	public static String rot13decode(String value) {

		char[] values = value.toCharArray();
		for (int i = 0; i < values.length; i++) {
			char letter = values[i];

			if (letter >= 'a' && letter <= 'z') {
				// Rotate lowercase letters.

				if (letter > 'm') {
					letter -= 13;
				} else {
					letter += 13;
				}
			} else if (letter >= 'A' && letter <= 'Z') {
				// Rotate uppercase letters.

				if (letter > 'M') {
					letter -= 13;
				} else {
					letter += 13;
				}
			}
			values[i] = letter;
		}
		// Convert array to a new String.
		return new String(values);
	}
}










