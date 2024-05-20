using com.Calculator.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace com.Calculator.Controllers
{
    public class MainController : Controller
    {
        // GET: Main
        public ActionResult Index()
        {
            return View(new calculate());
        }

        [HttpPost]

        public ActionResult Index(calculate Ans, string calculate)
        {
            if (calculate == "add")
            {
                try
                {
                    Ans.total = (Convert.ToDouble(Ans.num1) + Convert.ToDouble(Ans.num2)).ToString("0.00");
                }
                catch(Exception)
                {
                    Ans.total = "Only Numerals allowed";
                }
                
            }
            else if (calculate == "diff")
            {

                try
                {
                    Ans.total = (Convert.ToDouble(Ans.num1) - Convert.ToDouble(Ans.num2)).ToString("0.00");
                }
                catch (Exception)
                {
                    Ans.total = "Only Numerals allowed";
                }
            }
            else if (calculate == "mul")
            {
                try
                {
                    Ans.total = (Convert.ToDouble(Ans.num1) * Convert.ToDouble(Ans.num2)).ToString("0.00");
                }
                catch (Exception)
                {
                    Ans.total = "Only Numerals allowed";
                }
            }
            else
            {
                try
                {
                    double check1 = Convert.ToDouble(Ans.num1);
                    double check2 = Convert.ToDouble(Ans.num2);
               
                    if (check2 > 0)
                    {
                        Ans.total = (check1 / check2).ToString("0.00");
                    }
                    else
                    {
                        Ans.total = "Indeterminate Case";
                    }
                }
                catch (Exception)
                {
                    Ans.total = "Only Numerals allowed";
                }

            }
         

            return View(Ans);
        }


    }
}