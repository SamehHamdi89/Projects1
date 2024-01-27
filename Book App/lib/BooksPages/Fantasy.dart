import 'package:flutter/material.dart';
import 'package:untitled2finalproject/FantasyCateg/OpenBookHome.dart';
import 'package:untitled2finalproject/storage/bookstorage.dart';

List fan = ['assets/fantasypage1.jpg','assets/fantasy2.png','assets/fantasy3.jpg'];
List booknames = ['The Darkling Bride \n',];
List Authors = ['by Andersen, Laura \n',];
List dates = ['Book - 2018 \n',];

List all = [
  bookStorage('assets/fantasypage1.jpg', 'The Darkling Bride \n',
      'by Andersen, Laura \n', 'Book - 2018 \n')
];

class fantasy extends StatefulWidget {
  @override
  _fantasyState createState() => _fantasyState();
}

class _fantasyState extends State<fantasy> {
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
                    'Great Fantasy Series',
                    style: TextStyle(
                      fontSize: 30,
                      letterSpacing: 1,
                    ),
                  ),
                ),
                Text(
                  'As everyone knows, librarians have magical powers, and can see well into the future. Want proof? Enjoy these recent titles ranging from Science Fiction to Fantasy to Magical Realism, all highlighting librarians and libraries.',
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
                    scale: 2,
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
                            Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => openbookhome()));
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
