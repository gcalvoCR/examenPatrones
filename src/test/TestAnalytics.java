package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.Analytics;

public class TestAnalytics {

	@Test
	public void testMasLarga() {

		String text1 = "casa casita casototota";
		String text2 = "casa casita casota";

		String[] test1 = Analytics.masLarga(text1);
		String[] test2 = Analytics.masLarga(text2);

		assertEquals("[casototota]", Arrays.toString(test1), "It didn't bring the right string");
		assertEquals("[casita, casota]", Arrays.toString(test2), "It didn't bring the right string");
	}

	@Test
	public void testMasCorta() {

		String text1 = "casa casita casototota";
		String text2 = "casa mia cosa ala";

		String[] test1 = Analytics.masCorta(text1);
		String[] test2 = Analytics.masCorta(text2);

		assertEquals("[casa]", Arrays.toString(test1), "It didn't bring the right string");
		assertEquals("[mia, ala]", Arrays.toString(test2), "It didn't bring the right string");
	}

}
