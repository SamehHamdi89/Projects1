import 'package:flutter/material.dart';
import 'package:untitled2finalproject/FantasyCateg/OpenBookHome.dart';
import 'package:untitled2finalproject/HistoryCateg/OpenBook4Home.dart';
import 'package:untitled2finalproject/storage/bookstorage.dart';

List fan = ['assets/history1.jpg','assets/history2.jpg','assets/history3.jpg'];
List booknames = ['World History\n',];
List Authors = ['Usborne \n',];
List dates = ['Book - 1998 \n',];

List all = [
  bookStorage('assets/history1.jpg.jpg', 'The Darkling Bride \n',
      'by Andersen, Laura \n', 'Book - 2018 \n')
];
class history extends StatefulWidget {
  @override
  _historyState createState() => _historyState();
}

class _historyState extends State<history> {
  Icon i = Icon(Icons.favorite_border);
  int count = 0;
  bool Fav = false;
  @override
  Widget build(BuildContext context) {
    return Container(
      child: ListView(
        children: [
          Card(
            color: Colors.grey[500],
            margin: EdgeInsets.fromLTRB(0, 10, 0, 0),
            elevation: 0,
            child: Column(
              children: [
                Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'Great History Series',
                    style: TextStyle(
                      fontSize: 30,
                      letterSpacing: 1,
                    ),
                  ),
                ),
                Text(
                  'According to the Romance Writers of America, "Two basic elements comprise every romance novel: a central love story and an emotionally-satisfying and optimistic ending." Both the conflict and the climax of the novel should be directly related to that core theme of developing a romantic relationship, although the novel can also contain subplots that do not specifically relate to the main characters romantic love. ',
                  style: TextStyle(
                    letterSpacing: 2,
                    fontSize: 15,
                  ),
                )
              ],
            ),
          ),
          Card(
            color: Color(int.parse("0xFFBCEBFF")),
            margin: EdgeInsets.fromLTRB(0, 10, 0, 10),
            elevation: 0,
            child: Row(
              children: [
                Align(
                  alignment: Alignment.topLeft,
                  child: Image.asset(fan[count],
                    scale: 4,
                  ),
                ),
                Container(
                  alignment: Alignment.topLeft,
                  padding: EdgeInsets.fromLTRB(20, 0, 0, 70),
                  child: Column(
                    children: [
                      Text(
                        booknames[count],
                        style: TextStyle(
                            fontSize: 25,
                            fontWeight: FontWeight.bold,
                            letterSpacing: 1
                        ),
                      ),
                      Text(Authors[count]),
                      Text(dates[count]),
                      FlatButton(
                        padding: EdgeInsets.all(15),
                        onPressed: (){
                          Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => openbookhome4()));
                        },
                        child: Text('Open Book'),
                        color: Color(int.parse("0xFF1BA1E2")),
                      ),
                      FlatButton.icon(
                        padding: EdgeInsets.fromLTRB(200, 0, 0, 0),
                        onPressed: (){
                          setState(() {
                            Fav = !Fav;
                            if(Fav == true)
                              i = Icon(Icons.favorite);
                            else
                              i = Icon(Icons.favorite_border);
                          });
                        },
                        icon: i,
                        label: Text(''),
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}

