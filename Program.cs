using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            string inputRepeat = "yes";
            int intSecondNumb;
            int intFirstNumb;
            int result = 0;
            while (inputRepeat == "yes")
            {
                Console.WriteLine("Please input first number");
                string strFirstNumb = Console.ReadLine();
                while (int.TryParse(strFirstNumb, out intFirstNumb) != true)
                {
                    Console.WriteLine("First number is incorrect,please input it again");
                    strFirstNumb = Console.ReadLine();
                }


                Console.WriteLine("Please input operation + - * /");
                string strOperation = Console.ReadLine();
                while (strOperation != "+" & strOperation != "-" & strOperation != "/" & strOperation != "*")
                {
                    Console.WriteLine("Operation is incorrect,please input it again");
                    strOperation = Console.ReadLine();
                }
                Console.WriteLine("Please input second number");
                string strSecondNumb = Console.ReadLine();
                while (int.TryParse(strSecondNumb, out intSecondNumb) != true)
                {
                    Console.WriteLine("Second number is incorrect,please input it again");
                    strSecondNumb = Console.ReadLine();
                }
                if (intSecondNumb == 0 & strOperation == "/")
                {

                    Console.WriteLine("Error!Division by zero.Press any key to finish");
                  Console.ReadLine();
                    break; }

                switch (strOperation)
                {
                    case "+": result = intFirstNumb + intSecondNumb; break;
                    case "-": result = intFirstNumb - intSecondNumb; break;
                    case "*": result = intFirstNumb * intSecondNumb; break;
                    case "/": result = intFirstNumb / intSecondNumb; break;

                }
                Console.WriteLine(intFirstNumb + strOperation + intSecondNumb + "=" + result);
                Console.WriteLine("Do you want to continue calculations? yes/no");
                inputRepeat = Console.ReadLine();


            }


        }
    }

}

