import 'package:flutter/material.dart';

class openbook extends StatefulWidget {

  @override
  _openbookState createState() => _openbookState();
}

class _openbookState extends State<openbook> {

  int s = 5;
  String fullDesc = 'In 1883, the Lady Jenny Gallagher,\n age'
  '23, died suddenly at her home of \n Deeprath'
  'Castle, deep in the Irish \n countryside. Though'
  'her death was \n ruled  an accident,  the  precise \n'
  'circumstances are unknown.  In  1992, \n Cillian '
  'Gallagher  and his beautiful \n wife  Lily were'
  'found dead within \n the castle walls. ';
  String cont =  'American Carragh Ryan, an Irish scholar, is hired by Aidan Viscount Gallagher to catalog the library of Deeprath Castle, his family home in the mountains of County Wicklow. A centuries-old ghost, the Darkling Bride, is an unexpected complication. A more recent tragedy, the 20-year-old murders of the viscounts parents, adds another mystery. As they discover ';
  String cont2;
  bool isReadMore = false;
  bool isReadMore2 = false;
  bool isReadMore3 = false;

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
                        image: AssetImage('assets/fantasypage1.jpg')
                    ),
                  ),
                ),
                Column(
                  children: [
                    Row(
                      children: [
                        Text(
                          'The Darkling Bride',
                          style: TextStyle(
                              fontSize: 25,
                              fontWeight: FontWeight.bold,
                              letterSpacing: 1
                          ),
                        ),
                        Icon(Icons.favorite)
                      ],
                    ),
                    Text('by Andersen, Laura'),
                    Row(
                        children: [
                          Text('Book - 2018'),
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
                              onPressed: (){
                              setState(() {
                                isReadMore = !isReadMore;
                                if(isReadMore == true){
                                  fullDesc += 'A suicide/murder? \n Or two  murders?  In 2015, '
                                      ' Carragh \n Ryan is offered the job of taking \n '
                                      ' an inventory of the vast \n library at  '
                                      'Deeprath Castle. A  great \n lover '
                                      'of books, Carragh cant resist the \n'
                                      ' opportunity to gain access to \n the historic'
                                      ' collection. But what \n she finds at '
                                      ' the castle-- and in its \n enigmatic heir, '
                                      ' Aidan Gallagher--leads \n Carragh ever '
                                      ' deeper into the heart of \n an ancient '
                                      ' and sinister family secret';
                                }
                                else{
                                  fullDesc = 'In 1883, the Lady Jenny Gallagher,\n age'
                                      '23, died suddenly at her home of \n Deeprath'
                                      'Castle, deep in the Irish \n countryside. Though'
                                      'her death was \n ruled  an accident,  the  precise \n'
                                      'circumstances are unknown.  In  1992, \n Cillian '
                                      'Gallagher  and his beautiful \n wife  Lily were'
                                      'found dead within \n the castle  walls. ';
                                }
                              });
                              },
                              child: Text((isReadMore? 'Read Less' : 'Read More')),
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
                  child: Text(
                      'Laura Andersen is the award-winning author of the Boleyn King trilogy ( The Boleyn King, The Boleyn Deceit, The Boleyn Reckoning ) and the Tudor Legacy novels ( The Virgins Daughter, The Virgins Spy, The Virgins War ). She has a B.A. in English (with an emphasis in British history), which she puts to use by reading everything she can lay her hands on. She is married with four children and lives in Boston.',
                  ),
                ),
              ],
            ),
          ),
          ListTile(
            title: Column(
              children: [
                SizedBox(height: 10.0),
                Divider(
                  thickness: 5,
                  color: Colors.grey[800],
                ),
                Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'Opinion',
                    style: TextStyle(
                        fontWeight: FontWeight.bold
                    ),
                  ),
                ),
                Text(
                  'From the critics',
                  style: TextStyle(
                      fontWeight: FontWeight.bold
                  ),
                ),
                Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'Laura Andersen is the award-winning author of the Boleyn King trilogy ( The Boleyn King, The Boleyn Deceit, The Boleyn Reckoning ) and the Tudor Legacy novels ( The Virgins Daughter, The Virgins Spy, The Virgins War ). She has a B.A. in English (with an emphasis in British history), which she puts to use by reading everything she can lay her hands on. She is married with four children and lives in Boston.'
                  ),
                ),
                SizedBox(height: 10.0),
                Text(
                  'Library Journal',
                  style: TextStyle(
                      fontWeight: FontWeight.bold
                  ),
                ),
                Align(
                  alignment: Alignment.topLeft,
                  child: buildText(cont, 20),
                ),
                FlatButton(
                  onPressed: (){
                    setState(() {
                      isReadMore2 = !isReadMore2;
                      if(isReadMore2 == true){
                        cont += 'clues hidden by the beautiful Lady Jenny in the days leading up to her death, Carragh and Aidan come together in their search for the truth. History and geography combine in a luscious setting that features the surrounding countryside as well as a 700-year-old castle. Sarah Jane Drummey delivers a well-paced performance that adds to a compelling listening experience. VERDICT A balanced mystery with minor supernatural elements that moves inexorably to a surprising and satisfying conclusion. This gothic romantic suspense novel will appeal to Mary Stewart and Phyllis Whitney fans who have been pining for more. Eloquent, atmospheric, and suspenseful, this is the perfect read for fans of Kate Morton and Lucinda Riley: LJ 1/18 review of the Ballantine hc.]-Janet Martin, Southern Pines P.L., NC © Copyright 2018. Library Journals LLC, a wholly owned subsidiary of Media Source, Inc. No redistribution permitted.';
                      }
                      else{
                        cont =  'American Carragh Ryan, an Irish scholar, is hired by Aidan Viscount Gallagher to catalog the library of Deeprath Castle, his family home in the mountains of County Wicklow. A centuries-old ghost, the Darkling Bride, is an unexpected complication. A more recent tragedy, the 20-year-old murders of the viscounts parents, adds another mystery. As they discover ';

                      }
                    });
                  },
                  child: Text((isReadMore2? 'Read Less' : 'Read More')),
                ),
                SizedBox(height: 10.0),
                Text(
                  'Library Journal',
                  style: TextStyle(
                      fontWeight: FontWeight.bold
                  ),
                ),
                Align(
                  alignment: Alignment.topLeft,
                  child: buildText(cont, 20),
                ),
                FlatButton(
                  onPressed: (){
                    setState(() {
                      isReadMore3 = !isReadMore3;
                      if(isReadMore3 == true){
                        cont2 += 'clues hidden by the beautiful Lady Jenny in the days leading up to her death, Carragh and Aidan come together in their search for the truth. History and geography combine in a luscious setting that features the surrounding countryside as well as a 700-year-old castle. Sarah Jane Drummey delivers a well-paced performance that adds to a compelling listening experience. VERDICT A balanced mystery with minor supernatural elements that moves inexorably to a surprising and satisfying conclusion. This gothic romantic suspense novel will appeal to Mary Stewart and Phyllis Whitney fans who have been pining for more. Eloquent, atmospheric, and suspenseful, this is the perfect read for fans of Kate Morton and Lucinda Riley: LJ 1/18 review of the Ballantine hc.]-Janet Martin, Southern Pines P.L., NC © Copyright 2018. Library Journals LLC, a wholly owned subsidiary of Media Source, Inc. No redistribution permitted.';
                      }
                      else{
                        cont2 =  'American Carragh Ryan, an Irish scholar, is hired by Aidan Viscount Gallagher to catalog the library of Deeprath Castle, his family home in the mountains of County Wicklow. A centuries-old ghost, the Darkling Bride, is an unexpected complication. A more recent tragedy, the 20-year-old murders of the viscounts parents, adds another mystery. As they discover ';

                      }
                    });
                  },
                  child: Text((isReadMore2? 'Read Less' : 'Read More')),
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