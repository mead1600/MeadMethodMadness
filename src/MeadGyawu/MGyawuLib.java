package MeadGyawu;

public class MGyawuLib {
    public static String dateStr(String str)
    {
        String month = str.substring(0,2);
        String day = str.substring(3,5);
        String year = str.substring(6);
        return day + "-" + month + "-" + year;
    }
    public static Boolean isPalindrome(String str)
    {
        String reverse = "";
        for(int a = str.length() -1 ; a > -1 ; a--)
        {
            reverse = reverse + str.substring( a, a + 1 );
        }
        if(str.equals(reverse))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isFibonnaci(int a)
    {
        int currentNum = 1;
        int PastNum = 0;
        while(a > currentNum)
        {
            currentNum = currentNum + PastNum;
            PastNum = currentNum - PastNum;
        }
        if(a == currentNum || a == PastNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int sumUpTo(int a)
    {
        int sum = 0;
        for(int b = 0; b < a; b++)
        {
            sum = sum + b;
        }
        return sum + a;
    }
    public static String multiplicationTable(int base, int range)
    {
        String table = "";
        for(int counter = 0; counter < range + 1; counter++)
        {
            table = table + " " + base*counter + "";
        }
        return table;
    }
}
