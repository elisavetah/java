
/**
 * System of Equations lock that well aggravates math class!
 * 
 * @author S.a.m. M. 
 * @version MAY 7, 2015
 */
 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lock
{
    // instance variables - replace the example below with your own
   public static void main(String[] args) {
       Scanner user_input = new Scanner (System.in);
       
    System.out.println("+------------------------------------------+");
    System.out.println("|  Submit Twenty Values Plz, Danks ~ Slay  |");
    System.out.println("+------------------------------------------+");  
       
       System.out.print("Enter the first number: ");
       double num_a = user_input.nextInt();
    
       System.out.print("Enter the second number: ");
       double num_b = user_input.nextInt();
       
       System.out.print("Enter the third number: ");
       double num_c = user_input.nextInt();
       
       System.out.print("Enter the fourth number: ");
       double num_d = user_input.nextInt();;
       
       System.out.print("Enter the fifth number: ");
       double num_e = user_input.nextInt();
       
       System.out.print("Enter the sixth number: ");
       double num_f = user_input.nextInt();;
       
       System.out.print("Enter the seventh number: ");
       double num_g = user_input.nextInt();

       System.out.print("Enter the eigth number: ");
       double num_h = user_input.nextInt();
       
       System.out.print("Enter the ninth number: ");
       double num_i = user_input.nextInt();
       
       System.out.print("Enter the tenth number: ");
       double num_j = user_input.nextInt();
       
       System.out.print("Enter the eleventh number: ");
       double num_k = user_input.nextInt();
     
       System.out.print("Enter the twetlth number: ");
       double num_l = user_input.nextInt();
 
       System.out.print("Enter the thirteenth number: ");
       double num_m = user_input.nextInt();
       
       System.out.print("Enter the fourteenth number: ");
       double num_n = user_input.nextInt();
      
       System.out.print("Enter the fifteenth number: ");
       double num_o = user_input.nextInt();
       
       System.out.print("Enter the sixteenth number: ");
       double num_p = user_input.nextInt();
    
       System.out.print("Enter the seventeenth number: ");
       double num_q = user_input.nextInt();
       
       System.out.print("Enter the eighteenth number: ");
       double num_r = user_input.nextInt();
       
       System.out.print("Enter the nineteenth number: ");
       double num_s = user_input.nextInt();
       
       System.out.print("Enter the twentieth number: ");
       double num_t = user_input.nextInt();
    
    System.out.println("+------------------------------------------+");
    System.out.println("|  The Equation as typed in by user input  |");
    System.out.println("+------------------------------------------+"); 
    System.out.println(num_a + "s + " + num_b + "a + " + num_c + "f + " + num_d + "e = " + num_e);
    System.out.println(num_f + "s + " + num_g + "a + " + num_h + "f + " + num_i + "e = " + num_j);
    System.out.println(num_k + "s + " + num_l + "a + " + num_m + "f + " + num_n + "e = " + num_o);      
    System.out.println(num_p + "s + " + num_q + "a + " + num_r + "f + " + num_s + "e = " + num_t);
    
    
    System.out.println("+------------------------------------------+");
    System.out.println("|  De Equation in de firstz substitutionz  |");
    System.out.println("+------------------------------------------+"); 
    
    System.out.println(num_a + "s + " + num_b + "a + " + num_c + "f + " + num_d + "[(" + num_t + " " + num_p + "s + " + num_q + "a " + num_r + "f) / " + num_s + "] =" + num_e);
    System.out.println(num_f + "s + " + num_g + "a + " + num_h + "f + " + num_i + "[(" + num_t + " " + num_p + "s + " + num_q + "a " + num_r + "f) / " + num_s + "] =" + num_j);  
    System.out.println(num_k + "s + " + num_l + "a + " + num_m + "f + " + num_n + "[(" + num_t + " " + num_p + "s + " + num_q + "a " + num_r + "f) / " + num_s + "] =" + num_o);
    
    // This creates the first substitution.
    // sub TS--- this is the = value for the fourth equation
    double t = num_t;
    double s = num_s;
    double num_ts = (t / s);
    // sub PS--- this is the s value for the fourth equation
    double p = num_p;
    double num_ps = (p / s);
    // sub QS--- this is the a value for the fourth equation
    double q = num_q;
    double num_qs = (q / s);
    // sub RS--- this is the f value for the fourth equation
    double r = num_r;
    double num_rs = (r / s);
    
    // This is the Fourth equation being substituted into the First Equation
    // This is num_d mutlipled by num_ts, num_ps, num_qs, and num_rs
    double d = num_d;
    // multiplication ts
    double ts = num_ts;
    double dts = (d * ts);
    // multiplication ps
    double ps = num_ps;
    double dps = (d * ps);
    // multiplcation qs
    double qs = num_qs;
    double dqs = (d * qs);
    // multiplcation rs
    double rs = num_rs;
    double drs = (d * rs);
    
    // This is the Fourth Equation being substituted into the Second Equation
    // This is num_i multiplied by num_ts, num_ps, num_qs, and num_rs
    double i = num_i;
    // multiplecation ts
    double its = (i * ts);
    // multiplecation ps
    double ips = (i * ps);
    // multiplecation qs
    double iqs = (i * qs);
    // multiplecation rs
    double irs = (i * rs);
    
    // This is the Fourth Equation being substituted into the Third Equation
    // This is num_n multiplied by num_ts, num_ps, num_qs, and num_rs
    double n = num_n;
    // multiplecation ts
    double nts = (n * ts);
    // multiplecation ps
    double nps = (n * ps);
    // multiplecation qs
    double nqs = (n * qs);
    // multiplecation rs
    double nrs = (n * rs);
    
    System.out.println("+------------------------------------------+");
    System.out.println("|   Lots of little numbers to cry over!!   |");
    System.out.println("+------------------------------------------+"); 
    System.out.println(num_a + "s + " + num_b + "a + " + num_c + "f + " + dts + " + " + dps + "s + " + dqs + "a " + drs + "f = " + num_e);
    System.out.println(num_f + "s + " + num_g + "a + " + num_h + "f + " + its + " + " + ips + "s + " + iqs + "a " + irs + "f = " + num_j);
    System.out.println(num_k + "s + " + num_l + "a + " + num_m + "f + " + nts + " + " + nps + "s + " + nqs + "a " + nrs + "f = " + num_o);

    // First Equation First Letter
double a = num_a;
double adps = (a + dps);
    // First Equation Second Letter
double b = num_b; 
double bdqs = (b + dqs);
    // First Equation Third Letter
double c = num_c;
double cdrs = (c + drs);
    // First Equation Numbers
double e = num_e;
double edts = (e - dts);

    // Second Equation First Letter
double f = num_f;
double fips = (f + ips);
    // Second Equation Second Letter
double g = num_g;
double giqs = (g + iqs);
    // Second Equation Third Letter
double h = num_h;
double hirs = (h + irs);
    // Second Equation Numbers
double j = num_j;
double jits = (j + its);

    //Third Equation Fist Letter
double k = num_k;
double knps = (k + nps);
    // Third Equation Second Letter
double l = num_l;
double lnqs = (l + nqs);
    // Third Equation Third Letter
double m = num_m;
double mnrs = (m + nrs);
    // Third Equation Numbers
double o = num_o;
double onts = (o + nts);

    System.out.println("+------------------------------------------+");
    System.out.println("|      Prepare to divide the Booty!!       |");
    System.out.println("+------------------------------------------+"); 
    
    DecimalFormat eq = new DecimalFormat("##.00");
    System.out.println(eq.format(adps) + "s + " + eq.format(bdqs) + "a + " + eq.format(cdrs) + "f = " + eq.format(edts));
    System.out.println(eq.format(fips) + "s + " + eq.format(giqs) + "a + " + eq.format(hirs) + "f = " + eq.format(jits));
    System.out.println(eq.format(knps) + "s + " + eq.format(lnqs) + "a + " + eq.format(mnrs) + "f = " + eq.format(onts));

    System.out.println("+------------------------------------------+");
    System.out.println("|      Prepare to make grown men cry!!     |");
    System.out.println("+------------------------------------------+"); 
    
    // This is where the math becomes important
    // Prepare to make grown men cry...
    // First Multiplecation One = fmone
    // IF THE first value is larger than the first value in the second equation
     if(adps > fips) {
        double fmone = (adps / fips);
        double fmonefips = (fips * fmone);
        double fmonegiqs = (giqs * fmone);
        double fmonehirs = (hirs * fmone);
        double fmonejits = (jits * fmone);
        
        // Print first line
            System.out.println(eq.format(adps) + "s + " + eq.format(bdqs) + "a + " + eq.format(cdrs) + "f = " + eq.format(edts));
        // Print second, changed line
            System.out.println(eq.format(fmonefips) + "s + " + eq.format(fmonegiqs) + "a + " + eq.format(fmonehirs) + "f = " + eq.format(fmonejits));
    
        // Make sure you calculate how much you want to remove from the national debt with this!
        // For real though: Subtract them numbahs!!!
        double bdqsgiqs = (bdqs - fmonegiqs);
        double cdrshirs = (cdrs - fmonehirs);
        double edtsjits = (edts - fmonejits);
        
        // Now put those numbahs into a two letter equation!
            System.out.println("+------------------------------------------+");
            System.out.println("|   God killed kittens cuz of this part!   |");
            System.out.println("+------------------------------------------+"); 
            
        System.out.println(eq.format(bdqsgiqs) + "a + " + eq.format(cdrshirs) + "f = " + eq.format(edtsjits));
        
        // If adps is larger than knps, start the two letter portion by making knps multiplied.
        if(adps > knps) {
            double fmtwo = (adps / knps);
            double fmtwoknps = (knps * fmtwo);
            double fmtwolnqs = (lnqs * fmtwo);
            double fmtwomnrs = (mnrs * fmtwo);
            double fmtwoonts = (onts * fmtwo);
            // These are the valus for the second two letter equation.
            double bdqslnqs = (bdqs - fmtwolnqs);
            double cdrsmnrs = (cdrs - fmtwomnrs);
            double edtsonts = (edts - fmtwoonts);
           System.out.println(eq.format(bdqslnqs) + "a + " + eq.format(cdrsmnrs) + "f = " + eq.format(edtsonts));
        }
        
        // This is if knps is larger than adps.
        else if(adps < knps) {
            double fmtwo = (knps / adps);
            double fmtwoadps = (adps * fmtwo);
            double fmtwobdqs = (bdqs * fmtwo);
            double fmtwocdrs = (cdrs * fmtwo);
            double fmtwoedts = (edts * fmtwo);
            
            // Subtraction 
            // ...two marks the second tier
            double bdqslnqstwo = (lnqs - fmtwobdqs);
            double cdrsmnrstwo = (mnrs - fmtwocdrs);
            double edtsontstwo = (onts - fmtwoedts);
            System.out.println(eq.format(bdqslnqstwo) + "a + " + eq.format(cdrsmnrstwo) + "f = " + eq.format(edtsontstwo));
        }
     }
     
     //SECOND ROUTE TO SOLVING
     // If the first value in the second equation is larger than the first value in the first equation.
     else if(adps < fips) {
        double fmone = (fips / adps);
        System.out.println(eq.format(fmone));
        double fmoneadps = (adps * fmone);
        double fmonebdqs = (bdqs * fmone);
        double fmonecdrs = (cdrs * fmone);
        double fmoneedts = (edts * fmone);
        
        // Print first, changed line
            System.out.println(eq.format(fmoneadps) + "s + " + eq.format(fmonebdqs) + "a + " + eq.format(fmonecdrs) + "f = " + eq.format(fmoneedts));
        // Print second line
            System.out.println(eq.format(fips) + "s + " + eq.format(giqs) + "a + " + eq.format(hirs) + "f = " + eq.format(jits));
  
            
     }  
    

    
}
        
   
        
    }

 

