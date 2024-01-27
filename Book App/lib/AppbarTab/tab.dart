import 'package:flutter/material.dart';
import 'package:untitled2finalproject/Repeated/AppBar.dart';
import 'package:untitled2finalproject/Repeated/Menu.dart';
import 'package:untitled2finalproject/categoriess.dart';
import 'package:untitled2finalproject/dashboard.dart';
import 'package:untitled2finalproject/library.dart';

class tabb extends StatefulWidget {

  @override
  _tabbState createState() => _tabbState();
}

class _tabbState extends State<tabb> {
  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 3,
      child: Scaffold(
        drawer: menu(),
        appBar: PreferredSize (preferredSize: const Size.fromHeight(170), child: appbbarr()),
        body: TabBarView(
          children: [
            dashboard(),
            category(),
            lib(),
          ],
        ),
      ),
    );
  }
}
