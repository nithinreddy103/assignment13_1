object Ass12_3_2
{
  def gcd(a: Int,b: Int): Int = {
    if(b ==0) a else gcd(b, a%b)
  }

  def main(args: Array[String]) {
    println("The GCD of two numbers 16 and 28 are: " +gcd(16,28))
  }
}
