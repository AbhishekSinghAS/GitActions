using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalcLibrary
{
    public class calculate
    {
        public double Sum(double a, double b)
        {
            return a + b;
        }

        public double Diff(double a, double b)
        {
            return a - b;
        }

        public double Mul(double a, double b)
        {
            return a * b;
        }

        public double Div(double a, double b)
        {
            if (b > 0)
            {
                return a / b;
            }
            else
            {
                return 0;
            }
        }
    }
}
