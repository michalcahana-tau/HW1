public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
      for (int i = 0; i < Integer.parseInt(args[0]); i++){ // for i in range(int(args[0]))
            double denom = (2*i)+1; //1,3,5,7... 
            double summant =  Math.pow((-1),i) * (1.0/denom);
            approxPi = approxPi + summant
        ;}
        approxPi = 4 * approxPi;
        System.out.println(approxPi + " " + actualPi);
    }
}
