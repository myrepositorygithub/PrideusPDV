/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iskuertow.prideus.view;

import br.com.iskuertow.prideus.basic.adapter.InitAdapter;
import br.com.iskuertow.prideus.basic.task.AppConfig;
import com.openbravo.pos.forms.JRootFrame;
import com.openbravo.pos.forms.JRootKiosk;

/**
 *
 * @author Thiago Dias Gomes
 */
public class StartPOS extends InitAdapter {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                StartPOS oS = new StartPOS();
                oS.loadConfig(args);
            }
        });
    }

    @Override
    public boolean loadConfig(String[] args) {
        AppConfig config = new AppConfig(args);
        config.load();
        
        return true;
    }

}