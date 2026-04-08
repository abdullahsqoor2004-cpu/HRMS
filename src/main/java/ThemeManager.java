/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ThemeManager {

    static boolean isDark;
    public static void applyTheme(java.awt.Container container) {
        java.awt.Color bg = isDark ? new java.awt.Color(60, 60, 60) : java.awt.Color.WHITE;
        java.awt.Color fg = isDark ? java.awt.Color.WHITE : java.awt.Color.BLACK;
        
        container.setBackground(bg);
        for (java.awt.Component c : container.getComponents()) {
            if (c instanceof javax.swing.JLabel) {
                c.setForeground(fg);
            } else if (c instanceof javax.swing.JPanel) {
                c.setBackground(bg);
                applyTheme((java.awt.Container) c); // recursive
            }
            // الأزرار تفضل لونهم الطبيعي - ما نلمسهم
        }
    }
}
