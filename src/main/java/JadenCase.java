public class JadenCase {

/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word.

Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

Note that the Java version expects a return value of null for an empty string or null.

*/

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")) {
            return null;
        }

        String[] s2 = phrase.split(" ");
        StringBuilder sent = new StringBuilder();
        for (int i = 0; i < s2.length; i++) {
            s2[i] = s2[i].substring(0, 1).toUpperCase() + s2[i].trim().substring(1);
            sent.append(s2[i]).append(" ");
        }

        return sent.toString().trim();
    }
}