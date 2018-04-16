/**
 * DataTables
 */
var datatable = null,idList=[];

$(function() {
	datatable = $('.table-sort').DataTable({
		/*order: [
			[0, 'desc']
		],*/
		ajax: {
			url: contextPath + "/Student/getPageList",
			type: 'post',
			data: function(d) {
				d.search = $('#search').val();
			}
		},
		columns: [{
			data: "xxid"
		}, {
			data: "xxmc"
		}, {
			data: "bj",
			defaultContent: ""
		}, {
			data: "xm",
			defaultContent: ""
		}, {
			data: "kh",
			defaultContent: ""
		}, {
			data: "xjh",
			defaultContent: ""
		}, {
			data: "nj",
			defaultContent: ""
		}, {
			data: null
		}],
		columnDefs: [{
			targets: [0],
			orderable:false,
			render: function(data, type, row, meta) {
				return '<input id="input-' + data + '" type="checkbox" name="single"><label for="input-' + data + '"></label>';
			}  
		},{
			targets: [7],
			orderable:false,
			responsivePriority: 1,
			render: function(data, type, row, meta) {
				var btns = new Array('edit','del');
				return getDTOperateBtn(btns, row.id, 'scrap-add.jsp', null, '/scrap/del/', reloadTable);
			}
		}]
	});
	
	});

/**
 * 刷新DT
 */
function reloadTable() {
	datatable.ajax.reload(null, false);
}

/**
 * 获取datatables选中行的ID
 */
function getDTSelect() {
	var lines = datatable.rows('.selected').data();
	for (var i = 0; i < lines.length; i++) {
		idList.push(lines[i].id);
	}
	return idList;
}