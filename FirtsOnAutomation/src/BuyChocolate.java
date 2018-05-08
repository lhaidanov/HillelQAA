public class BuyChocolate {
        public static void main(String[] args) {
            System.out.println(countChoc(22.5, 1.5, 3));
        }

    public static int countChoc(double cash, double price, int wraps){
        double choc1 = cash/price; //count of choc that could be purchase by cash
        double allWraps1 = cash/price; //count of wraps, that could be purchase by cash
        int choc = (int)choc1;
        int allWraps = (int)allWraps1;
        for (int i = allWraps; i >=wraps ; i-=wraps-1) {
            choc ++;
            allWraps-=wraps-1; // was changed 3 wraps to 1 choc, so was used 3 wraps and added 1 more (3-1)
        }
        return choc;
    }
    }
