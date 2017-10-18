
package org.unitec.elementos1801;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author T-107
 */

@SpringUI 
@Theme("valo")
public class MIUI extends UI {
   @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout=new VerticalLayout();
        
        Label etiqueta= new Label("Aplication con mensajes");
        etiqueta.addStyleName(ValoTheme.LABEL_H1);
        layout.addComponent(etiqueta);
        setContent(layout);
        
       
    
}
