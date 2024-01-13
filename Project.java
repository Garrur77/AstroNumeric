import java.sql.SQLOutput;
import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        int r, sum = 0;
        System.out.println(        "               🕉️🙏Jai Shri Ganeshaya Namaha🕉️🙏        "       );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a your birth of day : ");
        int date = sc.nextInt();
        System.out.print("Enter a your birth of month : ");
        int month = sc.nextInt();
        System.out.print("Enter a your birth of year : ");
        int year = sc.nextInt();
        while(date>0)
        {
            r = date%10;
            sum = sum+r;
            date = date/10;
        }
        while(month > 0){
            sum = sum+month%10;
            month = month/10;
        }
        while(year > 0){
            sum = sum+year%10;
            year  = year/10;
        }
        int ans = 0;
        while(sum > 0){
            ans = ans+sum%10;
            sum  = sum/10;
        }
        System.out.println(ans);



        switch(ans){
            case 1 :
                System.out.println(" Your Lucky Job will be a  CEO , Team Leader , Businessman , Government Jobs , Managers , Sports ,Medical , Management Roles , Entrepreneur. Here You can apply once in Your Life ! ");
                break;
            case 2 :
                System.out.println(" Your Lucky Job will be a  Artist , Chef , Singer , Relationship, Coach , Public Relationship , Acting sales , HealthCare , Trainers , Spiritual Fields , Teaching, Designing , Liquid Business.  Here You can apply once in Your Life ! ");
                break;
            case 3 :
                System.out.println(" Your Lucky Job will be a  Training, Teaching, Occult, Public Speaking , Writers, RealState, Entertainment , Consulting , Counseling , glamour fields , Artistic Fields , Doctor. Here You can apply once in Your Life ! ");
                break;
            case 4 :
                System.out.println(" Your Lucky Job will be a Engineering, IT Fields,  Accounts, Finance , FMCG  , Astrology, Programming ,StockMarket , Army LegalFields , CA. Here You can apply once in Your Life ! ");
                break;
            case 5 :
                System.out.println(" Your Lucky Job will be a  Flight Attendants , Pilot, Travel related any job ,PublicSpeaking, Journalist, Lawyer, Marketing ,Business Owners , Advisors , ProductionLines , Management Roles. Here You can apply once in Your Life ! ");
                break;
            case 6 :
                System.out.println(" Your Lucky Job will be a Fashion Designer , Entertainment, Hospitality , Doctor , InteriorDesigner , Restaurant Owner  , Chef , Online Business , Influencers . Here You can apply once in Your Life ! ");
                break;
            case 7 :
                System.out.println("Your Lucky Job will be a Spiritual Fields , Researchers , Detective , Teaching , Ayurveda , Doctor , Art , Sports , Agriculture . Here You can apply once in Your Life ! ");
                break;
            case 8 :
                System.out.println(" Your Lucky Job will be a Banking, Govt Job ,Finance , Science , Law , Business , Trading Investor , Ecom , Manager , Admin , CA");
                break;
            case 9 :
                System.out.println(" Your Lucky Job will be a   Healers , Police , Business , Construction , Engineers, Real EState , Stock Market , Doctors , Sports Mining , NGO ");
                break;
            default :
                System.out.println("N/A");

        }
        System.out.println("God Bless You🙏 . Beleive in Your Luck and Your HardWork. ");

        System.out.println(" Reminder : The Calculations is based on your destiny number and since everyone's date of birth is unique. The may vary from person to person. Your complete date of birth will guide us better in determining your ideal profession" +
                "For more insights about yourself , you can book session . it is essential to know that we have control over our own lives . We can achieve anything we want through hard work belief in ourselves can achieve anything we want through " +
            "hard work , belief in ourselves, and using the law of attraction . The details above are just guide not the only option . Always be open to learning , exploring ang growing");



    }
}
