import 'package:flutter/material.dart';

class historyopenbook extends StatefulWidget {

  @override
  _historyopenbookState createState() => _historyopenbookState();
}

class _historyopenbookState extends State<historyopenbook> {

  int s = 5;
  String fullDesc = 'World History examines human \n'
      ' development from the dawn of \n'
      'civilization to the present day. Using \n'
      ' primary and secondary sources, \n'
      ' students conduct an inquiry- \n'
      'based research to examine historical \n'
      ' events, cultural developments, \n'
      ' and social and family structures. ';
  bool isReadMore = false;

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Color(int.parse('0xFFDAE8FC')),
      child: ListView(
        children: [
          ListTile(
            title: Row(
              children: [
                Container(
                  width: 100,
                  height: 100,
                  decoration: BoxDecoration(
                    image:  DecorationImage(
                        image: AssetImage('assets/history1.jpg')
                    ),
                  ),
                ),
                Column(
                  children: [
                    Row(
                      children: [
                        Text(
                          'World History',
                          style: TextStyle(
                              fontSize: 25,
                              fontWeight: FontWeight.bold,
                              letterSpacing: 1
                          ),
                        ),
                        Icon(Icons.favorite)
                      ],
                    ),
                    Text('by Usborne'),
                    Row(
                      children: [
                        Text('Book - 1998'),
                        RaisedButton(
                          color: Color(int.parse('0xFF7EA6E0')),
                          onPressed: (){
                            setState(() {
                              s -= 1;
                            });
                          },
                          child: Column(
                            children: [
                              Text('Avaliable ' + s.toString()),
                              Text('Place on hold')
                            ],
                          ),
                        ),
                      ],
                    ),
                    SingleChildScrollView(
                      child: Column(
                        children: [
                          buildText(fullDesc,20),
                          FlatButton(
                            padding: EdgeInsets.fromLTRB(0, 0, 0, 40),
                            onPressed: (){}
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
              ],
            ),
          ),
          ListTile(
            title: Column(
              children: [
                SizedBox(height: 10),
                Divider(
                  thickness: 5,
                  color: Colors.grey[800],
                ),
                Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'About',
                    style: TextStyle(
                        fontWeight: FontWeight.bold
                    ),
                  ),
                ),
                Text(
                  'About the author',
                  style: TextStyle(
                      fontWeight: FontWeight.bold
                  ),
                ),
                Align(
                  alignment: Alignment.topLeft,
                  child: Text('Philip Parker is a historian specializing in the classical and medieval world. He is the author of World History (Eyewitness Companions), The Empire Stops Here: A Journey Along the Frontiers of the Roman Empire, The Northmen’s Fury: A History of the Viking World, and general editor of The Great Routes: A History of Cargoes and Commerce over Land and Sea. He was a contributor to DK’s History Year by Year and History of the World in 1,000 Objects. He previously worked as a diplomat and a publisher of historical atlases.'),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}

Widget buildText(String text, int size){
  return Text(
    text,
    maxLines: size,
  );
}