import 'package:flutter/material.dart';
import 'package:untitled2finalproject/BooksPages/Biography.dart';
import 'package:untitled2finalproject/BooksPages/Drama.dart';
import 'package:untitled2finalproject/BooksPages/Fantasy.dart';
import 'package:untitled2finalproject/BooksPages/History.dart';
import 'package:untitled2finalproject/BooksPages/Romance.dart';
import 'package:untitled2finalproject/DramaCateg/dramaoop.dart';
import 'package:untitled2finalproject/Repeated/Menu.dart';
import 'package:untitled2finalproject/Repeated/NewAppBar.dart';

class openbtabb5 extends StatefulWidget {
  @override
  _openbtabb5State createState() => _openbtabb5State();
}

class _openbtabb5State extends State<openbtabb5> {
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
            dramaopenbook(),
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
