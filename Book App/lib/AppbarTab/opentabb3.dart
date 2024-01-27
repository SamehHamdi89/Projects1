import 'package:flutter/material.dart';
import 'package:untitled2finalproject/BiographyCateg/biographyoop.dart';
import 'package:untitled2finalproject/BooksPages/Biography.dart';
import 'package:untitled2finalproject/BooksPages/Drama.dart';
import 'package:untitled2finalproject/BooksPages/Fantasy.dart';
import 'package:untitled2finalproject/BooksPages/History.dart';
import 'package:untitled2finalproject/BooksPages/Romance.dart';
import 'package:untitled2finalproject/Repeated/Menu.dart';
import 'package:untitled2finalproject/Repeated/NewAppBar.dart';

class openbtabb3 extends StatefulWidget {
  @override
  _openbtabb3State createState() => _openbtabb3State();
}

class _openbtabb3State extends State<openbtabb3> {
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
            biographyopenbook(),
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
