select
	id,
	del_flag,
	create_time,
	update_time,
	asset_name,
	asset_status,
	asset_code,
	service_type,
	asset_introduction,
	dept_dir_id,
	industry_dir_id,
	theme_dir_id,
	remarks
from
	bd_am_asset_list
where
	update_time > :sql_last_value