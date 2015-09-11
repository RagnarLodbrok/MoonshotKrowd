//
//  DonationDetail.swift
//  Krowd
//
//  Created by Gil Felot on 11/09/15.
//  Copyright (c) 2015 Gil Felot. All rights reserved.
//

import Foundation
import UIKit


struct DonationDetail {
    let image: String
    let description: String
    let slider: String
    let objectif: String
    
    static let ImageName = "ImageName"
    static let Desc = "Desc"
    static let SliderValue = "SliderValue"
    static let Obj = "Obj"
    
    init(dictionary: [String:String]) {
        self.image = dictionary[DonationDetail.ImageName]!
        self.description = dictionary[DonationDetail.Desc]!
        self.slider = dictionary[DonationDetail.SliderValue]!
        self.objectif = dictionary[DonationDetail.Obj]!
    }
}

extension DonationDetail{
    static var allDonations: [DonationDetail] {
        var donationArray = [DonationDetail]()
        
        for d in DonationDetail.localData() {
            donationArray.append(DonationDetail(dictionary: d))
        }
        
        return donationArray
    }
    
    static func localData() -> [[String:String]] {
        return [
            [DonationDetail.ImageName : "Alzheimer", DonationDetail.Desc : "Je me souviens plus quoi écrire... Alzheimer style !", DonationDetail.SliderValue : "30", DonationDetail.Obj : "3.000 / 10.000 euros"],
            [DonationDetail.ImageName : "Alimentaire", DonationDetail.Desc : "J'ai faim bordel ! - Mathis", DonationDetail.SliderValue : "80", DonationDetail.Obj : "16.000 / 20.000 euros"],
            [DonationDetail.ImageName : "Creches", DonationDetail.Desc : "Les enfants c'est sympa à faire !", DonationDetail.SliderValue : "10", DonationDetail.Obj : "1.000 / 10.000 euros"],
            [DonationDetail.ImageName : "Oasis", DonationDetail.Desc : "Une Oasis avec un bon KM sans tomate siyouplai !", DonationDetail.SliderValue : "75", DonationDetail.Obj : "7.500 / 10.000 euros"]
        ]
    }
}