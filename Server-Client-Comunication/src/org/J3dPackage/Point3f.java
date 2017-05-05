/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.J3dPackage;

import java.io.Serializable;

/**
 *
 * @author Userr
 */
public class Point3f implements Serializable{
    public float x;
    public float y;
    public float z;
    Point3f(double x,double y,double z){
        this.x=(float)x;
        this.y=(float)y;
        this.z=(float)z;
    }
}
