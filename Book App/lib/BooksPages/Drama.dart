import 'package:flutter/material.dart';
import 'package:untitled2finalproject/DramaCateg/OpenBook5Home.dart';
import 'package:untitled2finalproject/storage/bookstorage.dart';

List fan = ['assets/drama1.jpg','assets/drama2.jpg','assets/drama3.jpg'];
List booknames = ['Once Upon An Expat \n',];
List Authors = ['Lisa Webb \n',];
List dates = ['Book - 2005 \n',];

List all = [
  bookStorage('assets/fantasypage1.jpg', 'The Darkling Bride \n',
      'by Andersen, Laura \n', 'Book - 2018 \n')
];

class drama extends StatefulWidget {
  @override
  _dramaState createState() => _dramaState();
}

class _dramaState extends State<drama> {
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
                    'Great Drama Series',
                    style: TextStyle(
                      fontSize: 30,
                      letterSpacing: 1,
                    ),
                  ),
                ),
                Text(
                  'Drama is the specific mode of fiction represented in performance. The term comes from a Greek word meaning "action" (Classical Greek: δρᾶμα, drama), which is derived from "to do" or "to act" (Classical Greek: δράω, draō). The enactment of drama in theatre, performed by actors on a stage before an audience, presupposes collaborative modes of production and a collective form of reception. The structure of dramatic texts, unlike other forms of literature, is directly influenced by this collaborative production and collective reception.',
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
                    scale: 4.5,
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
                          Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => openbookhome5()));
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

