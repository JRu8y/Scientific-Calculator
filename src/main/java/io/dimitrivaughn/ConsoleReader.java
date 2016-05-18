package io.dimitrivaughn;
import java.io.*;
import java.util.*;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class ConsoleReader {
    private static BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));


    public static int readInt ()
    {
        try
        {
            return Integer.parseInt(in.readLine());
        }
        catch (IOException e)
        {}
        catch (NumberFormatException e)
        {}

        return 0;
    }

    public static double readDouble ()
    {
        try
        {
            return (Double.valueOf(in.readLine())).doubleValue();
        }
        catch (IOException e)
        {}
        catch (NumberFormatException e)
        {}

        return 0;
    }

    public static String readString ()
    {
        try
        {
            return (new StringTokenizer(in.readLine())).nextToken();
        }
        catch (IOException e)
        {}

        return "";
    }

    public static String readLine ()
    {
        try
        {
            return in.readLine();
        }
        catch (IOException e)
        {}

        return "";
    }


    public static int promptInt (String prompt)
    {
        System.out.print(prompt);
        return readInt();
    }

    public static double promptDouble (String prompt)
    {
        System.out.print(prompt);
        return readDouble();
    }

    public static String promptString (String prompt)
    {
        System.out.print(prompt);
        return readString();
    }

    public static String promptLine (String prompt)
    {
        System.out.print(prompt);
        return readLine();
    }


    public static int promptRange (String prompt, int low, int hi)
    {
        int answer;

        do
        {
            answer = promptInt(prompt + " between " + low + " and " + hi + "? ");
        }
        while (low > answer || answer > hi);

        return answer;
    }

    public static double promptRange (String prompt, double low, double hi)
    {
        double answer;

        do
        {
            answer = promptDouble(prompt + " between " + low + " and " + hi + "? ");
        }
        while (low > answer || answer > hi);

        return answer;
    }

    public static boolean promptYesNo (String prompt)
    {
        String answer;

        do
        {
            answer = promptString(prompt + " (yes or no)? ");
        }
        while (!answer.equals("yes") && !answer.equals("no"));

        return (answer.equals("yes"));
    }


    public static String promptOneOf (String prompt, Set<String> choices)
    {
        String result;

        do
        {
            result = promptString(prompt + " on one of " + choices + "? ");
        }
        while (! choices.contains(result));

        return result;
    }
}
