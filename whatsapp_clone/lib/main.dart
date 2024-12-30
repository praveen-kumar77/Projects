import 'package:flutter/material.dart';
import 'package:whatsapp_clone/SplashScreen.dart';


void main() {
  runApp(MyWidget());
}

class MyWidget extends StatelessWidget {
  const MyWidget({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        useMaterial3: true
      ),
      title: 'whatsapp clone',
      home: SplashScreen(),
    );
  }
}