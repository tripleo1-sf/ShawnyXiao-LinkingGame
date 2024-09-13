package com.shawn.main;

import com.shawn.ui.LinkingGameFrame;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * This is a linking game.
 *
 * @author Shawn（肖小粤）
 * @version 2.1
 */
public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				LinkingGameFrame frame = new LinkingGameFrame();
				frame.setTitle("Linking Game");
				URL resource = getClass().getResource("/linkingGame.png");
				if (resource == null) {
					String message = "could not find image resource";
//                    throw new AssertionError(message);
					System.err.println(message);
					// NOTE spotbugs/idea says dubious (should have a link...)
					//  so *we* just "exit" here
					//System.exit(1);
				} else {
					frame.setIconImage(new ImageIcon(resource).getImage());
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			}
		});
	}
}