//
//  DetailDonationViewController.swift
//  
//
//  Created by Gil Felot on 11/09/15.
//
//

import UIKit

class DetailDonationViewController: UIViewController {

    var data: DonationDetail!
    
    @IBOutlet weak var image: UIImageView!
    @IBOutlet weak var desc: UILabel!
    @IBOutlet weak var slider: UISlider!
    @IBOutlet weak var obj: UILabel!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }

    override func viewWillAppear(animated: Bool) {
        super.viewWillAppear(animated)
        
        image!.image = UIImage(named: data.image)
        desc!.text = data.description
        slider!.minimumValue = 0
        slider!.maximumValue = Float(100)
        slider!.value = (data.slider as NSString).floatValue
        obj!.text = data.objectif
        
    }
    
}
