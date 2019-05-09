public class FizzBuzz {

    public void CodilityChatham(int n){
        String test = "Test";
        String codility = "Codility";
        String coders = "Coders";

        for (int i = 1; i <= n; i++) {
            if(i % 30 == 0){
                System.out.println(codility+test+coders);
            }else if(i % 15 == 0){
                System.out.println(test+coders);
            }else if(i % 10 == 0){
                System.out.println(codility+coders);
            }else if(i % 6 == 0){
                System.out.println(codility+test);
            }else if(i % 5 == 0){
                System.out.println(coders);
            }else if(i % 3 == 0){
                System.out.println(test);
            }else if(i % 2 == 0){
                System.out.println(codility);
            }else{
                System.out.println(i);
            }
        }
    }
}
