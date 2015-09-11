//
//  DonationTableViewController.swift
//  
//
//  Created by Gil Felot on 11/09/15.
//
//

import UIKit

class DonationTableViewController: UITableViewController, UITableViewDataSource, UITableViewDelegate, ENSideMenuDelegate {
    
    let donationDictionary = DonationDetail.allDonations
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    // MARK: - Table view data source

    override func numberOfSectionsInTableView(tableView: UITableView) -> Int {
        // #warning Potentially incomplete method implementation.
        return 1
    }

    override func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        // #warning Incomplete method implementation.
        // Return the number of rows in the section.
        
        return donationDictionary.count
//        return donations.count
    }

    
    override func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCellWithIdentifier("reuseIdentifier", forIndexPath: indexPath) as! UITableViewCell
        let donation = donationDictionary[indexPath.row]
        cell.textLabel?.text = String(donation.image)
        cell.detailTextLabel?.text = String(donation.description)
        
        return cell
    }

    override func tableView(tableView: UITableView, didSelectRowAtIndexPath indexPath: NSIndexPath) {
        let detailViewController = self.storyboard!.instantiateViewControllerWithIdentifier("DetailDonationViewController") as! DetailDonationViewController
        detailViewController.data = donationDictionary[indexPath.row]
        self.navigationController!.pushViewController(detailViewController, animated: true)
    }
}
