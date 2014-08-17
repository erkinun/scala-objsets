package objsets

object home3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(30); 
  
  
  val empty = new Empty;System.out.println("""empty  : objsets.Empty = """ + $show(empty ));$skip(40); val res$0 = 
  
  empty.filter(tw => tw.user == "a");System.out.println("""res0: objsets.TweetSet = """ + $show(res$0));$skip(28); 
  
    val set1 = new Empty;System.out.println("""set1  : objsets.Empty = """ + $show(set1 ));$skip(45); 
    val elemA = new Tweet("a", "a body", 20);System.out.println("""elemA  : objsets.Tweet = """ + $show(elemA ));$skip(32); 
    val set2 = set1.incl(elemA);System.out.println("""set2  : objsets.TweetSet = """ + $show(set2 ));$skip(55); 
    val set3 = set2.incl(new Tweet("b", "b body", 23));System.out.println("""set3  : objsets.TweetSet = """ + $show(set3 ));$skip(40); 
    val c = new Tweet("c", "c body", 7);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(40); 
    val d = new Tweet("d", "d body", 9);System.out.println("""d  : objsets.Tweet = """ + $show(d ));$skip(29); 
    val set4c = set3.incl(c);System.out.println("""set4c  : objsets.TweetSet = """ + $show(set4c ));$skip(29); 
    val set4d = set3.incl(d);System.out.println("""set4d  : objsets.TweetSet = """ + $show(set4d ));$skip(29); 
    val set5 = set4c.incl(d);System.out.println("""set5  : objsets.TweetSet = """ + $show(set5 ));$skip(20); val res$1 = 

set5.mostRetweeted;System.out.println("""res1: objsets.Tweet = """ + $show(res$1));$skip(37); 

val list = set5.descendingByRetweet;System.out.println("""list  : objsets.TweetList = """ + $show(list ));$skip(43); 
list.foreach(tweet => println(tweet.text))}
  
}
