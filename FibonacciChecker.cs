using System;

class Program
{
    static void Main(string[] args)
    {

        Console.Write("Informe um número: ");
        if (int.TryParse(Console.ReadLine(), out int numero))

        {
            if (VerificaFibonacci(numero))

            {

                Console.WriteLine($"{numero} pertence à sequência de Fibonacci.");

            }else{

                Console.WriteLine($"{numero} NÃO pertence à sequência de Fibonacci.");

            }
        }else{

            Console.WriteLine("Por favor, informe um número válido.");

        }
    }

    static bool VerificaFibonacci(int numero)

    {
        if (numero < 0) return false;

        int a = 0, b = 1;

        while (a < numero)
        {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == numero;
    }
}
