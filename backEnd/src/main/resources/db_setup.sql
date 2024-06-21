INSERT INTO captain (licence, name, experience, boat_id) values ("all", "BlackBeard", 2, null);
INSERT INTO captain (licence, name, experience, boat_id) values ("small", "Jean", 6, null);

INSERT INTO hut (name, price, location) values ("Tasty Huitre", 6.55, "11,9");
INSERT INTO hut (name, price, location) values ("shuck o'clock", 7.62, "24,11");
--
INSERT INTO boat (name, model, capacity, speed, captain_id, hut_id) values ("Kappa", "Yamaha", 30, 2, 2, 1);
INSERT INTO boat (name, model, capacity, speed, captain_id, hut_id) values ("Tau", "mitsubishi", 10, 5, 1, 2);
--
UPDATE captain set boat_id = 1 WHERE id = 1;
UPDATE captain set boat_id = 2 WHERE id = 2;


INSERT INTO bed (location, age, basket_count) values ("5,14", 15, 100);
INSERT INTO bed (location, age, basket_count) values ("10,23", 3, 40);
INSERT INTO bed (location, age, basket_count) values ("11,22", 15, 100);
INSERT INTO bed (location, age, basket_count) values ("19,16", 3, 40);
INSERT INTO bed (location, age, basket_count) values ("19,17", 15, 100);
INSERT INTO bed (location, age, basket_count) values ("21,23", 3, 40);
INSERT INTO bed (location, age, basket_count) values ("22,23", 15, 100);


INSERT INTO bed_boats (bed_id, boats_id) values (1, 1);
INSERT INTO bed_boats (bed_id, boats_id) values (1, 2);
INSERT INTO bed_boats (bed_id, boats_id) values (2, 1);
INSERT INTO bed_boats (bed_id, boats_id) values (2, 2);


INSERT INTO boat_beds (beds_id, boat_id) values (1, 1);
INSERT INTO boat_beds (beds_id, boat_id) values (1, 2);
INSERT INTO boat_beds (beds_id, boat_id) values (2, 1);
INSERT INTO boat_beds (beds_id, boat_id) values (2, 2);
--
INSERT INTO hut_boats (hut_id, boats_id) values (1, 1);
INSERT INTO hut_boats (hut_id, boats_id) values (2, 2);



INSERT INTO map (name, map, height, width) values ("Yarrin", "++++++........................+++++++.......................++++++........................++++++........................+++++++.......................+++++++.......................++++++++......................+++++++.......................++++++++......................++++CC+++.................++++++++CC+++.................++++.++++++++.................+++++.+++++++..................+++++.++++++...................+++++.+++++....................++++.........................+++++++++++...................+++++++++++.....................+++++++++.....................+++++++++...................++++++++++++.................++++++++++++++...............+++++^+^+++++++..............+++++^^^^^++++++..............+++++^^^++^++++++...........+++++++^^^^++++++++...........++++##+^^^^^^+++++++........+++++####^^^^^+^+++++++++++++++++######^^^++^+^+++#++##+#+##++#######^^^^^++^######################", 30, 30);
