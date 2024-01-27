import 'package:flutter/material.dart';
import 'package:untitled2finalproject/BooksPages/Biography.dart';
import 'package:untitled2finalproject/BooksPages/Drama.dart';
import 'package:untitled2finalproject/BooksPages/Fantasy.dart';
import 'package:untitled2finalproject/BooksPages/History.dart';
import 'package:untitled2finalproject/BooksPages/Romance.dart';
import 'package:untitled2finalproject/HistoryCateg/historyoop.dart';
import 'package:untitled2finalproject/Repeated/Menu.dart';
import 'package:untitled2finalproject/Repeated/NewAppBar.dart';

class openbtabb4 extends StatefulWidget {
  @override
  _openbtabb4State createState() => _openbtabb4State();
}

class _openbtabb4State extends State<openbtabb4> {
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
            historyopenbook(),
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
