import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] mångaHeltal = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // Skapa arrayen
        skrivUtSiffror(mångaHeltal);
        // Skriv ut alla talen - Ref. till privata metod; SkrivutSiffror + skriv ut relaterat ifrån samma metod.

        System.out.println("Summan av alla talen är: " + Addera(mångaHeltal));
        // Beräkna summan av alla talen - Ref. till privata metod; Addera + skriv ut

    }
    private static void skrivUtSiffror(int[] numbers)
    // Skriv ut alla talen, Ref. upp till public klass - skrivUtsiffror /private
    {
        System.out.print("Heltalen i arrayen är: ");
        for (int number : numbers) {  // ... Läs som: "För varje int number, i arrayen kallad numbers" ...
            //Skapa en loop i array
            System.out.print(number + " :D "); //Skriver ut hela number + ev text som skall separera, mellan Int:arna
        }
        System.out.println();
    }

    private static int Addera(int[] mångaHeltal)
    // Adderar samtliga heltal till ett, och skickar upp till Public-klass igen
        {
        int sum = 0;
        for (int number : mångaHeltal) { // ... Läs som: "För varje int number, i arrayen kallad mångaHeltal" ...
            sum += number;               //summan + det som kommer ut av number ovanför.
        }
            return sum;    //returnerar värdet klart i "Addera" som sedan skickar upp det till "...out.print(number)".
                           // sedan huvudklassen public längst upp
        }


}
