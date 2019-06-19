
public class StepOne implements StepsInterface {

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
        }
        return res.isEmpty() ? s : res;
	}

}
