import 'package:flutter/material.dart';
import 'package:carousel_slider/carousel_slider.dart';

List <String> novels = ['assets/image11.jpg','assets/novel1.jpg','assets/novel2.jpg'];
List <String> books = ['assets/books1.jpg','assets/books2.jpg','assets/books3.jpg'];
List <String> stories = ['assets/stories1.jpg','assets/stories2.jpg','assets/stories3.jpg'];

class dashboard extends StatefulWidget {

  @override
  _dashboardState createState() => _dashboardState();
}

class _dashboardState extends State<dashboard> {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Color(int.parse("0xFFDAE8FC")),
      child: ListView(
        children: [
          Image.asset('assets/libslildeshow.jpg'),
          SizedBox(height: 10),
          Card(
            color: Colors.brown[300],
            margin: EdgeInsets.fromLTRB(80,10,80,0),
            child: Align(
              alignment: Alignment.center,
              child: Padding(
                padding: EdgeInsets.all(8),
                child: Text(
                    'Novels',
                  style: TextStyle(
                    color: Colors.white,
                    fontWeight: FontWeight.bold,
                    fontSize: 20
                  ),
                ),
              ),
            ),
          ),
          Padding(
            padding: EdgeInsets.symmetric(vertical: 15.0),
            child: CarouselSlider(
                options: CarouselOptions(
                    enableInfiniteScroll: true,
                    autoPlay: true,
                    enlargeCenterPage: false
                ),
              items: novels.map((e) => Stack(
                  fit: StackFit.expand,
                  children: <Widget>[
                    FlatButton(
                      onPressed: (){},
                      child: Image.asset(
                        e,
                        width: 200,
                        height: 200,
                        fit: BoxFit.contain,
                      ),
                    ),
                  ],
                )).toList(),
            ),
          ),
          SizedBox(height: 15),
          Divider(
            height: 10,
            thickness: 6,
          ),
          Card(
            color: Colors.brown[300],
            margin: EdgeInsets.fromLTRB(80,10,80,0),
            child: Align(
              alignment: Alignment.center,
              child: Padding(
                padding: EdgeInsets.all(8),
                child: Text(
                    'Books',
                  style: TextStyle(
                      color: Colors.white,
                      fontWeight: FontWeight.bold,
                      fontSize: 20
                  ),
                ),
              ),
            ),
          ),
          Padding(
            padding: EdgeInsets.symmetric(vertical: 15.0),
            child: CarouselSlider(
                options: CarouselOptions(
                    enableInfiniteScroll: true,
                    autoPlay: true,
                    enlargeCenterPage: false
                ),
              items: books.map((e) => Stack(
                  fit: StackFit.expand,
                  children: <Widget>[
                    FlatButton(
                      onPressed: (){},
                      child: Image.asset(
                        e,
                        width: 200,
                        height: 200,
                        fit: BoxFit.contain,
                      ),
                    ),
                  ],
                )).toList(),
            ),
          ),
          SizedBox(height: 15),
          Divider(
            height: 10,
            thickness: 7,
          ),
          Card(
            color: Colors.brown[300],
            margin: EdgeInsets.fromLTRB(80,10,80,0),
            child: Align(
              alignment: Alignment.center,
              child: Padding(
                padding: EdgeInsets.all(8),
                child: Text(
                    'Storiess',
                  style: TextStyle(
                      color: Colors.white,
                      fontWeight: FontWeight.bold,
                      fontSize: 20
                  ),
                ),
              ),
            ),
          ),
          Padding(
            padding: EdgeInsets.symmetric(vertical: 15.0),
            child: CarouselSlider(
                options: CarouselOptions(
                    enableInfiniteScroll: true,
                    autoPlay: true,
                    enlargeCenterPage: false
                ),
              items: stories.map((e) => Stack(
                  fit: StackFit.expand,
                  children: <Widget>[
                    FlatButton(
                      onPressed: (){},
                      child: Image.asset(
                        e,
                        width: 200,
                        height: 200,
                        fit: BoxFit.contain,
                      ),
                    ),
                  ],
                )).toList(),
            ),
          ),
          SizedBox(height: 15),
          Divider(
            height: 10,
            thickness: 7,
          ),
        ],
      ),
    );
  }
}
