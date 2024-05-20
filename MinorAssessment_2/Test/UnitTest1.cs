using Microsoft.VisualStudio.TestTools.UnitTesting;
using CalcLibrary;
using System;


namespace Test
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void checkSum()
        {
            calculate programValue = new calculate();
            for(double i = 0; i < 100; i=i+1)
            {
                for(double j = 0; j < 100; j=j+1)
                {
                    Assert.AreEqual(programValue.Sum(i,j), i + j);
                }
            }

        }


        [TestMethod]
        public void checkDiff()
        {
            calculate programValue = new calculate();
            for (double i = 0; i < 100; i = i + 1)
            {
                for (double j = 0; j < 100; j = j = j + 1)
                {
                    Assert.AreEqual(programValue.Diff(i,j), i - j);
                }
            }

        }


        [TestMethod]
        public void checkMul()
        {
            calculate programValue = new calculate();
            for (double i = 0; i < 100; i = i + 1)
            {
                for (double j = 0; j < 100; j = j = j + 1)
                {
                    Assert.AreEqual(programValue.Mul(i,j), i * j);
                }
            }

        }


        [TestMethod]
        public void checkDiv()
        {
            calculate programValue = new calculate();
            for (double i = 0; i < 100; i = i + 1)
            {
                for (double j = 0; j < 100; j = j = j + 1)
                {
                    if (j == 0)
                    {
                        Assert.AreEqual(programValue.Div(i, j), 0);

                    }
                    else {
                        Assert.AreEqual(programValue.Div(i, j), i / j);
                    }
                }
            }

        }
    }
}
