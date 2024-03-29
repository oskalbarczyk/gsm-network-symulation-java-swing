package Graphics.Panels;


import Graphics.Visualisations.VRDvisual;
import Logic.VRD;

import java.awt.event.ActionEvent;

import static Graphics.Window.VRDlist;


public class VRDpanel extends PanelTemplate {

    public VRDpanel(String title) {
        super(title);
    }


    @Override
    protected void handleAddButtonAction(ActionEvent e) {

        VRD newVRD = new VRD();
        VRDvisual newVRDvisual = new VRDvisual(newVRD);
        VRDlist.add(newVRD);
        newVRD.addRefreshListner(newVRDvisual);


        viewportView.add(newVRDvisual);
        viewportView.revalidate();
        viewportView.repaint();
        deviceScrollPane.revalidate();
        deviceScrollPane.repaint();
    }


}
