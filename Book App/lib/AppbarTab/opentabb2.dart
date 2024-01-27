import 'package:flutter/material.dart';
import 'package:untitled2finalproject/BooksPages/Biography.dart';
import 'package:untitled2finalproject/BooksPages/Drama.dart';
import 'package:untitled2finalproject/BooksPages/Fantasy.dart';
import 'package:untitled2finalproject/BooksPages/History.dart';
import 'package:untitled2finalproject/BooksPages/Romance.dart';
import 'package:untitled2finalproject/Repeated/Menu.dart';
import 'package:untitled2finalproject/Repeated/NewAppBar.dart';
import 'package:untitled2finalproject/RomanceCateg/romanceoop.dart';

class openbtabb2 extends StatefulWidget {
  @override
  _openbtabb2State createState() => _openbtabb2State();
}

class _openbtabb2State extends State<openbtabb2> {
  @override
  Widget build(BuildContext context) {
    return DefaultTabController(
      length: 6,
      child: Scaffold(
        backgroundColor: Color(int.parse("0xFFDAE8FC")),
        drawer: menu(),
        appBar: PreferredSize (preferredSize: const Size.fromHeight(170), child: newappbbarr()),
        body: TabBarView(
          children: [
            romanceopenbook(),
            fantasy(),
            romance(),
            biography(),
            history(),
            drama()
          ],
        ),
      ),
    );
  }
}
