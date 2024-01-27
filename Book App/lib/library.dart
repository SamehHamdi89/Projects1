import 'package:flutter/material.dart';
import 'package:untitled2finalproject/FantasyCateg/OpenBookHome.dart';

List fan = ['assets/fantasypage1.jpg'];
List booknames = ['The Darkling Bride \n',];
List Authors = ['by Andersen, Laura \n',];
List dates = ['Book - 2018 \n',];

class lib extends StatelessWidget {
  Icon i = Icon(Icons.favorite);
  int count = 0;

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        image: DecorationImage(
          image: AssetImage("assets/78c8dff1.jpg"),
          fit: BoxFit.cover,
        ),
      ),
      child: ListView(
        children: [
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
                        onPressed: (){},
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
