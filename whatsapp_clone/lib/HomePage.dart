import 'package:flutter/material.dart';



class Homepage extends StatefulWidget {
  const Homepage({super.key});

  @override
  State<Homepage> createState() => _HomepageState();
}

class _HomepageState extends State<Homepage> {
 


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color.fromARGB(255, 0, 0, 0),
      appBar: AppBar(
        title: Text('WhatsApp',
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
          IconButton(onPressed: () => Text('menu'), icon: Icon(Icons.more_vert_rounded, color: Colors.white)),
        ],
      ),
      
      body: Column(
        mainAxisAlignment: MainAxisAlignment.start,
        children: [
          ListTile(
            title: Text('Praveen'),
          )
        ],
      ),
      
      
      floatingActionButton:Column(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [ 
      FloatingActionButton(backgroundColor: const Color.fromARGB(220, 36, 250, 79),
        onPressed: () => Text('data'),
        tooltip: 'Add Comment',
        child: Icon(Icons.add_comment, color: Colors.black, ),
      ),
      SizedBox(height: 10,)])    
    );
  }
 
}