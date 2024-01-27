import 'package:flutter/material.dart';

class newappbbarr extends StatefulWidget {
  @override
  _newappbbarrState createState() => _newappbbarrState();
}

class _newappbbarrState extends State<newappbbarr> {
  @override
  Widget build(BuildContext context) {
    return AppBar(
      //backgroundColor: Color(int.parse("0xFFB1DDF0")),
      toolbarHeight: 170,
      title: SingleChildScrollView(
        child: Row(
          children: [
            Image.asset('assets/TrueLogo.png'),
          ],
        ),
      ),
      bottom: TabBar(
        tabs: [
          Tab(
            icon: Icon(
              Icons.home,
              color: Colors.black,
            ),
            text: 'Home',
          ),
          Tab(
            icon: Icon(
              Icons.airplanemode_active,
              color: Colors.black,
            ),
            text: 'Fantasy',
          ),
          Tab(
            icon: Icon(
              Icons.favorite,
              color: Colors.black,
            ),
            text: 'Romance',
          ),
          Tab(
            icon: Icon(
              Icons.account_circle,
              color: Colors.black,
            ),
            text: 'Biography',
          ),
          Tab(
            icon: Icon(
              Icons.all_inclusive,
              color: Colors.black,
            ),
            text: 'History',
          ),
          Tab(
            icon: Icon(
              Icons.wine_bar,
              color: Colors.black,
            ),
            text: 'Drama',
          ),
        ],
      ),
    );
  }
}
