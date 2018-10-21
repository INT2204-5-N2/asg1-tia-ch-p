
package dictionary;

/**
 *
 * @author Tu Nguyen
 */
public class Word {

        private String word;
	private String mean;
	public Word(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
    
}
