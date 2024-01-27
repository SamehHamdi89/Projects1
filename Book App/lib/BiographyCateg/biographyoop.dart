import 'package:flutter/material.dart';

class biographyopenbook extends StatefulWidget {

  @override
  _biographyopenbookState createState() => _biographyopenbookState();
}

class _biographyopenbookState extends State<biographyopenbook> {

  int s = 5;
  String fullDesc = 'Abraham Lincoln, byname Honest Abe, \n'
      ' the Rail-Splitter, or the \n Great Emancipator, '
      '(born February \n 12, 1809,  near Hodgenville, '
      'Kentucky, \n  U.S. —died  April 15, 1865,\n '
      'Washington, D.C.), 16th president of \n the '
      ' United States (1861–65), \n who preserved'
      ' the Union during \n the American Civil War '
      ' and \n brought about the emancipation \n of '
      'enslaved people in the \n United States. ';
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
                        image: AssetImage('assets/biography1.jpg')
                    ),
                  ),
                ),
                Column(
                  children: [
                    Row(
                      children: [
                        Text(
                          'Abraham lincoln',
                          style: TextStyle(
                              fontSize: 25,
                              fontWeight: FontWeight.bold,
                              letterSpacing: 1
                          ),
                        ),
                        Icon(Icons.favorite)
                      ],
                    ),
                    Text('by Anthony Moss'),
                    Row(
                      children: [
                        Text('Book - 2000'),
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
                  child: Text('Perhaps the most well-known biography is Lincoln, by the late historian David Herbert Donald. Eric Foner, a professor of history at Columbia University and author of The Fiery Trial: Abraham Lincoln and American Slavery, recommends Donalds book as the best one-volume account of Lincolns life.'),
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