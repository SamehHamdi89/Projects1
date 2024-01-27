import 'package:flutter/material.dart';
import 'package:untitled2finalproject/Books.dart';

class category extends StatefulWidget {

  @override
  _categoryState createState() => _categoryState();
}

class _categoryState extends State<category> {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Color(int.parse("0xFFDAE8FC")),
      child: ListView(
        children: [
          Card(
            margin: EdgeInsets.fromLTRB(0, 5, 0, 0),
            color: Color(int.parse("0xFFBCEBFF")),
            child: ListTile(
              title: FlatButton(
                onPressed: () {
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => bookss()));
                },
                child: Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'Books',
                    style: TextStyle(
                      backgroundColor: Color(int.parse("0xFFCDEB8B")),
                      fontSize: 20,
                    ),
                  ),
                ),
              ),
              subtitle: Padding(
                padding: const EdgeInsets.fromLTRB(200, 0, 20, 10),
                child: Image.asset(
                  'assets/booksCateg.jpg',
                ),
              ),
            ),
          ),
          SizedBox(height: 15),
          Card(
            margin: EdgeInsets.fromLTRB(0, 10, 0, 0),
            color: Color(int.parse("0xFFBCEBFF")),
            child: ListTile(
              title: FlatButton(
                onPressed: () {
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => bookss()));
                },
                child: Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'Novels',
                    style: TextStyle(
                      backgroundColor: Color(int.parse("0xFFCDEB8B")),
                      fontSize: 20,
                    ),
                  ),
                ),
              ),
              subtitle: Padding(
                padding: const EdgeInsets.fromLTRB(200, 0, 0, 10),
                child: Image.asset('assets/novelscateg.jpg'),
              ),
            ),
          ),
          SizedBox(height: 15),
          Card(
            margin: EdgeInsets.fromLTRB(0, 15, 0, 0),
            color: Color(int.parse("0xFFBCEBFF")),
            child: ListTile(
              title: FlatButton(
                onPressed: () {
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => bookss()));
                },
                child: Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'Stories',
                    style: TextStyle(
                      backgroundColor: Color(int.parse("0xFFCDEB8B")),
                      fontSize: 20,
                    ),
                  ),
                ),
              ),
              subtitle: Padding(
                padding: const EdgeInsets.fromLTRB(200, 0, 0, 10),
                child: Image.asset('assets/storiescateg.jpg'),
              ),
            ),
          ),
          SizedBox(height: 15),
          Card(
            margin: EdgeInsets.fromLTRB(0, 10, 0, 0),
            color: Color(int.parse("0xFFBCEBFF")),
            child: ListTile(
              title: FlatButton(
                onPressed: () {
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => bookss()));
                },
                child: Align(
                  alignment: Alignment.topLeft,
                  child: Text(
                    'Articles',
                    style: TextStyle(
                      backgroundColor: Color(int.parse("0xFFCDEB8B")),
                      fontSize: 20,
                    ),
                  ),
                ),
              ),
              subtitle: Padding(
                padding: const EdgeInsets.fromLTRB(200, 0, 0, 10),
                child: Image.asset('assets/articlescateg.jpg'),
              ),
            ),
          ),
          SizedBox(height: 15),
        ],
      ),
    );
  }
}
