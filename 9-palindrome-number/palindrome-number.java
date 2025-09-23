class Solution {
	public boolean isPalindrome(int x) {
		if(x<0) {
			return false;
		}
		String number = String.valueOf(x);
        int size = number.length();
		for(int i= 0; i<size/2; i++) {
			if(number.charAt(i)!=number.charAt(size-i-1)) {
				return false;
			}
		}
		return true;
	}
}
