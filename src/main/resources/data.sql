insert into t_system_user (id,username,password) values(1,'hlss01','hlss01');
insert into t_system_user (id,username,password) values(2,'hlss02','hlss02');

insert into t_system_role(id,name) value(1,'ROLE_ADMIN');
insert into t_system_role(id,name) value(2,'ROLE_USER');

insert into t_system_user_roles(system_user_id,roles_id) value(1,1);
insert into t_system_user_roles(system_user_id,roles_id) value(2,2);