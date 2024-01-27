import 'package:flutter/material.dart';

class romanceopenbook extends StatefulWidget {

  @override
  _romanceopenbookState createState() => _romanceopenbookState();
}

class _romanceopenbookState extends State<romanceopenbook> {

  int s = 5;
  String fullDesc = 'A journey into the bridal \n relationship '
      ' between Jesus and \n His church,'
      ' written by acclaimed \n author Sula Skiles. ';
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
                        image: AssetImage('assets/romance1.jpg')
                    ),
                  ),
                ),
                Column(
                  children: [
                    Row(
                      children: [
                        Text(
                          'His Beloved Bride',
                          style: TextStyle(
                              fontSize: 25,
                              fontWeight: FontWeight.bold,
                              letterSpacing: 1
                          ),
                        ),
                        Icon(Icons.favorite)
                      ],
                    ),
                    Text('by Holly Rayner'),
                    Row(
                      children: [
                        Text('Book - 2015'),
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
                  child: Text('Sula’s passion for ministry comes from overcoming a very painful past. She has found freedom and healing from the traumas of her life and has been radically transformed through becoming a fiery believer and a follower of Jesus Christ. As a survivor of sex trafficking, she works to spread awareness, teach prevention and help victims and survivors of trafficking. '),
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