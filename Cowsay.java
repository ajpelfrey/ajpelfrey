import java.sql.SQLOutput;

public class Cowsay {

    public static void main(String[] args) {
        if (args[0].equals("-l")) {
            System.out.print("Regular cows available: ");
            listCows(HeiferGenerator.getCows());
            System.out.print("Regular cows available: ");
            listCows(HeiferGenerator.getFileCows());
        }

        if (args[0].equals("-n")) {
            Cow cows = findCow(args[1], HeiferGenerator.getCows());


            if (cows != null) {

                for (int i = 2; i < args.length; i++) {
                    System.out.print(args[i] + " ");

                }
                System.out.println();
                System.out.println(cows.getImage());
                if (cows instanceof Dragon) {
                    if (((Dragon) cows).canBreatheFire()) {
                        System.out.println("This dragon can breathe fire");
                    } else {

                        System.out.println("This dragon can breathe fire");
                    }


                }
            }


            if (cows == null) {
                {
                    System.out.println("Could not find " + args[1] + " cow!");
                }

            } else {

                for (int i = 2; i < args.length; i++) {
                    System.out.print(args[i] + " ");



                }


            }

        }

        if (args[0].equals("-f"))
        {

            Cow cows = FindNewCow(args[1], HeiferGenerator.getFileCows());

             /*   for (int i = 2; i < args.length; i++)
                {
                    System.out.print(args[i] + " ");
                    System.out.println(cows.getImage());
                }
                */
            System.out.print(args[1] + " ");
                    System.out.print( "hi ");
            System.out.println(cows.getImage());



                }


            }




//for


// else if

    public static Cow findCow(String name, Cow[] cows) {
        for (int i = 0; i < cows.length; i++) {
            if (cows[i].getName().equals(name)) {
                return cows[i];
            }
        }
        return null;
    }

    public static void listCows(Cow[] cows) {

        for (int i = 0; i < cows.length; i++) {
            System.out.print(cows[i].getName() + " ");

        }

        System.out.println();

    }

    public static Cow FindNewCow(String name, Cow[] Filecows) {

        {
            for (int i = 0; i < Filecows.length; i++) {
                if (Filecows[i].getName().equals(name)) {
                    return Filecows[i];
                }
            }
            return null;
        }
    }


        public static void listNewCows(Cow[] fileCows)
        {
            System.out.print("File cows available: ");
                System.out.print(fileCows);

            }
        }








