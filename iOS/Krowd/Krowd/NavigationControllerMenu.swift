//
//  NavigationControllerMenu.swift
//  
//
//  Created by Gil Felot on 08/09/15.
//
//

import UIKit

class NavigationControllerMenu: ENSideMenuNavigationController, ENSideMenuDelegate {
    override func viewDidLoad() {
        super.viewDidLoad()

        sideMenu = ENSideMenu(sourceView: self.view, menuViewController: MyMenuTableViewController(), menuPosition:.Left)
        //sideMenu?.delegate = self //optional
        sideMenu?.menuWidth = 180.0 // optional, default is 160
        //sideMenu?.bouncingEnabled = false
        
        // make navigation bar showing over side menu
        view.bringSubviewToFront(navigationBar)
        // Do any additional setup after loading the view.
    }

    // MARK: - ENSideMenu Delegate
    func sideMenuWillOpen() {
        println("sideMenuWillOpen")
    }
    
    func sideMenuWillClose() {
        println("sideMenuWillClose")
    }
    
    func sideMenuDidClose() {
        println("sideMenuDidClose")
    }
    
    func sideMenuDidOpen() {
        println("sideMenuDidOpen")
    }

    

}
