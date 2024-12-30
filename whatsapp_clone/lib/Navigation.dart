import 'package:flutter/material.dart';
import 'package:whatsapp_clone/CallsPage.dart';
import 'package:whatsapp_clone/CommunityPage.dart';
import 'package:whatsapp_clone/UpdatePage.dart';
import 'package:whatsapp_clone/HomePage.dart';

class NavigationPage extends StatefulWidget {
  const NavigationPage({super.key});

  @override
  State<NavigationPage> createState() => _NavigationPageState();
}

class _NavigationPageState extends State<NavigationPage> {
  final PageController _pageController = PageController(initialPage: 0);
   int _currentIndex = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: PageView(
        controller: _pageController,
        scrollDirection: Axis.horizontal,
        onPageChanged: (index) {
          setState(() {
            _currentIndex = index;
          });
        },
        children: [
          Homepage(),
          Update(),
          Community(),
          Calls(),
        ],
      ),
    

      bottomNavigationBar:  NavigationBarTheme(
        data: NavigationBarThemeData(
          labelTextStyle: WidgetStateProperty.all(
            TextStyle(
              color: Colors.white
            ),
           ),
           iconTheme: WidgetStateProperty.all(
            IconThemeData(color: Colors.white)
           )
        )
      , 
      child: NavigationBar(
        onDestinationSelected: (int index) {
          setState(() {
            _currentIndex = index;
            _pageController.jumpToPage(index);
            // _getBody(_currentIndex);
          });
        },
        height: 70,
        backgroundColor: Colors.black,
        indicatorColor: const Color.fromARGB(160, 83, 154, 90),
      
        selectedIndex: _currentIndex,

        destinations: const <Widget>[
          
          NavigationDestination(
            selectedIcon: Icon(Icons.message),
            icon: Icon(Icons.message_outlined, ),
            label: 'Chats',
            
          ),
          NavigationDestination(
            icon: Badge(isLabelVisible: false, child: Icon(Icons.radio_button_checked_outlined),),
            label: 'Updates',
          ),
          NavigationDestination(
            icon: Badge(
              isLabelVisible: false,
              child: Icon(Icons.groups_outlined),
            ),
            label: 'Communities',
          ),
          NavigationDestination(
            icon: Badge(isLabelVisible: false,
            child: Icon(Icons.call),  ),
            label: 'Calls',
          ),
        ],
        
    )));
  }

}

// Widget _getBody(int index) {
//   switch (index) {
//     case 0:
//       return Homepage();
//     case 1:
//       return Update();
//     case 2:
//       return Community();
//     case 3:
//       return Calls();
//     default:
//       return Homepage();
//   }
// }

// type: BottomNavigationBarType.fixed,
      
      

// // backgroundColor: Colors.black,
//         backgroundColor: Colors.black,
//         selectedItemColor: const Color.fromARGB(194, 40, 252, 21),
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
//     ),