import 'package:flutter/material.dart';
import 'package:carousel_slider/carousel_slider.dart';

List fan = ['assets/fantasy1.jpg','assets/fantasy2.png','assets/fantasy3.jpg'];
List rom = ['assets/romance1.jpg','assets/romance2.jpg','assets/romance3.jpg'];
List biog = ['assets/biography1.jpg','assets/biography2.jpg','assets/biography3.jpg'];
List his = ['assets/history1.jpg','assets/history2.jpg','assets/history3.jpg'];
List dramaa = ['assets/drama1.jpg','assets/drama2.jpg','assets/drama3.jpg'];


class hhomee extends StatefulWidget {

  @override
  _hhomeeState createState() => _hhomeeState();
}

class _hhomeeState extends State<hhomee> {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: ListView(
        children: [
          Image.asset('assets/bookpage.jpg'),
          Text(
              '“Once you learn to read, you will be forever free.” — Frederick Douglass.',
            textAlign: TextAlign.center,
            style: TextStyle(
              fontSize: 30,
              fontWeight: FontWeight.bold,
              letterSpacing: 2,

              ),
          ),
          Card(
            color: Colors.brown[300],
            margin: EdgeInsets.fromLTRB(80,10,80,0),
            child: Align(
              alignment: Alignment.center,
              child: Padding(
                padding: EdgeInsets.all(8),
                child: Text(
                  'Fantasy Books',
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
              items: fan.map((e) => Stack(
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
                  'Romance Books',
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
              items: rom.map((e) => Stack(
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
                  'Biography Books',
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
              items: biog.map((e) => Stack(
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
                  'History Books',
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
              items: his.map((e) => Stack(
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
                  'Drama Books',
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
              items: dramaa.map((e) => Stack(
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
        ],
      ),
    );
  }
}