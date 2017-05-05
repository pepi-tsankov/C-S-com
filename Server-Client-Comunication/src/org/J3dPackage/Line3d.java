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
public class Line3d implements Serializable{
    public Point3d a;
    public Point3d b;
    public Line3d(Point3d a_,Point3d b_){
        a=a_;
        b=b_;
    }
}
