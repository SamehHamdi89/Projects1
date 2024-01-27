import 'package:flutter/material.dart';

class pprofile extends StatefulWidget {

  @override
  _pprofileState createState() => _pprofileState();
}

class _pprofileState extends State<pprofile> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color(int.parse("0xFFDAE8FC")),
      appBar: AppBar(
        toolbarHeight: 100,
        title: Text('Profile Page'),
        centerTitle: true,
        backgroundColor: Colors.blue,
        elevation: 0,
      ),
      body: Padding(
        padding: EdgeInsets.fromLTRB(30, 40, 30, 0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Center(
              child: Image.asset(
                  'assets/TrueLogo.png',
                scale: 0.4,
              ),
            ),
            Divider(
              height: 90.0,
              color: Colors.grey[800],
            ),
            Text(
              'NAME',
              style: TextStyle(
                color: Color(int.parse("0xFF1BA1E2")),
                letterSpacing: 2.0,
              ),
            ),
            SizedBox(height: 10.0,),
            Text(
              'Sameh Hamdi',
              style: TextStyle(
                  color: Colors.black,
                  letterSpacing: 2.0,
                  fontSize: 28.0,
                  fontWeight: FontWeight.bold
              ),
            ),
            SizedBox(height: 30.0,),
            Text(
              'Email Address',
              style: TextStyle(
                color: Color(int.parse("0xFF1BA1E2")),
                letterSpacing: 2.0,
              ),
            ),
            SizedBox(height: 10.0,),
            Row(
              children: [
                Icon(
                  Icons.email,
                  color: Colors.grey[400],
                ),
                SizedBox(width: 10.0),
                Text(
                  'hahaha@gmail.com',
                  style: TextStyle(
                      color: Colors.black,
                      letterSpacing: 2.0,
                      fontSize: 28.0,
                      fontWeight: FontWeight.bold
                  ),
                ),
                SizedBox(height: 30.0,),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
