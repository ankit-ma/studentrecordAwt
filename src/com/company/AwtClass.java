package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AwtClass extends Frame {

    TextField rollNo;
    Label RollnoLabel;
    Label nameLabel,resultLabel,addressLabel,genderLabel,streamLabel,hostelLabel;
    TextField name;
    TextArea address, resultField;
    Button submitButton;
    String genderChoice;
    Choice stream,hostel,hostel2;

    public AwtClass(){
       Frame f = new Frame();
       f.setTitle("AWT Assignment");

       //user Text field
        rollNo = new TextField();
        rollNo.setBounds(180,100,100,30);
        f.add(rollNo);

       // Username label
       RollnoLabel = new Label();
       RollnoLabel.setText("Roll No.");
       RollnoLabel.setBounds(20,100,180,30);
       f.add(RollnoLabel);

        // name label
        nameLabel = new Label();
        nameLabel.setText("Name");
        nameLabel.setBounds(20,150,150,30);
        f.add(nameLabel);

        // name Text field
        name = new TextField();
        name.setBounds(180,150,100,30);
        f.add(name);

        //address label
        addressLabel=new Label();
        addressLabel.setText("Address");
        addressLabel.setBounds(20,200,150,30);
        f.add(addressLabel);

        //address text field
        address = new TextArea();
        address.setBounds(180,200,500,50);
        f.add(address);

        //gender label
        genderLabel=new Label();
        genderLabel.setText("Gender");
        genderLabel.setBounds(20,250,180,30);
        f.add(genderLabel);

        //check box for gender
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox male = new Checkbox("Male",cbg,false);
        male.setBounds(200,250,80,30);
        Checkbox female = new Checkbox("Female",cbg,false);
        female.setBounds(300,250,80,30);
        f.add(male);f.add(female);
        male.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                genderChoice="Male";
            }
        });

        female.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                genderChoice="Female";
            }
        });


        //stream label
        streamLabel = new Label();
        streamLabel.setText("Stream");
        streamLabel.setBounds(20,300,180,30);
        f.add(streamLabel);

        // choice box stream
        stream = new Choice();
        stream.setBounds(200,300,100,30);
        stream.add("CSE");
        stream.add("IT");
        stream.add("ECE");
        stream.add("CIVIL");
        f.add(stream);

        //hostel preference
        hostelLabel = new Label();
        hostelLabel.setText("Hostel Choice");
        hostelLabel.setBounds(20,350,180,30);
        f.add(hostelLabel);

        //hostel preference
        hostel = new Choice();
        hostel.setBounds(200,350,100,30);
        hostel.add("Banomas");
        hostel.add("APC Roy");
        hostel.add("Maidam curie");
        hostel.add("JC bose");
        f.add(hostel);

        hostel2 = new Choice();
        hostel2.setBounds(300,350,100,30);
        hostel2.add("Banomas");
        hostel2.add("APC Roy");
        hostel2.add("Maidam curie");
        hostel2.add("JC bose");
        f.add(hostel2);

        // result label
        resultLabel = new Label();
        resultLabel.setText("Result");
        resultLabel.setBounds(20,600,80,30);

        //popupfield
        resultField = new TextArea();
        resultField.setBounds(100,600,500,200);


        // Submit button
        submitButton = new Button();
        submitButton.setLabel("Submit");
        submitButton.setBounds(50,500,100,30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.add(resultLabel);
                f.add(resultField);
                String temp = "Roll No. : "+rollNo.getText() + "\nName : "+name.getText()+"\nAddress: "+address.getText()+"\nGender :"+genderChoice
                        +"\nStream: "+stream.getItem(stream.getSelectedIndex())+"\nHostel Choice : "+hostel.getItem(hostel.getSelectedIndex());
                resultField.setText(temp);

            }
        });
        f.add(submitButton);

       // frame setup
       f.setSize(700,1000);
       f.setLayout(null);
       f.setVisible(true);

    }


}
