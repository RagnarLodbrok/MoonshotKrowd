//
//  ViewController.swift
//  Krowd
//
//  Created by Gil Felot on 07/09/15.
//  Copyright (c) 2015 Gil Felot. All rights reserved.
//

import UIKit
import MediaPlayer

class ViewController: UIViewController, UITableViewDelegate, UITextFieldDelegate, ENSideMenuDelegate {
    
    let appGREEN = UIColor(red: 34/255, green: 182/255, blue: 168/255, alpha: 1.0)
    
    @IBOutlet weak var chatField: UITextField!
    
    var cellContent = ["Rob: hello everybody", "Kirsten: I love this website", "Tommy: :P", "Ralphie: God Damn !!", "Rickyy7: WTF ta la voie du jeu en coréen xD", "Leyiko: personne d'autre pour le titre", "Leyiko: personne d'autre pour le titre", "KokoPopsIsBack: @Zbiloow Je parle pas dans cette converation moi", "Tobiixxx: Shlaya tu pourrai nous filer ta playlist stp xd !", "Proseleur: les corens ils s'en branlent ils sont a hawai", "Vilkaw: Droozi j'avoue c'est très intelligent ce que tu dis"]
    
    var moviePlayer : MPMoviePlayerController?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        playVideo()
        chatField.delegate = self
        
        self.sideMenuController()?.sideMenu?.delegate = self
        // Do any additional setup after loading the view, typically from a nib.
        navigationController!.navigationBar.barTintColor = appGREEN
        navigationController!.navigationBar.titleTextAttributes = [NSForegroundColorAttributeName: UIColor.whiteColor()]
    }
    
    func textFieldShouldReturn(textField: UITextField) -> Bool {
        chatField.resignFirstResponder()
        return true;
    }
    
    func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return cellContent.count
    }
    
    func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let cell = UITableViewCell(style: UITableViewCellStyle.Default, reuseIdentifier: "Cell")
        cell.textLabel?.text = cellContent[indexPath.row]
        return cell
    }
    
    @IBAction func toggleSideMenu(sender: AnyObject) {
        toggleSideMenuView()
    }
    
    func playVideo() {
        
        // hard path
        let videoPath = NSBundle.mainBundle().pathForResource("vidlol", ofType:"mp4")
        let url = NSURL.fileURLWithPath(videoPath!)
        
        // Init the player
        moviePlayer = MPMoviePlayerController(contentURL: url)
        
        if let player = moviePlayer {
            // CGRect to position the player
            let y = self.navigationController?.navigationBar.frame.height
            player.view.frame = CGRect(x: 0, y: y!, width: self.view.bounds.width, height: (self.view.bounds.height / 2) - 120)
            
            player.scalingMode = .AspectFill
            
            //Add it as a subView to your currentView
            self.view.addSubview(player.view)
            
            //Play the video
            player.prepareToPlay()
            
        }
        else {
            println("Movie player couldn't be initialized")
        }
    }
    
}
