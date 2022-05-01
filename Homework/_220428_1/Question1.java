package _220428_1;

public class Question1 {
	
	public static void main(String[] args){
		String[] strArray = { "10" , "2a" };
		int value = 0;
		for(int i = 0; i <= 2; i++ ){ // numberformatException
			
    	try{
        	value = Integer.parseInt(strArray[i]); // numberformatException
        } catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("ArrayIndexOutOfBoundsException가 발생하였습니다. 인덱스 범위를 벗어났습니다.");
        } catch(NumberFormatException e) {
        	System.out.println("NumberFormatException이 발생하였습니다. 숫자로 입력해 주세요.");
        } finally {
        	System.out.println(value);
        }
    }
}

}
