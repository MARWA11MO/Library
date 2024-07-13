namespace lab1_c_
{
    internal class Program
    {
        static void Main(string[] args)
        {   

            Console.Write("enter your name: ");
            string name=Console.ReadLine();
            Console.Write("enter your id : ");
            int id = int.Parse(Console.ReadLine());
            Console.Write("enter your age: ");
           int age;
            do
            {
                Console.Write("enter your age: ");
                age = int.Parse(Console.ReadLine());

            } while (age < 0);
            
           Console.WriteLine($"data for employee name : {name} \n  id: {id}  \n  age : {age}   ");
                  



        }
    }
}
