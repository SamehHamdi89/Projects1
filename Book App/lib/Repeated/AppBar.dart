import 'package:flutter/material.dart';

class appbbarr extends StatefulWidget {
  @override
  _appbbarrState createState() => _appbbarrState();
}

class _appbbarrState extends State<appbbarr> {
  @override
  Widget build(BuildContext context) {
    return AppBar(
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
                Icons.dashboard,
              color: Colors.black,
            ),
            text: 'Dashboard',
          ),
          Tab(
            icon: Icon(
                Icons.category,
              color: Colors.black,
            ),
            text: 'Categories',
          ),
          Tab(
            icon: Icon(
                Icons.library_add,
              color: Colors.black,
            ),
            text: 'Library',
          ),
        ],
      ),
    );
  }
}
