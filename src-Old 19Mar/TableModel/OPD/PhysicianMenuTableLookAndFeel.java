package TableModel.OPD;

import BO.Hospital.PatientNotes;
//import BO.OPD.PhysicianMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class PhysicianMenuTableLookAndFeel {

    List listConsultantPatients = new ArrayList();

    public void setJTableEnvironment(JTable table, List consultantPatients) {
        this.listConsultantPatients = consultantPatients;
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
        table.getTableHeader().setBackground(Color.LIGHT_GRAY);
        table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 15));
        table.getTableHeader().setReorderingAllowed(false);
        table.setDefaultRenderer(Object.class, new AlternateTableRowColorRenderer());
    }

    class AlternateTableRowColorRenderer extends DefaultTableCellRenderer {

        Color currentColor = Color.WHITE;

        public AlternateTableRowColorRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
//            if (row % 2 == 0) {
//                currentColor = Color.LIGHT_GRAY;
//            } else {
//                currentColor = Color.LIGHT_GRAY;
//            }
            if (isSelected) {
                super.setForeground(table.getSelectionForeground());
                super.setBackground(table.getSelectionBackground());
            } else {
                super.setForeground(Color.black);
                super.setBackground(currentColor);
            }
            setFont(table.getFont());
            setValue(value);
            try {
//                PhysicianMenu data = (PhysicianMenu) listConsultantPatients.get(row);
//                if (!data.getAdmissonNo().isEmpty()) {
//                    setForeground(Color.ORANGE);
//                    setFont(new java.awt.Font("Arial", Font.BOLD, 12));
//                    table.getCellRenderer(0, 0);
//                    table.repaint();
//                }
            } catch (Exception ex) {

            }
            return this;
        }
    }
}
