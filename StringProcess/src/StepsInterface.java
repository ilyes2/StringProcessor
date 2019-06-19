
public interface StepsInterface {

	default String methodDivisible(String s) {
		String res = "";
		int parsedInt = Integer.parseInt(s);
        if(parsedInt % 3 == 0) {
            res += "Foo";
        }
        if(parsedInt % 5 == 0) {
            res += "Bar";
        }
        if(parsedInt % 7 == 0) {
            res += "Qix";
        }
        return res;
	};
	String methodContains(String s);
	default String showResult(String s) {
		return this.methodContains(s);
	}
}
