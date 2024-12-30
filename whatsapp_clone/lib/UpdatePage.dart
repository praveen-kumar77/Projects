import 'package:flutter/material.dart';

class Update extends StatefulWidget {
  const Update({super.key});

  @override
  State<Update> createState() => _UpdateState();
}

class _UpdateState extends State<Update> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        backgroundColor: const Color.fromARGB(255, 0, 0, 0),
      appBar: AppBar(
        title: Text('Updates',
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
          IconButton(onPressed: () => Text('search'), icon: Icon(Icons.search, color: Colors.white)),
          IconButton(onPressed: () => Text('menu'), icon: Icon(Icons.more_vert_rounded, color: Colors.white)),
        ],
        
      ),
      
         // listtile
    floatingActionButton: Column(
    
      mainAxisAlignment: MainAxisAlignment.end,
      children: [
      IconButton(onPressed: () => Text('data'), icon: Icon(Icons.draw_sharp ,color: Colors.white,)),
        SizedBox(height: 10,),
      FloatingActionButton(
      backgroundColor: const Color.fromARGB(220, 36, 250, 79),
      onPressed: () => Text("data"),
      child: Icon(Icons.camera_alt_sharp, color: Colors.black,),),
      SizedBox(height: 10,),

      ]
    ) ,
    );
  }
}