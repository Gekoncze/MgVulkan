
package cz.mg.transformator.vulkan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class EnumGenerator extends javax.swing.JFrame {
    public EnumGenerator() {
        initComponents();
    }

    private void generateSimple(){
        throw new UnsupportedOperationException();
    }
    
    /*
        public class VkPhysicalDeviceType extends Structure {
            public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
            public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
            public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
            public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
            public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;
    */
    private void generateComplex(){
        String input = jTextAreaInput.getText();
        String output = readAll();
        output = output.replace("OLD_NAME", genOldName(input));
        output = output.replace("NEW_NAME", genNewName(input));
        output = output.replace("VALUES", genValues(input));
        output = output.replace("FROM_CASES", genFromCases(input));
        output = output.replace("TO_CASES", genToCases(input));
        jTextAreaOutput.setText(output);
    }
    
    private String genOldName(String input){
        String[] lines = input.split("\\n");
        return lines[0].trim().split(" ")[2];
    }
    
    private String genNewName(String input){
        return genOldName(input).replace("Vk", "Vulkan");
    }
    
    /*
        public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    
        OTHER,
    */
    private String genValues(String input){
        String oldStructureName = genOldName(input);
        String[] lines = input.split("\\n");
        String values = "";
        for(int i = 1; i < lines.length; i++){
            String[] parts = lines[i].trim().split(" ");
            String oldPropertyName = parts[4];
            String newPropertyName = genNewPropertyName(oldPropertyName, oldStructureName);
            values = values + "    " + newPropertyName + ",\n";
        }
        values = replaceLast(values, ",", ";");
        values = replaceLast(values, "\n", "");
        return values;
    }
    
    /*
        public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    
        case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER: return OTHER;
    */
    private String genFromCases(String input){
        String oldStructureName = genOldName(input);
        String[] lines = input.split("\\n");
        String values = "";
        for(int i = 1; i < lines.length; i++){
            String[] parts = lines[i].trim().split(" ");
            String oldPropertyName = parts[4];
            String newPropertyName = genNewPropertyName(oldPropertyName, oldStructureName);
            values = values + "            case " + oldStructureName + "." + oldPropertyName + ": return " + newPropertyName + ";\n";
        }
        values = replaceLast(values, "\n", "");
        return values;
    }

    /*
        public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;

        case OTHER: return new VkPhysicalDeviceType(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER);
    */
    private String genToCases(String input){
        String oldStructureName = genOldName(input);
        String[] lines = input.split("\\n");
        String values = "";
        for(int i = 1; i < lines.length; i++){
            String[] parts = lines[i].trim().split(" ");
            String oldPropertyName = parts[4];
            String newPropertyName = genNewPropertyName(oldPropertyName, oldStructureName);
            values = values + "            case " + newPropertyName + ": return new " + oldStructureName + "(" + oldStructureName + "." + oldPropertyName + ");\n";
        }
        values = replaceLast(values, "\n", "");
        return values;
    }
    
    /*
        VK_PHYSICAL_DEVICE_TYPE_OTHER    <- old name
        VkPhysicalDeviceType             <- old
        Vk Physical Device Type *****    <- *cut size
    
                                OTHER    <- result
    */
    private static String genNewPropertyName(String oldName, String old){
        int cutSize;
        if(old.equals("VkResult")){
            cutSize = 3;
        } else {
            boolean ext = old.endsWith("EXT");
            if(ext) old = old.replace("EXT", "");
            cutSize = capitalCount(old) + old.length();
        }
        String result = oldName.substring(cutSize);
        if(result.endsWith("_EXT")) result = replaceLast(result, "_EXT", "");
        if(result.endsWith("_KHR")) result = replaceLast(result, "_KHR", "");
        return result;
    }
    
    private static int capitalCount(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) count++;
        }
        return count;
    }
    
    private String readAll(){
        InputStream stream = getClass().getResourceAsStream("EnumSample.txt");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(stream))){
            String line;
            String content = "";
            while((line = reader.readLine()) != null){
                content = content + line + "\n";
            }
            return content;
        } catch (IOException ex) {
            throw new RuntimeException();
        }
    }
    
    /*
        VK_SAMPLE_COUNT_1_BIT
    
        isSampleCount1Bit
    */
    
    private String sanitizeName(String name){
        String[] parts = name.split("_");
        String s = "";
        for(String part : parts) s += capitalFirstOnly(part);
        return s;
    }
    
    private String capitalFirst(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
    
    private String capitalFirstOnly(String name){
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
    
    private static String replaceLast(String s, String what, String with){
        s = reverse(s);
        what = reverse(what);
        with = reverse(with);
        s = s.replaceFirst(what, with);
        return reverse(s);
    }
    
    private static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInput = new javax.swing.JTextArea();
        jButtonSimple = new javax.swing.JButton();
        jButtonComplex = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaInput.setColumns(20);
        jTextAreaInput.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInput);

        jButtonSimple.setText("simple");
        jButtonSimple.setEnabled(false);
        jButtonSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpleActionPerformed(evt);
            }
        });

        jButtonComplex.setText("complex");
        jButtonComplex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplexActionPerformed(evt);
            }
        });

        jTextAreaOutput.setColumns(20);
        jTextAreaOutput.setRows(5);
        jScrollPane2.setViewportView(jTextAreaOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonComplex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSimple)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimple)
                    .addComponent(jButtonComplex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpleActionPerformed
        generateSimple();
    }//GEN-LAST:event_jButtonSimpleActionPerformed

    private void jButtonComplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplexActionPerformed
        generateComplex();
    }//GEN-LAST:event_jButtonComplexActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnumGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnumGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnumGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnumGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnumGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComplex;
    private javax.swing.JButton jButtonSimple;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaInput;
    private javax.swing.JTextArea jTextAreaOutput;
    // End of variables declaration//GEN-END:variables
}
