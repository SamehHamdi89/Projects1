import 'package:flutter/material.dart';

class dramaopenbook extends StatefulWidget {

  @override
  _dramaopenbookState createState() => _dramaopenbookState();
}

class _dramaopenbookState extends State<dramaopenbook> {

  int s = 5;
  String fullDesc = 'Whether youve made the leap \n'
      ' abroad yourself, or youre simply \n curious '
      ' about what its like \n to set up life in a '
      ' foreign country, \n Once Upon An  Expat will '
      ' not \n disappoint. With brave  tales of life \n'
      'outside the comfort zone, the \n contributing '
      ' authors will \n have you craving adventure as \n'
      ' they share stories from their \n'
      'not-so-ordinary lives around the world.';
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
                        image: AssetImage('assets/drama1.jpg')
                    ),
                  ),
                ),
                Column(
                  children: [
                    Row(
                      children: [
                        Text(
                          'Once Upon An Expat',
                          style: TextStyle(
                              fontSize: 25,
                              fontWeight: FontWeight.bold,
                              letterSpacing: 1
                          ),
                        ),
                        Icon(Icons.favorite)
                      ],
                    ),
                    Text('by Lisa Webb'),
                    Row(
                      children: [
                        Text('Book - 2005'),
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
                  child: Text('Lisa Webb is the creative mind behind Canadian Expat Mom , an expat / travel blog and boutique press. A former educator, turned seasoned expat, Lisa is the author of bestselling childrens book series, The Kids Who Travel the World. Canadian Expat Mom is proud to publish its debut anthology, Once Upon An Expat, giving expat authors a platform to share their global stories.'),
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