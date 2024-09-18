using System;

class Program
{
    static void Main(string[] args)

    {

        Console.Write("Informe uma string: ");
        string input = Console.ReadLine();

        int contagem = ContarLetrasA(input);

        if (contagem > 0)

        {

            Console.WriteLine($"A letra 'a' (ou 'A') aparece {contagem} vez(es) na string.");

        }else{

            Console.WriteLine("A letra 'a' (ou 'A') não aparece na string.");

        }
    }

    static int ContarLetrasA(string str)
    {
        int contagem = 0;

        foreach (char c in str)
        {
            if (c == 'a' || c == 'A')
            {
                contagem++;
            }
        }

        return contagem;
    }
}
