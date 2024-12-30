import 'package:flutter/material.dart';
import 'dart:async';

import 'package:whatsapp_clone/Navigation.dart';


class SplashScreen extends StatefulWidget {
  const SplashScreen({super.key});

  @override
  State<SplashScreen> createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen> {
  
  @override
  void initState() {
    super.initState();
    // Navigate to MyWidget after 3 seconds
    Timer(Duration(seconds: 3), () {
      Navigator.pushReplacement(
        context,
        MaterialPageRoute(builder: (context) => NavigationPage()),
      );
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color.fromARGB(255, 50, 51, 55), // Background color for splash screen
      body: Column(
          children: [
            Expanded(
              child: Center(
                child: Image.asset(
              'assets/whatsapp.png', // Add your splash logo here
              height: 70,
            ))),
             Padding(
              padding: const EdgeInsets.only(bottom: 60.0),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text('from', 
                  style: TextStyle(
                    color: const Color.fromARGB(255, 220, 217, 217),
                    fontSize: 15,
                    fontWeight: FontWeight.w100
                  ),),
                  // SizedBox(height: 3,),
                  Text('\u221E' "" 'Meta', 
                  style: TextStyle(
                    color: Colors.white,
                    fontSize: 25,
                    fontWeight: FontWeight.bold,
                  ),)
                ],
              )
              
            )
            // SizedBox(height: 20),
            // Text(
            //   "Welcome to My App",
            //   style: TextStyle(
            //     fontSize: 24,
            //     fontWeight: FontWeight.bold,
            //     color: Colors.black,
            //   ),
            // ),
          ],

        ),
      );
    //   bottomNavigationBar: SizedBox( 
    //     // height : 10,
    //     child: Column(
    //     children: [
    //       Text('from', 
    //       style: TextStyle(
    //         color: Colors.white,
    //         fontSize: 10),),
    //       Text('Meta', 
    //       style: TextStyle(
    //         color: Colors.white,
    //         fontSize: 20),),
    //     ],
    // )));
  }
}
