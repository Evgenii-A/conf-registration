insert into public.section_entity(id, capacity, name) values (1, 888, 'section1');
insert into public.section_entity(id, capacity, name) values (2, 999, 'section2');
insert into public.section_entity(id, capacity, name) values (3, 777, 'section3');

insert into public.participant_entity(participant_id, birth_date, date_of_participation, first_name, last_name,
                                    middle_name, login, password, section_id)
values (1, '2000-10-10', '2000-01-01', 'Evgenii', 'Anishchenko',
        'Petrovich', 'login', 'password', 1);

insert into public.lecturer_entity(id, birth_date, email, first_name, last_name,
                                   middle_name, login, password, performance_time, topic, section_id)
values (1, '2000-01-01', 'email', 'Andy', 'Anderson', 'ooo',
        'login', 'password', '2021-03-26 12:09:23.000000', 'topic', 1);


