import 'package:flutter/material.dart';

class Community extends StatefulWidget {
  const Community({super.key});

  @override
  State<Community> createState() => _CommunityState();
}

class _CommunityState extends State<Community> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      appBar: AppBar(
        title: Text('Communities',
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
        
      )
//       bottomNavigationBar: 
      
//       BottomNavigationBar(
//       type: BottomNavigationBarType.fixed,

// // backgroundColor: Colors.black,
//         backgroundColor: Colors.black,
//         selectedItemColor: Colors.amber,
//         unselectedItemColor: Colors.white,
//         iconSize: 32,
//         currentIndex: _currentIndex,
//       onTap: (index) {
//         setState(() {
//           _currentIndex = index; // Update the current index
//         });
//       },

//         items:  [
//         BottomNavigationBarItem(icon: Icon(Icons.message,), label: "Chats",),
//         BottomNavigationBarItem(icon: Icon(Icons.radio_button_checked_rounded, ), label: "Updates", ),
//         BottomNavigationBarItem(icon:Icon(Icons.groups_2_outlined,), label: "Communities",),
//         BottomNavigationBarItem(icon: Icon(Icons.call,), label: "Calls",),
//         ]
//     )
  );
  }
}