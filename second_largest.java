public class second_largest{
    public static void main(String[] args) {
        int[] arr = {10, 25, 4, 30, 22, 15};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int num:arr){
        if(num>largest)
        {
            second_largest=largest;
              largest=num;
        }
        else if(num<largest&&num>second_largest)
        {
            second_largest=num;

        }
    }
        if(second_largest==Integer.MIN_VALUE)
        {
            System.out.print("no second number");
            return;

        }
        System.out.print(largest);
        System.out.println(second_largest);


    }
}
