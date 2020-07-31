package com.example.tutorial;
import com.example.tutorial.AddressBookProtos.*;
import com.google.gson.internal.bind.util.ISO8601Utils;

import org.w3c.dom.ls.LSOutput;
import static java.lang.System.out;

import java.sql.Timestamp;
import java.util.Random;


public class  AddOnePersonWithOneSpouseRelative {
    public static void main (String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Random rand = new Random();
        int randomID = rand.nextInt();

        AddressBookProtos.AddressBook addressentry = AddressBook.newBuilder()
                .addPeople(Person.newBuilder()
                        .setLastUpdated(com.google.protobuf.Timestamp.newBuilder()
                                .setSeconds(timestamp.getTime())
                                .build())
                        .setName("Dr. Who")
                        .setEmail("Doctor@Trenzalore.dev")
                        .setId(randomID)
                        .addPhones(Person.PhoneNumber.newBuilder()
                                .setType(Person.PhoneType.MOBILE)
                                .setNumber("+10-555-222-1212")

                        )
                        .addNotes(Person.AdditionalNotes.newBuilder()
                                .addRelative(Person.AdditionalNotes.Relatives.newBuilder()
                                        .setRelationship(Person.AdditionalNotes.Relatives.RelationShipType.SPOUSE)
                                        .setRelativeName("River Song")
                                        .setDateOfBirth("Uknown")
                                        .setAnniversaryDate("End of Time")
                                        .build()
                                ).build())

                )

                .build();
        out.println(addressentry);
    }


}
