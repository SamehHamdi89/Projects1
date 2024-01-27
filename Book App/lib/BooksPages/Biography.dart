import 'package:flutter/material.dart';
import 'package:untitled2finalproject/BiographyCateg/OpenBook3Home.dart';
import 'package:untitled2finalproject/storage/bookstorage.dart';

List fan = ['assets/biography1.jpg','assets/biography2.jpg','assets/biography3.jpg'];
List booknames = ['Abraham lincoln \n',];
List Authors = ['Anthony Moss \n',];
List dates = ['Book - 2000 \n',];

List all = [
  bookStorage('assets/fantasypage1.jpg', 'The Darkling Bride \n',
      'by Andersen, Laura \n', 'Book - 2018 \n')
];

class biography extends StatefulWidget {
  @override
  _biographyState createState() => _biographyState();
}

class _biographyState extends State<biography> {
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
                    'Great Biography Series',
                    style: TextStyle(
                      fontSize: 30,
                      letterSpacing: 1,
                    ),
                  ),
                ),
                Text(
                  'A biography (from the Greek words bios meaning "life", and graphos meaning "write") is a non-fictional account of a persons life. Biographies are written by an author who is not the subject/focus of the book.',
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
                    scale: 6,
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
                          Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => openbookhome3()));
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


