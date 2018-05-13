drop table if exists qrtzb_bkjk_busi;

drop table if exists qrtzb_bkjk_feature;

drop table if exists qrtzb_bkjk_task;

drop table if exists qrtzb_bkjk_task_instance;

/*==============================================================*/
/* table: qrtzb_bkjk_busi                                       */
/*==============================================================*/
create table qrtzb_bkjk_busi
(
  busi_code            varchar(4) not null comment '业务系统编码',
  busi_name            varchar(256) not null comment '业务系统名称',
  dept_name            varchar(64) comment '所属部门',
  description          varchar(1024) comment '功能描述',
  primary key (busi_code)
);

alter table qrtzb_bkjk_busi comment '业务系统定义';

/*==============================================================*/
/* table: qrtzb_bkjk_feature                                    */
/*==============================================================*/
create table qrtzb_bkjk_feature
(
  feature_code         varchar(4) not null comment '任务功能编码',
  busi_code            varchar(4) not null comment '业务系统编码',
  feature_name         varchar(256) not null comment '任务功能名称',
  description          varchar(1024) comment '功能描述',
  primary key (feature_code)
);

alter table qrtzb_bkjk_feature comment '业务功能定义';

/*==============================================================*/
/* table: qrtzb_bkjk_task                                       */
/*==============================================================*/
create table qrtzb_bkjk_task
(
  id                   bigint not null auto_increment comment '主键',
  busi_code            varchar(4) not null comment '业务系统编码',
  feature_code         varchar(4) not null comment '功能编码',
  task_name            varchar(256) not null comment '任务名称',
  description          varchar(1024) comment '任务描述',
  status               smallint(4) comment '任务状态  1: 停止状态  2 调度中',
  quartz_cron          varchar(32) not null comment 'quartz调度cron',
  extra_json           varchar(1024) comment 'feature额外参数',
  created_date         datetime default current_timestamp comment '创建时间',
  updated_date         datetime default current_timestamp on update current_timestamp comment '修改时间',
  primary key (id),
  unique key ak_busi_feature_code (busi_code, feature_code)
);

alter table qrtzb_bkjk_task comment '调度任务定义';

/*==============================================================*/
/* table: qrtzb_bkjk_task_instance                              */
/*==============================================================*/
create table qrtzb_bkjk_task_instance
(
  id                   varchar(20) not null comment '主键',
  task_id              bigint not null comment '任务id',
  busi_code            varchar(4) not null comment '业务系统编码',
  feature_code         varchar(4) not null comment '功能编码',
  status               smallint(4) comment '任务状态  2 发送成功 3 发送失败  4 执行成功 5 执行失败',
  message_send_time    datetime comment '消息发送时间',
  message_received_time datetime comment '消息接收时间',
  taking_time          int comment '任务花费时间',
  ip                   varchar(32) comment '执行任务机器ip',
  created_date         datetime default current_timestamp comment '创建时间',
  updated_date         datetime default current_timestamp on update current_timestamp comment '修改时间',
  primary key (id),
  key ak_instance_created_date (created_date)
);

alter table qrtzb_bkjk_task_instance comment '调度任务定义实例日志';

alter table qrtzb_bkjk_feature add constraint fk_busi_feature foreign key (busi_code)
references qrtzb_bkjk_busi (busi_code) on delete restrict on update restrict;

alter table qrtzb_bkjk_task add constraint fk_busi_task foreign key (busi_code)
references qrtzb_bkjk_busi (busi_code) on delete restrict on update restrict;

alter table qrtzb_bkjk_task add constraint fk_feature_task foreign key (feature_code)
references qrtzb_bkjk_feature (feature_code) on delete restrict on update restrict;

alter table qrtzb_bkjk_task_instance add constraint fk_task_instance foreign key (task_id)
references qrtzb_bkjk_task (id) on delete restrict on update restrict;
