public class PhraseOMatic
{
  public static void main(String[] args)
  {
    String[] wordListOne={"Linux","Watch","Pen","Copy","Book","Goku","Naruto"};
    String wordListTwo[]={"Porn","Sex","Fuck","Lust","69","BDSM","Milf"};
    String[] wordListThree={"Red","Blue","Azure","Cyan","Tint","Rose","Grey","Yellow"};

    int oneLength=wordListOne.length;
    int twoLength=wordListTwo.length;
    int threeLength=wordListThree.length;

    int rand1=(int)(Math.random()*oneLength);
    int rand2=(int)(Math.random()*twoLength);
    int rand3=(int)(Math.random()*threeLength);

    String phrase=wordListOne[rand1]+" "+wordListThree[rand3]+" "+wordListTwo[rand2];
    System.out.println("What we need is "+phrase);
  }
}
