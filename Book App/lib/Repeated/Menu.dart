import 'package:flutter/material.dart';
import 'package:untitled2finalproject/Home.dart';
import 'package:untitled2finalproject/loadingpage.dart';
import 'package:untitled2finalproject/Books.dart';
import 'package:untitled2finalproject/profile.dart';

class menu extends StatefulWidget {

  @override
  _menuState createState() => _menuState();
}

class _menuState extends State<menu> {
  @override
  Widget build(BuildContext context) {
    return Drawer(
      child: Container(
          color: Color(int.parse("0xFFDAE8FC")),
        child: ListView(
          children: [
            UserAccountsDrawerHeader(
              decoration: BoxDecoration(
                color: Colors.blue,
              ),
              accountName: Text('Sameh hamdi'),
              accountEmail: Text('hahahahaha@gmail.com'),
              currentAccountPicture: CircleAvatar(
                radius: 0,
                backgroundColor: Colors.blue,
                child: Image.asset('assets/TrueLogo.png'),
              ),
            ),
            Card(
              color: Color(int.parse("0xFF1BA1E2")),
              shadowColor: Colors.lime,
              elevation: 0,
              child: ListTile(
                title: Text('Profile',style: TextStyle(color: Colors.white)),
                leading: Icon(Icons.accessibility,color: Colors.white),
                onTap: (){
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => pprofile()));
                },
              ),
            ),
            Divider(
              color: Colors.grey[900],
              thickness: 3,
            ),
            Card(
              color: Color(int.parse("0xFF1BA1E2")),
              shadowColor: Colors.lime,
              elevation: 0,
              child: ListTile(
                title: Text('Home',style: TextStyle(color: Colors.white)),
                leading: Icon(Icons.home,color: Colors.white),
                onTap: (){
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => home()));
                },
              ),
            ),
            Divider(
              color: Colors.grey[900],
              thickness: 3,
            ),
            Card(
                color: Color(int.parse("0xFF1BA1E2")),
              child: ListTile(
                title: Text('Categories',style: TextStyle(color: Colors.white)),
                leading: Icon(Icons.category,color: Colors.white),
                onTap: (){
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => home()));
                },
              ),
            ),
            Divider(
              color: Colors.grey[900],
              thickness: 3,
            ),
            Card(
                color: Color(int.parse("0xFF1BA1E2")),
              child: ListTile(
                title: Text('Library',style: TextStyle(color: Colors.white)),
                leading: Icon(Icons.library_add,color: Colors.white),
                onTap: (){
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => home()));
                },
              ),
            ),
            Divider(
              color: Colors.grey[900],
              thickness: 3,
            ),
            Card(
                color: Color(int.parse("0xFF1BA1E2")),
              child: ListTile(
                title: Text('Books',style: TextStyle(color: Colors.white)),
                leading: Icon(Icons.settings,color: Colors.white),
                onTap: (){
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => bookss()));
                },
              ),
            ),
            Divider(
              color: Colors.grey[900],
              thickness: 3,
            ),
            Card(
                color: Color(int.parse("0xFF1BA1E2")),
              child: ListTile(
                title: Text('Exit',style: TextStyle(color: Colors.white)),
                leading: Icon(Icons.exit_to_app,color: Colors.white),
                onTap: (){
                  Navigator.of(context).push(MaterialPageRoute(builder: (BuildContext context) => Login()));
                },
              ),
            ),
          ],
        ),
      ),
    );
  }
}
