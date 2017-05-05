/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Userr
 */
public class MessageObject implements Serializable{
    public Vector<Object> object_;
    public Vector<Class> class_;
    public Vector<String> sideMessage;
    public MessageObject(Vector<Class> c,Vector<Object> o,Vector<String> sidemessage){
        class_=c;
        object_=o;
        sideMessage=sidemessage;
    }
}
