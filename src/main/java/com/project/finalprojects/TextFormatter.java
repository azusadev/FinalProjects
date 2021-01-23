/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.finalprojects;

import java.awt.Graphics;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import javax.swing.AbstractButton;

/**
 *
 * @author reden
 */
public class TextFormatter {
    private static final String STR_NEWLINE = "<br />";
    private static final FontRenderContext fontRenderContext = new FontRenderContext(new AffineTransform(), true, true);

    private static String getWrappedText(Graphics graphics, AbstractButton button, String str) {
        if( str != null ) {
            String text = str.replaceAll("<html><center>", "").replaceAll("</center></html>", "");
            int width = button.getWidth();
            Rectangle2D stringBounds = button.getFont().getStringBounds(text, fontRenderContext);
            if ( !str.contains(STR_NEWLINE) && (width-5) < ((Double)stringBounds.getWidth()).intValue()) {
                String newStr;
                if( str.contains(" ") ) {
                    int lastIndex = str.lastIndexOf(" ");
                    newStr = str.substring(0, lastIndex)+STR_NEWLINE+str.substring(lastIndex);
                } else {
                    int strLength = ((str.length()/3)*2);
                    newStr = str.substring(0, strLength)+STR_NEWLINE+str.substring(strLength);
                }
                return newStr;
            }
        }
        return str;
    }
}
