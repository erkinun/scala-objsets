package objsets

object home3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  val empty = new Empty                           //> empty  : objsets.Empty = objsets.Empty@a45f686
  
  empty.filter(tw => tw.user == "a")              //> res0: objsets.TweetSet = objsets.Empty@247cf599
  
    val set1 = new Empty                          //> set1  : objsets.Empty = objsets.Empty@7e02286
    val elemA = new Tweet("a", "a body", 20)      //> elemA  : objsets.Tweet = User: a
                                                  //| Text: a body [20]
    val set2 = set1.incl(elemA)                   //> set2  : objsets.TweetSet = objsets.NonEmpty@7057737a
    val set3 = set2.incl(new Tweet("b", "b body", 23))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@7a8a44a6
    val c = new Tweet("c", "c body", 7)           //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [7]
    val d = new Tweet("d", "d body", 9)           //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
    val set4c = set3.incl(c)                      //> set4c  : objsets.TweetSet = objsets.NonEmpty@ba12d24
    val set4d = set3.incl(d)                      //> set4d  : objsets.TweetSet = objsets.NonEmpty@29a9c73
    val set5 = set4c.incl(d)                      //> set5  : objsets.TweetSet = objsets.NonEmpty@7495435a

set5.mostRetweeted                                //> res1: objsets.Tweet = User: b
                                                  //| Text: b body [23]

val list = set5.descendingByRetweet               //> order: 23
                                                  //| order: 20
                                                  //| order: 9
                                                  //| order: 7
                                                  //| list  : objsets.TweetList = objsets.Cons@1b8acf07
list.foreach(tweet => println(tweet.text))        //> c body
                                                  //| d body
                                                  //| a body
                                                  //| b body
  
}