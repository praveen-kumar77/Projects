import 'package:flutter/material.dart';

class Calls extends StatefulWidget {
  const Calls({super.key});

  @override
  State<Calls> createState() => _CallsState();
}

class _CallsState extends State<Calls> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      appBar: AppBar(
        title: Text('Calls',
        style: TextStyle(
          color: Colors.white,
          fontSize: 25,
          fontWeight: FontWeight.normal
        ),),
        backgroundColor: const Color.fromARGB(255, 0, 0, 0),
        toolbarHeight: 70,
        actions: [
          IconButton(onPressed: () => print('qr code'), icon: Icon(Icons.qr_code_scanner_sharp, color: Colors.white)),
          IconButton(onPressed: () => Text('photo'), icon: Icon(Icons.camera_alt_outlined,color: Colors.white,)),
          IconButton(onPressed: () => print('qr code'), icon: Icon(Icons.search, color: Colors.white)),
          IconButton(onPressed: () => Text('menu'), icon: Icon(Icons.more_vert_rounded, color: Colors.white)),

        ],
        
      ),

      floatingActionButton:Column(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [ 
      FloatingActionButton(backgroundColor: const Color.fromARGB(220, 36, 250, 79),
        onPressed: () => Text('data'),
        tooltip: 'Add Comment',
        child: Icon(Icons.add_call, color: Colors.black, ),
      ),
      SizedBox(height: 10,)]) 
    );
  }
}