import 'package:flutter/material.dart';
import 'package:untitled2finalproject/BooksPages/Biography.dart';
import 'package:untitled2finalproject/BooksPages/Drama.dart';
import 'package:untitled2finalproject/BooksPages/Fantasy.dart';
import 'package:untitled2finalproject/BooksPages/History.dart';
import 'package:untitled2finalproject/BooksPages/Romance.dart';
import 'package:untitled2finalproject/FantasyCateg/openbook.dart';
import 'package:untitled2finalproject/Repeated/Menu.dart';
import 'package:untitled2finalproject/Repeated/NewAppBar.dart';

class openbtabb extends StatefulWidget {
  @override
  _openbtabbState createState() => _openbtabbState();
}

class _openbtabbState extends State<openbtabb> {
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
            openbook(),
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
