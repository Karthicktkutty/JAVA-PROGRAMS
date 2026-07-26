
class DounleQ {
	//1. Using Escape Characters

	String value = "\"toja\"";
	//System.out.println(value); // Output: "toja"

//	2. Using String.format(

	String word = "toja";
	String value1 = String.format("\"%s\"", word);
//	System.out.println(value); // Output: "toja"

	//3. Using String Concatenation

	String word1 = "toja";
	String value2 = "\"" + word + "\"";
	//System.out.println(value); // Output: "toja"
}
