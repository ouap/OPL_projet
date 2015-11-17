/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import database.CourseAccess;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import types.Account;
import types.Course;
import types.Instructor;
import gui.utils.GUIUtils;
import gui.types.*;

/**
 * 
 * @author Ian
 */
public class CourseSelection extends MSPanel {
    /**
     * Creates new form CourseSelection1
     */
    public CourseSelection() {
	super("Course Selection");
        initComponents();
    }
	
    /**
     * Creates new form CourseSelection1
     */
    public CourseSelection(int page, Account acct) {
    	super("Course Selection");
    	this.a = acct;
       marking = false;

    	switch (page) {
    	case 1: // Course Selection for Course Modification
    		initComponents();
    		break;
    	case 2: // Course Selection for Course Deletion
    		initComponents();

    		for (java.awt.event.ActionListener act : ok_button
    				.getActionListeners())
    			ok_button.removeActionListener(act);

    		ok_button.addActionListener(new java.awt.event.ActionListener() {
    			public void actionPerformed(java.awt.event.ActionEvent evt) {
    				ok_deleteCourse_buttonActionPerformed(evt);
    			}
    		});
    		break;
    	case 3: // Course Selection for Instructor Marking
    		initComponents();

                marking = true;
                
    		course_selection_dropdown
    		.setModel(new javax.swing.DefaultComboBoxModel(
    				database.CourseAccess.accessCourseList(a.getEmpID())));

    		for (java.awt.event.ActionListener act : ok_button
    				.getActionListeners())
    			ok_button.removeActionListener(act);
    		ok_button.addActionListener(new java.awt.event.ActionListener() {
    			public void actionPerformed(java.awt.event.ActionEvent evt) {
    				ok_markingCourse_buttonActionPerformed(evt);
    			}
    		});
    		break;
    	case 4: // Course Selection for Activity Modification
    		initComponents();

    		course_selection_dropdown
    		.setModel(new javax.swing.DefaultComboBoxModel(
    				database.CourseAccess.accessCourseList(a.getEmpID())));

    		for (java.awt.event.ActionListener act : ok_button
    				.getActionListeners())
    			ok_button.removeActionListener(act);
    		ok_button.addActionListener(new java.awt.event.ActionListener() {
    			public void actionPerformed(java.awt.event.ActionEvent evt) {
    				ok_activityManagement_buttonActionPerformed(evt);
    			}
    		});
    		break;
    	case 5: // Course Selection for Admin Grading
    		initComponents();

                marking = true;
                
    		for (java.awt.event.ActionListener act : ok_button
    				.getActionListeners())
    			ok_button.removeActionListener(act);
    		ok_button.addActionListener(new java.awt.event.ActionListener() {
    			public void actionPerformed(java.awt.event.ActionEvent evt) {
    				ok_grading_buttonActionPerformed(evt);
    			}
    		});
    		break;
    	case 6: // Course Selection for Admin Viewing
    		break;
    	case 7: // Course Selection for TA Marking
    		initComponents();
                
                marking = true;

    		course_selection_dropdown
    		.setModel(new javax.swing.DefaultComboBoxModel(
    				database.CourseAccess.accessCourseListTA(a.getEmpID())));

    		for (java.awt.event.ActionListener act : ok_button
    				.getActionListeners())
    			ok_button.removeActionListener(act);
    		ok_button.addActionListener(new java.awt.event.ActionListener() {
    			public void actionPerformed(java.awt.event.ActionEvent evt) {
    				ok_markingCourse_buttonActionPerformed(evt);
    			}
    		});
    		break;
    	}
    }

    Boolean marking = false;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        course_selection_header = new javax.swing.JPanel();
        course_selection_dropdown = new javax.swing.JComboBox();
        courses_label = new javax.swing.JLabel();
        ok_button = new javax.swing.JButton();

        course_selection_header.setBorder(javax.swing.BorderFactory.createTitledBorder("Course Selection"));
        course_selection_header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        course_selection_header.setName(""); // NOI18N

        course_selection_dropdown.setModel(new javax.swing.DefaultComboBoxModel(database.CourseAccess.accessCourseList()));
        course_selection_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_selection_dropdownActionPerformed(evt);
            }
        });

        courses_label.setText("Courses:");

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout course_selection_headerLayout = new javax.swing.GroupLayout(course_selection_header);
        course_selection_header.setLayout(course_selection_headerLayout);
        course_selection_headerLayout.setHorizontalGroup(
            course_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, course_selection_headerLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(courses_label, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(course_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(course_selection_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        course_selection_headerLayout.setVerticalGroup(
            course_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(course_selection_headerLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(course_selection_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_selection_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courses_label))
                .addGap(18, 18, 18)
                .addComponent(ok_button)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(course_selection_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(course_selection_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


	private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ok_buttonActionPerformed
		String test = course_selection_dropdown.getSelectedItem().toString();
		System.out.println(test);
		Course course = database.CourseAccess.constructCourseObject(test);
		GUIUtils.getMasterFrame(this).movePage(new CreateCourse(course));
	}// GEN-LAST:event_ok_buttonActionPerformed
	
    private void ok_activityManagement_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        String courseid = course_selection_dropdown.getSelectedItem().toString(); //needs to be changed
        Course course_choice = CourseAccess.constructCourseObject(courseid);
        if (marking)
            GUIUtils.getMasterFrame(this).movePage(new SelectActivityMatrix(course_choice));
        else    
            GUIUtils.getMasterFrame(this).movePage(new ActivityManagement(courseid, (Instructor) a));
    }//GEN-LAST:event_ok_buttonActionPerformed

	private void ok_deleteCourse_buttonActionPerformed(ActionEvent evt) {
		String toDelete = course_selection_dropdown.getSelectedItem()
				.toString();
		int check = JOptionPane.showConfirmDialog(this,
				"Delete course " + toDelete + "?",
				"", JOptionPane.YES_NO_OPTION);
		if(check == 0) {
			boolean deleted = database.CourseAccess.deleteCourse(toDelete);
			// GO BACK TO LANDING PAGE
			if(deleted)
				course_selection_dropdown.removeItem(toDelete);
			else
				JOptionPane.showMessageDialog(this, 
						"This course has activities associated with it, "
						+ "so it was not deleted.");
		}
	}
	
	private void ok_markingCourse_buttonActionPerformed(ActionEvent evt) {
		String courseID = course_selection_dropdown.getSelectedItem().toString();
		GUIUtils.getMasterFrame(this).movePage(new SelectActivityMatrix(CourseAccess.constructCourseObject(courseID)));
	}
	
	private void ok_grading_buttonActionPerformed(ActionEvent evt) {
		String courseID = course_selection_dropdown.getSelectedItem().toString();
		GUIUtils.getMasterFrame(this).movePage(new SelectActivityMatrix(CourseAccess.constructCourseObject(courseID)));
	}

	private void course_selection_dropdownActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_course_selection_dropdownActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_course_selection_dropdownActionPerformed

	private Account a;
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JComboBox course_selection_dropdown;
	private javax.swing.JPanel course_selection_header;
	private javax.swing.JLabel courses_label;
	private javax.swing.JButton ok_button;
	// End of variables declaration//GEN-END:variables
}