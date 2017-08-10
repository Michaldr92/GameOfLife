public class Pattern {

	private String name;
	private String[] pattern;

	/**
	 * Handle patterns
	 */

	void setName(String nazwa) {
		this.name = nazwa;
	}
	
	public String getName() {
		return name;
	}

	public String[] getPattern() {
		return pattern;
	}

	public void setPattern(String[] modelPattern) {
		this.pattern = modelPattern;
	}

	public Pattern(String nazwa, String[] modelPattern) {
		this.name = nazwa;
		this.pattern = modelPattern;
	}

	public String toString() {
		return name;
	}

	//Pattern load 
	public static Pattern[] setPattern() {
		Pattern[] pattern = new Pattern[1];
		pattern[0] = new Pattern("Worm", new String[] { "0#0", "0##", "#0#" });
		return pattern;
	}
}