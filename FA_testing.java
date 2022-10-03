/*
 *Ibrokhimbek Pulatov
 *Professor Talaga
 *CSCI 350
 *9/29/2022
 *DFA Encryption
 */



package hw4;

public class FA_testing {
	
	public static Boolean C(String in) {
		
		if(in.length() == 0)return true;
		if(in.charAt(0) == 'a') {
			return C(in.substring(1));
		}
		return false;
	}
	
	public static Boolean B(String in) {
	
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'b') {
			return C(in.substring(1));
		}	
		return false;
	}
	
	public static Boolean A(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return B(in.substring(1));
		}
		if(in.charAt(0) == 'z') {
			return C(in.substring(1));
		}
		return false;
	}


	public static Boolean fn1(String in) {
		return A(in);
	}
	
	public static Boolean DD(String in) {
		
		if(in.length() == 0)return true;
		if(in.charAt(0) == 'b') {
			return DD(in.substring(1));
		}
		return false;
	}
	
	public static Boolean CC(String in) {
		
		if(in.length() == 0)return true;
		if(in.charAt(0) == 'a') {
			return CC(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return BB(in.substring(1));
		}
		return false;
	}
	
	public static Boolean BB(String in) {
	
		if(in.length() == 0)return true;
		if(in.charAt(0) == 'b') {
			return DD(in.substring(1));
		}	
		return false;
	}
	
	public static Boolean AA(String in) {
		
		if(in.length() == 0)return true;
		if(in.charAt(0) == 'a') {
			return CC(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return BB(in.substring(1));
		}
		return false;
	}
	public static Boolean fn2(String in) {
			// Change me!
		return AA(in);
	}
	
public static Boolean EEE(String in) {
		
		if(in.length() == 0)return true;
		return false;
	}	
public static Boolean DDD(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return EEE(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return EEE(in.substring(1));
		}
		if(in.charAt(0) == 'c') {
			return EEE(in.substring(1));
		}
		return false;
	}	
public static Boolean CCC(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return DDD(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return DDD(in.substring(1));
		}
		if(in.charAt(0) == 'c') {
			return DDD(in.substring(1));
		}
		return false;
	}
	
	public static Boolean BBB(String in) {
	
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return CCC(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return CCC(in.substring(1));
		}
		if(in.charAt(0) == 'c') {
			return CCC(in.substring(1));
		}	
		return false;
	}
	
	public static Boolean AAA(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return BBB(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return BBB(in.substring(1));
		}
		if(in.charAt(0) == 'c') {
			return BBB(in.substring(1));
		}
		
		return false;
	}
		
	public static Boolean fn3(String in) {
			// Change me!
		return AAA(in);
	}
	
public static Boolean BBBB(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return AAAA(in.substring(1));
		}
		else if(in.charAt(0) == 'b') {
			return AAAA(in.substring(1));
		}
		else if(in.charAt(0) == 'c') {
			return AAAA(in.substring(1));
		}
		else if(in.charAt(0) == 'd') {
			return AAAA(in.substring(1));
		}
		return false;
	}
public static Boolean AAAA(String in) {
		
		if(in.length() == 0)return true;
		if(in.charAt(0) == 'a') {
			return BBBB(in.substring(1));
		}
		else if(in.charAt(0) == 'b') {
			return BBBB(in.substring(1));
		}
		else if(in.charAt(0) == 'c') {
			return BBBB(in.substring(1));
		}
		else if(in.charAt(0) == 'd') {
			return BBBB(in.substring(1));
		}
		return false;
	}
	public static Boolean fn4(String in) {
			// Change me!
		return AAAA(in);
	}

	public static Boolean Fifteen(String in) {
		
		if(in.length() == 0)return true;
		return false;
	}
	public static Boolean Frteen(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'b') {
			return Fifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean Thrteen(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Fifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean Twelve(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Fifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean Eleven(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Fifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean ExtraFifteen(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Fifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean ExtraEleven(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'b') {
			return ExtraFifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean Ten(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'b') {
			return Frteen(in.substring(1));
		}
		return false;
	}
public static Boolean ExtraThrteen(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Fifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean Nine(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Thrteen(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return ExtraThrteen(in.substring(1));
		}
		return false;
	}
	public static Boolean Eight(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Twelve(in.substring(1));
		}
		return false;
	}
	public static Boolean Seven(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Eleven(in.substring(1));
		}
		return false;
	}
	public static Boolean ExtraB(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'b') {
			return Fifteen(in.substring(1));
		}
		return false;
	}
	public static Boolean ExtraTen(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'b') {
			return ExtraB(in.substring(1));
		}
		return false;
	}
	public static Boolean Six(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Ten(in.substring(1));
		}
		if(in.charAt(0) == 'b') {
			return ExtraTen(in.substring(1));
		}
		return false;
	}
	public static Boolean Five(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Nine(in.substring(1));
		}
		 else if(in.charAt(0) == 'b') {
			return ExtraEleven(in.substring(1));
		}
		return false;
	}
	public static Boolean Four(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Seven(in.substring(1));
		}
		else if(in.charAt(0) == 'b') {
			return Eight(in.substring(1));
		}
		return false;
	}
	public static Boolean Three(String in) {
		
		if(in.length() == 0)return false;
		 if(in.charAt(0) == 'b') {
			return Six(in.substring(1));
		}
		return false;
	} 
	public static Boolean Two(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Four(in.substring(1));
		}
		else if(in.charAt(0) == 'b') {
			return Five(in.substring(1));
		}
		return false;
	}
	
	public static Boolean One(String in) {
		
		if(in.length() == 0)return false;
		if(in.charAt(0) == 'a') {
			return Two(in.substring(1));
		}
		else if(in.charAt(0) == 'b') {
			return Three(in.substring(1));
		}
		return false;
	}
	
	public static Boolean fn5(String in) {
			// Change me!
		return One(in);
	}
		
	public static void main(String[] args) {
			// Do whatever you want down here to develop your functions above.
		String a[] = {"aaaaaaaa","bbbbbbbb","aaaaabbbbb"};
			
		for(String sentance: a) {
			if(fn2(sentance)) {
				System.out.println(sentance + ": IN LANGUAGE");
			}else {
				System.out.println(sentance + ": NOT IN LANGUAGE");
			}
		}

	}

}
