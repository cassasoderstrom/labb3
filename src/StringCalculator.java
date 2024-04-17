
public class StringCalculator {

    public int add(String numbers){

        String[] numbersArray;
        if(numbers.isEmpty()){
            return 0;
        }
        if(numbers.contains("//")){

            String separator = numbers.charAt(2) + "";
            numbers = numbers.substring(4);
            numbersArray = numbers.split(separator);
        }
        else{
            numbersArray = numbers.split("[,\n]");
        }

        int sum = 0;

        for (String number : numbersArray) {
            if (Integer.parseInt(number) < 0) {
                throw new RuntimeException("Negatives not allowed "+number);
            }
            sum += Integer.parseInt(number.trim());
        }
        return sum;

    }
}