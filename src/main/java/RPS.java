public class RPS {

    public char getWinner(String input){
        if(input.equalsIgnoreCase("Rock")){
            return 'S';
        } else if (input.equalsIgnoreCase("Scissors")) {
            return 'P';
        }else if(input.equalsIgnoreCase("Paper")){
            return 'R';
        }
        return 'X';
    }

    public char getTie(String input){
        if(input.equalsIgnoreCase("Rock")){
            return 'R';
        } else if (input.equalsIgnoreCase("Scissors")) {
            return 'S';
        }else if(input.equalsIgnoreCase("Paper")){
            return 'P';
        }
        return 'X';
    }




    public int RPS(String rps, String input){
        char[] arr = rps.toCharArray();
        char winner = getWinner(input);
        char tie = getTie(input);
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if(winner == arr[i]){
                total += 2;
            }else if(arr[i] == tie){
                total++;
            }
        }
        return total;
    }

    public char winningSign(char rps){
        if(rps == 'R'){
            return 'S';
        }else if(rps == 'P'){
            return 'R';
        }else if(rps == 'S'){
            return 'P';
        }
        return 'X';
    }


    public int getWinner(char[] game){
        char[] rps = {'R', 'P', 'S'};
        int points = 0;

        for(char c : rps){
            int temp = 0;
            for(int i = 0; i < game.length; i++){
                if(game[i] == winningSign(c)){
                    temp += 2;
                }else if(game[i] == c){
                    temp++;
                }
            }
            if(temp > points){
                points = temp;
            }
        }
        return points;
    }

    public int solution(String G) {
        // write your code in Java SE 8
        char[] rps = G.toCharArray();
        return getWinner(rps);
    }

}
