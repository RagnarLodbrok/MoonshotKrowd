//
//  ViewController.swift
//  Krowd
//
//  Created by Gil Felot on 07/09/15.
//  Copyright (c) 2015 Gil Felot. All rights reserved.
//

import UIKit

class ViewController: UIViewController, ENSideMenuDelegate {
    
    let appGREEN = UIColor(red: 34/255, green: 182/255, blue: 168/255, alpha: 1.0)
    
    override func viewDidLoad() {
        super.viewDidLoad()
        self.sideMenuController()?.sideMenu?.delegate = self
        // Do any additional setup after loading the view, typically from a nib.
        navigationController!.navigationBar.barTintColor = appGREEN
        navigationController!.navigationBar.titleTextAttributes = [NSForegroundColorAttributeName: UIColor.whiteColor()]
    }

    @IBAction func toggleSideMenu(sender: AnyObject) {
        toggleSideMenuView()
    }
    
    // MARK: - ENSideMenu Delegate
    func sideMenuWillOpen() {
        println("sideMenuWillOpen")
    }
    
    func sideMenuWillClose() {
        println("sideMenuWillClose")
    }
    
    func sideMenuShouldOpenSideMenu() -> Bool {
        println("sideMenuShouldOpenSideMenu")
        return true
    }
    
    func sideMenuDidClose() {
        println("sideMenuDidClose")
    }
    
    func sideMenuDidOpen() {
        println("sideMenuDidOpen")
    }
}
