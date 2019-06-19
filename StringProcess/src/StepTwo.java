
public class StepTwo implements StepsInterface {

	@Override
	public String methodContains(String s) {
		String res = this.methodDivisible(s);
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '3')
                res += "Foo";
            if(c == '5')
                res += "Bar";
            if(c == '7')
                res += "Qix";
            if(c == '0')
                res += "*";
        }
        return res.isEmpty() ? s : res;
	}

}
