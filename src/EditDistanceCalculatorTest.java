import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Zhenlei Huang
 */
public class EditDistanceCalculatorTest {

	@Test
	public void testDistanceZero() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String s = "Hello World!";

		assertEquals(0, calculator.distance(s, s));
	}

	@Test
	public void testDistanceWithDifference() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String a = "Hello World!";
		String b = "Hallo woeld!";

		assertEquals(3, calculator.distance(a, b));
	}

	@Test
	public void testDistanceWithDifference2() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String a = "abcde";
		String b = "fghijk";

		assertEquals(6, calculator.distance(a, b));
	}

	@Test
	public void testDistanceWithDifferentLength() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String a = "Hello World!";
		String b = a + " some other thing!";

		assertEquals(18, calculator.distance(a, b));
	}

	@Test
	public void testCorrect() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String a = "Hello World!";
		String b = a + " some other thing!";

		System.out.println(calculator.correct(a, b));
	}

	@Test
	public void testCorrect2() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String a = "Hello World!";
		String b = "Hallo woeld!";

		System.out.println(calculator.correct(a, b));
	}

	@Test
	public void testCorrect3() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String a = "Hello";
		String b = "Woeld abc foo!";

		System.out.println(calculator.correct(a, b));
	}

	@Test
	public void testPerformance() {
		EditDistanceCalculator calculator = new EditDistanceCalculator();

		String a = "I spent the Fall quarter (of 1950) at RAND. My first task was to find a name for multistage decision processes. An interesting question is, Where did the name, dynamic programming, come from? The 1950s were not good years for mathematical research. We had a very interesting gentleman in Washington named Wilson. He was Secretary of Defense, and he actually had a pathological fear and hatred of the word research. I’m not using the term lightly; I’m using it precisely. His face would suffuse, he would turn red, and he would get violent if people used the term research in his presence. You can imagine how he felt, then, about the term mathematical. The RAND Corporation was employed by the Air Force, and the Air Force had Wilson as its boss, essentially. Hence, I felt I had to do something to shield Wilson and the Air Force from the fact that I was really doing mathematics inside the RAND Corporation. What title, what name, could I choose? In the first place I was interested in planning, in decision making, in thinking. But planning, is not a good word for various reasons. I decided therefore to use the word “programming”. I wanted to get across the idea that this was dynamic, this was multistage, this was time-varying. I thought, let's kill two birds with one stone. Let's take a word that has an absolutely precise meaning, namely dynamic, in the classical physical sense. It also has a very interesting property as an adjective, and that is it's impossible to use the word dynamic in a pejorative sense. Try thinking of some combination that will possibly give it a pejorative meaning. It's impossible. Thus, I thought dynamic programming was a good name. It was something not even a Congressman could object to. So I used it as an umbrella for my activities.";
		//String b = a.replace('i', 'o');
		String b = a.replace('q', '1');

		System.out.println(calculator.correct(a, b));
	}
}
