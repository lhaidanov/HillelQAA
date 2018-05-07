public class BuyChocolate {
        public static void main(String[] args) {
            System.out.println(countChoc(15, 1, 3));
        }

    public static int countChoc(int cash, int price, int wraps){
        int choc = cash/price; //count of choc that could be purchase by cash
        int allWraps = cash/price; //count of wraps, that could be purchase by cash
        for (int i = allWraps; i >=3 ; i-=2) {
            choc ++;
            allWraps-=2;
        }
        return choc;
    }
    }
