object Main {
  def main(args: Array[String]): Unit = {
    printf("Enter the text to Encrypt: ")
    var text: String = scala.io.StdIn.readLine();
    println("Encrypt or Decrypt(Press either 1 or 2): ")
    println("\t 1. Encrypt")
    println("\t 2. Decrypt")
    printf("Your Choice: ")
    var choice: Int = scala.io.StdIn.readInt()
    println("Processed text: " + cipher(text, choice))
  }

  // Encryption and Decryption functions of Caesar cipher with a shift 1
  def encrypt(a: Char): Char = a.toInt match {
    case x if x<122 && x>=97 =>(a + 1).toChar;
    case x if x<90 && x>=65 =>(a + 1).toChar;
    case 'z' => 'a';
    case 'Z' => 'A';
    case _ => a;
  }

  def decrypt(a: Char): Char = a.toInt match {
    case x if x <= 122 && x > 97 => (a - 1).toChar;
    case x if x <= 90 && x > 65 => (a - 1).toChar;
    case 'a' => 'z';
    case 'A' => 'Z';
    case _ => a;
  }
  def cipher(s: String, n: Int): String = n match
    {
    case 1 => s.map(encrypt)
    case 2 => s.map(decrypt)
    case _ => "Invalid Choice"
  }
}

