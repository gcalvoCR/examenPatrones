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
		assertEquals("[ala, mia]", Arrays.toString(test2), "It didn't bring the right string");
	}

	@Test
	public void testRetornaLargaOrdenada() {

		String text1 = "casa pala casita casototota";
		String text2 = "casa mia cosa ala";

		String[] test1 = Analytics.masLarga(text1);
		String[] test2 = Analytics.masLarga(text2);

		assertEquals("[casototota]", Arrays.toString(test1), "It didn't bring the right string");
		assertEquals("[casa, cosa]", Arrays.toString(test2), "It didn't bring the right string");
	}

	@Test
	public void testRetornaCortaOrdenada() {

		String text1 = "casa pala casita casototota";
		String text2 = "casa mia cosa ala";

		String[] test1 = Analytics.masCorta(text1);
		String[] test2 = Analytics.masCorta(text2);

		assertEquals("[casa, pala]", Arrays.toString(test1), "It didn't bring the right string");
		assertEquals("[ala, mia]", Arrays.toString(test2), "It didn't bring the right string");
	}

	@Test
	public void testPrimeraMasLarga() {

		String text1 = "casa pal casita";
		String text2 = "casita casota mia cosa ala";

		String test1 = Analytics.primeraMasLarga(text1);
		String test2 = Analytics.primeraMasLarga(text2);

		assertEquals("casita", test1, "It didn't bring the right string");
		assertEquals("casita", test2, "It didn't bring the right string");
	}

}
