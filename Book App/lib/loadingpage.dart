import 'package:flutter/material.dart';
import 'package:splashscreen/splashscreen.dart';
import 'package:untitled2finalproject/Home.dart';

class Login extends StatefulWidget {
  @override
  _LoginState createState() => _LoginState();
}


class _LoginState extends State<Login> {
  @override
  Widget build(BuildContext context) {
    return SplashScreen(
      backgroundColor: Color(int.parse("0xFFDAE8FC")),
      seconds: 10,
      navigateAfterSeconds: home(),
      title: Text('A Good Librarian Like a Good Shepherd',),
      image: Image.asset('assets/TrueLogo.png'),
      photoSize: 200,
    );
  }
}