//
//  Dot.swift
//  KuraSnake
//
//  Created by Marko Matušovič on 29/04/2019.
//  Copyright © 2019 Marko Matušovič. All rights reserved.
//

import Foundation
import SpriteKit

class Dot:SKSpriteNode {
    
    var shape: SKShapeNode
    var body: SKPhysicsBody
    
    init(scene: SKScene, radius: CGFloat){
        shape = SKShapeNode(circleOfRadius: radius)
        body = SKPhysicsBody(circleOfRadius: radius)
        super.init(texture: SKTexture.init(), color: .clear, size: CGSize.init(width: radius, height: radius))
        
        shape.fillColor = .red
        shape.strokeColor = .clear
        addChild(shape)
        
        body.affectedByGravity = true
        body.mass = radius * radius * CGFloat.pi
        physicsBody = body
    }
    
    required init?(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
}
